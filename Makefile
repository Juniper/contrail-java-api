SRC_VER := $(shell cat ./../controller/src/base/version.info)
BUILDTIME := $(shell date -u +%m%d%Y)

ifdef SRC_VER
BUILDTAG = $(SRC_VER)-$(BUILDTIME)
else
BUILDTAG = $(BUILDTIME)
endif


all:
	$(eval BUILDDIR=./../build/java-api)
	mkdir -p ${BUILDDIR}
	cp -ar * ${BUILDDIR}
	cp -ar ../controller ../build/
	cp -ar ../generateds ../build/
	(cd ${BUILDDIR}; mvn install)
	#(cd ${BUILDDIR}; fakeroot debian/rules clean)
	#(cd ${BUILDDIR}; fakeroot debian/rules binary)
	(cd ${BUILDDIR}; debuild -i -us -uc -b)
	@echo "Wrote: ${BUILDDIR}/../libcontrail-java-api_${BUILDTAG}_all.deb"

clean:
	$(eval BUILDDIR=./../build/java-api)
	(cd ${BUILDDIR}; mvn clean)
	rm -rf ${BUILDDIR}/../libcontrail-java-api*.*
	rm -rf ${BUILDDIR}/*

