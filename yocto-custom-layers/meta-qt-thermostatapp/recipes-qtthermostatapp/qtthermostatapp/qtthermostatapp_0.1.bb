SUMMARY = "Qt Simple Application Recipe"
AUTHOR = "Alex Zolotov"
DESCRIPTION = "This recipe builds a Qt project for a simple application."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase qtquickcontrols qtquickcontrols2 qtgraphicaleffects-qmlplugins"


SRC_URI = "file://CMakeLists.txt \
           file://BottomSidebarButton.qml \
           file://BottomSidebar.qml \
           file://CircularSliderHandle.qml \
           file://CircularSlider.qml \
           file://main.cpp \
           file://main.qml \
           file://OnOffToggle.qml \
           file://qml.qrc \
           file://RightSidebar.qml \
           file://SidebarButton.qml \
           file://TemperatureDisplay.qml \
           file://TemperatureLevelStatus.qml \
           file://TemperatureStatus.qml \
           file://TimeAndWeather.qml \
           file://TrackCanvas.qml \
           file://Utility.qml \
           file://icons/"

SRCREV = "${AUTOREV}"

S = "${WORKDIR}"

do_install:append () {
    install -d ${D}${bindir}
    install -m 0755 ThermostatDemo ${D}${bindir}/
}

FILES_${PN} += "${bindir}/ThermostatDemo"

inherit cmake
inherit cmake_qt5
