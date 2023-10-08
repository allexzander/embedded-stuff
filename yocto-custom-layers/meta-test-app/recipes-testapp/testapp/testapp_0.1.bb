SUMMARY = "Test app for deployment"
DESCRIPTION = "Just a test app for embedded Linux"
SECTION="examples"
LICENSE = "CLOSED"

SRC_URI = "file://testapp.cpp"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}"

TARGET_CC_ARCH += "${LDFLAGS}"

do_compile () {
    ${CXX} testapp.cpp -o testapp
}

do_install () {
    install -d ${D}${bindir}
    install -m 0775 testapp ${D}${bindir}/
}
