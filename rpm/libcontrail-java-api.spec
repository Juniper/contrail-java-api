%if 0%{?_buildTag:1}
%define         _relstr      %{_buildTag}
%else
%define         _relstr      %(date -u +%y%m%d%H%M)
%endif
%{echo: "Building release %{_relstr}\n"}
%if 0%{?_srcVer:1}
%define         _verstr      %{_srcVer}
%else
%define         _verstr      1
%endif

Release: %{_relstr}%{?dist}
Summary: Contrail java api %{?_gitVer}
Name:    libcontrail-java-api
Version:  %{_verstr}
Group:   Applications/System
License: Commercial
URL:     http://www.juniper.net/
Vendor:  Juniper Networks Inc

Requires: java-1.7.0-openjdk

%{echo: "Build dir %{_topdir}\n"}
%description
Contrail VNC API Java Library.

%build

%install
echo %{_builddir}
echo %{buildroot}
echo ""

mkdir -p %{buildroot}/usr/share/contrail-vcenter-plugin
install -p -m 755 ../target/juniper-contrail-api-3.0-SNAPSHOT.jar %{buildroot}/usr/share/contrail-vcenter-plugin/juniper-contrail-api-3.0-SNAPSHOT.jar
pushd %{buildroot}
ln -s /usr/share/contrail-vcenter-plugin/juniper-contrail-api-3.0-SNAPSHOT.jar  usr/share/contrail-vcenter-plugin/juniper-contrail-api.jar
popd

%files
%defattr(-, root, root)
/usr/share/*

%changelog
* Tue Mar 6 2018 <ryadav@juniper.net>
- Initial build.

