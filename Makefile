SRC_VER ?= $(shell cat ./../controller/src/base/version.info)
BUILDNUM ?= $(shell date -u +%m%d%Y)
export BUILDTAG ?= $(SRC_VER)-$(BUILDNUM)

build:
	$(eval BUILDDIR=./../build/java-api)
	mkdir -p ${BUILDDIR}
	cp -ar * ${BUILDDIR}
	cp -ar ../src/contrail-api-client ../build/
	cp -ar ../tools/generateds ../build/
	(cd ${BUILDDIR}; mvn install)

deb: build
	(cd ${BUILDDIR}; debuild --preserve-envvar=BUILDTAG -i -us -uc -b)
	@echo "Wrote: ${BUILDDIR}/../libcontrail-java-api_${BUILDTAG}_all.deb"

rpm: build
	$(eval BUILDDIR=$(realpath ./../build/java-api))
	cp rpm/libcontrail-java-api.spec ${BUILDDIR}
	mkdir -p ${BUILDDIR}/{BUILD,RPMS,SOURCES,SPECS,SRPMS,TOOLS}
	rpmbuild -bb --define "_topdir ${BUILDDIR}" --define "_buildTag $(BUILDNUM)" --define "_srcVer $(SRC_VER)" rpm/libcontrail-java-api.spec


clean:
	$(eval BUILDDIR=./../build/java-api)
	(cd ${BUILDDIR}; mvn clean)
	rm -rf ${BUILDDIR}/../libcontrail-java-api*.*
	rm -rf ${BUILDDIR}/*

