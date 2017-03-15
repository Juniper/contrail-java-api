//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;

import net.juniper.contrail.api.ApiObjectBase;
import net.juniper.contrail.api.ApiPropertyBase;
import net.juniper.contrail.api.ObjectReference;

public class PhysicalRouter extends ApiObjectBase {
    private String physical_router_management_ip;
    private String physical_router_dataplane_ip;
    private String physical_router_vendor_name;
    private String physical_router_product_name;
    private boolean physical_router_vnc_managed;
    private UserCredentials physical_router_user_credentials;
    private SNMPCredentials physical_router_snmp_credentials;
    private JunosServicePorts physical_router_junos_service_ports;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_router_refs;
    private List<ObjectReference<ApiPropertyBase>> bgp_router_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;
    private List<ObjectReference<ApiPropertyBase>> physical_interfaces;
    private List<ObjectReference<ApiPropertyBase>> logical_interfaces;
    private transient List<ObjectReference<ApiPropertyBase>> instance_ip_back_refs;

    @Override
    public String getObjectType() {
        return "physical-router";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-system-config";
    }
    
    public String getManagementIp() {
        return physical_router_management_ip;
    }
    
    public void setManagementIp(String physical_router_management_ip) {
        this.physical_router_management_ip = physical_router_management_ip;
    }
    
    
    public String getDataplaneIp() {
        return physical_router_dataplane_ip;
    }
    
    public void setDataplaneIp(String physical_router_dataplane_ip) {
        this.physical_router_dataplane_ip = physical_router_dataplane_ip;
    }
    
    
    public String getVendorName() {
        return physical_router_vendor_name;
    }
    
    public void setVendorName(String physical_router_vendor_name) {
        this.physical_router_vendor_name = physical_router_vendor_name;
    }
    
    
    public String getProductName() {
        return physical_router_product_name;
    }
    
    public void setProductName(String physical_router_product_name) {
        this.physical_router_product_name = physical_router_product_name;
    }
    
    
    public boolean getVncManaged() {
        return physical_router_vnc_managed;
    }
    
    public void setVncManaged(boolean physical_router_vnc_managed) {
        this.physical_router_vnc_managed = physical_router_vnc_managed;
    }
    
    
    public UserCredentials getUserCredentials() {
        return physical_router_user_credentials;
    }
    
    public void setUserCredentials(UserCredentials physical_router_user_credentials) {
        this.physical_router_user_credentials = physical_router_user_credentials;
    }
    
    
    public SNMPCredentials getSnmpCredentials() {
        return physical_router_snmp_credentials;
    }
    
    public void setSnmpCredentials(SNMPCredentials physical_router_snmp_credentials) {
        this.physical_router_snmp_credentials = physical_router_snmp_credentials;
    }
    
    
    public JunosServicePorts getJunosServicePorts() {
        return physical_router_junos_service_ports;
    }
    
    public void setJunosServicePorts(JunosServicePorts physical_router_junos_service_ports) {
        this.physical_router_junos_service_ports = physical_router_junos_service_ports;
    }
    
    
    public IdPermsType getIdPerms() {
        return id_perms;
    }
    
    public void setIdPerms(IdPermsType id_perms) {
        this.id_perms = id_perms;
    }
    
    
    public PermType2 getPerms2() {
        return perms2;
    }
    
    public void setPerms2(PermType2 perms2) {
        this.perms2 = perms2;
    }
    
    
    public KeyValuePairs getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(KeyValuePairs annotations) {
        this.annotations = annotations;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualRouter() {
        return virtual_router_refs;
    }

    public void setVirtualRouter(VirtualRouter obj) {
        virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualRouter(VirtualRouter obj) {
        if (virtual_router_refs == null) {
            virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualRouter() {
        if (virtual_router_refs != null) {
            virtual_router_refs.clear();
            return;
        }
        virtual_router_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getBgpRouter() {
        return bgp_router_refs;
    }

    public void setBgpRouter(BgpRouter obj) {
        bgp_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        bgp_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addBgpRouter(BgpRouter obj) {
        if (bgp_router_refs == null) {
            bgp_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        bgp_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearBgpRouter() {
        if (bgp_router_refs != null) {
            bgp_router_refs.clear();
            return;
        }
        bgp_router_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetwork() {
        return virtual_network_refs;
    }

    public void setVirtualNetwork(VirtualNetwork obj) {
        virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualNetwork(VirtualNetwork obj) {
        if (virtual_network_refs == null) {
            virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualNetwork() {
        if (virtual_network_refs != null) {
            virtual_network_refs.clear();
            return;
        }
        virtual_network_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalInterfaces() {
        return physical_interfaces;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalInterfaces() {
        return logical_interfaces;
    }

    public List<ObjectReference<ApiPropertyBase>> getInstanceIpBackRefs() {
        return instance_ip_back_refs;
    }
}