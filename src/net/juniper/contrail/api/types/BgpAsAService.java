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

public class BgpAsAService extends ApiObjectBase {
    private Integer autonomous_system;
    private String bgpaas_ip_address;
    private String bgpaas_session_attributes;
    private boolean bgpaas_ipv4_mapped_ipv6_nexthop;
    private boolean bgpaas_suppress_route_advertisement;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;

    @Override
    public String getObjectType() {
        return "bgp-as-a-service";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public Integer getAutonomousSystem() {
        return autonomous_system;
    }
    
    public void setAutonomousSystem(Integer autonomous_system) {
        this.autonomous_system = autonomous_system;
    }
    
    
    public String getBgpaasIpAddress() {
        return bgpaas_ip_address;
    }
    
    public void setBgpaasIpAddress(String bgpaas_ip_address) {
        this.bgpaas_ip_address = bgpaas_ip_address;
    }
    
    
    public String getBgpaasSessionAttributes() {
        return bgpaas_session_attributes;
    }
    
    public void setBgpaasSessionAttributes(String bgpaas_session_attributes) {
        this.bgpaas_session_attributes = bgpaas_session_attributes;
    }
    
    
    public boolean getBgpaasIpv4MappedIpv6Nexthop() {
        return bgpaas_ipv4_mapped_ipv6_nexthop;
    }
    
    public void setBgpaasIpv4MappedIpv6Nexthop(boolean bgpaas_ipv4_mapped_ipv6_nexthop) {
        this.bgpaas_ipv4_mapped_ipv6_nexthop = bgpaas_ipv4_mapped_ipv6_nexthop;
    }
    
    
    public boolean getBgpaasSuppressRouteAdvertisement() {
        return bgpaas_suppress_route_advertisement;
    }
    
    public void setBgpaasSuppressRouteAdvertisement(boolean bgpaas_suppress_route_advertisement) {
        this.bgpaas_suppress_route_advertisement = bgpaas_suppress_route_advertisement;
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
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterface() {
        return virtual_machine_interface_refs;
    }

    public void setVirtualMachineInterface(VirtualMachineInterface obj) {
        virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualMachineInterface(VirtualMachineInterface obj) {
        if (virtual_machine_interface_refs == null) {
            virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualMachineInterface() {
        if (virtual_machine_interface_refs != null) {
            virtual_machine_interface_refs.clear();
            return;
        }
        virtual_machine_interface_refs = null;
    }
}