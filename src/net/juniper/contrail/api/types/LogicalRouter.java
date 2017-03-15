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

public class LogicalRouter extends ApiObjectBase {
    private RouteTargetList configured_route_target_list;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
    private List<ObjectReference<ApiPropertyBase>> route_target_refs;
    private List<ObjectReference<ApiPropertyBase>> route_table_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;
    private List<ObjectReference<ApiPropertyBase>> service_instance_refs;
    private List<ObjectReference<ApiPropertyBase>> bgpvpn_refs;

    @Override
    public String getObjectType() {
        return "logical-router";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public RouteTargetList getConfiguredRouteTargetList() {
        return configured_route_target_list;
    }
    
    public void setConfiguredRouteTargetList(RouteTargetList configured_route_target_list) {
        this.configured_route_target_list = configured_route_target_list;
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

    public List<ObjectReference<ApiPropertyBase>> getRouteTarget() {
        return route_target_refs;
    }

    public void setRouteTarget(RouteTarget obj) {
        route_target_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        route_target_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addRouteTarget(RouteTarget obj) {
        if (route_target_refs == null) {
            route_target_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        route_target_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearRouteTarget() {
        if (route_target_refs != null) {
            route_target_refs.clear();
            return;
        }
        route_target_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteTable() {
        return route_table_refs;
    }

    public void setRouteTable(RouteTable obj) {
        route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addRouteTable(RouteTable obj) {
        if (route_table_refs == null) {
            route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearRouteTable() {
        if (route_table_refs != null) {
            route_table_refs.clear();
            return;
        }
        route_table_refs = null;
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

    public List<ObjectReference<ApiPropertyBase>> getServiceInstance() {
        return service_instance_refs;
    }

    public void setServiceInstance(ServiceInstance obj) {
        service_instance_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        service_instance_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addServiceInstance(ServiceInstance obj) {
        if (service_instance_refs == null) {
            service_instance_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        service_instance_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearServiceInstance() {
        if (service_instance_refs != null) {
            service_instance_refs.clear();
            return;
        }
        service_instance_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getBgpvpn() {
        return bgpvpn_refs;
    }

    public void setBgpvpn(Bgpvpn obj) {
        bgpvpn_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        bgpvpn_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addBgpvpn(Bgpvpn obj) {
        if (bgpvpn_refs == null) {
            bgpvpn_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        bgpvpn_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearBgpvpn() {
        if (bgpvpn_refs != null) {
            bgpvpn_refs.clear();
            return;
        }
        bgpvpn_refs = null;
    }
}