SUMMARY = "Qt Simple Application Recipe"
AUTHOR = "Alex Zolotov"
DESCRIPTION = "This recipe builds a Qt project for a simple application."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS += "qtbase qtquickcontrols2"

SRC_URI = "file://qtapptest.cpp \
           file://qtapptest.pro \
           "

SRCREV = "${AUTOREV}"

S = "${WORKDIR}"

do_install:append () {
    install -d ${D}${bindir}
    install -m 0755 qtapptest ${D}${bindir}/
}

FILES_${PN} += "${bindir}/qtapptest"

inherit qmake5