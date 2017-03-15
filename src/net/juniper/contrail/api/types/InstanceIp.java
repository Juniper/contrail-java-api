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

public class InstanceIp extends ApiObjectBase {
    private String instance_ip_address;
    private String instance_ip_family;
    private String instance_ip_mode;
    private SubnetType secondary_ip_tracking_ip;
    private String subnet_uuid;
    private boolean instance_ip_secondary;
    private boolean instance_ip_local_ip;
    private boolean service_instance_ip;
    private boolean service_health_check_ip;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
    private List<ObjectReference<ApiPropertyBase>> physical_router_refs;
    private List<ObjectReference<ApiPropertyBase>> floating_ips;
    private transient List<ObjectReference<ServiceInterfaceTag>> service_instance_back_refs;

    @Override
    public String getObjectType() {
        return "instance-ip";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of();
    }

    @Override
    public String getDefaultParentType() {
        return null;
    }
    
    public String getAddress() {
        return instance_ip_address;
    }
    
    public void setAddress(String instance_ip_address) {
        this.instance_ip_address = instance_ip_address;
    }
    
    
    public String getFamily() {
        return instance_ip_family;
    }
    
    public void setFamily(String instance_ip_family) {
        this.instance_ip_family = instance_ip_family;
    }
    
    
    public String getMode() {
        return instance_ip_mode;
    }
    
    public void setMode(String instance_ip_mode) {
        this.instance_ip_mode = instance_ip_mode;
    }
    
    
    public SubnetType getSecondaryIpTrackingIp() {
        return secondary_ip_tracking_ip;
    }
    
    public void setSecondaryIpTrackingIp(SubnetType secondary_ip_tracking_ip) {
        this.secondary_ip_tracking_ip = secondary_ip_tracking_ip;
    }
    
    
    public String getSubnetUuid() {
        return subnet_uuid;
    }
    
    public void setSubnetUuid(String subnet_uuid) {
        this.subnet_uuid = subnet_uuid;
    }
    
    
    public boolean getSecondary() {
        return instance_ip_secondary;
    }
    
    public void setSecondary(boolean instance_ip_secondary) {
        this.instance_ip_secondary = instance_ip_secondary;
    }
    
    
    public boolean getLocalIp() {
        return instance_ip_local_ip;
    }
    
    public void setLocalIp(boolean instance_ip_local_ip) {
        this.instance_ip_local_ip = instance_ip_local_ip;
    }
    
    
    public boolean getServiceInstanceIp() {
        return service_instance_ip;
    }
    
    public void setServiceInstanceIp(boolean service_instance_ip) {
        this.service_instance_ip = service_instance_ip;
    }
    
    
    public boolean getServiceHealthCheckIp() {
        return service_health_check_ip;
    }
    
    public void setServiceHealthCheckIp(boolean service_health_check_ip) {
        this.service_health_check_ip = service_health_check_ip;
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

    public List<ObjectReference<ApiPropertyBase>> getPhysicalRouter() {
        return physical_router_refs;
    }

    public void setPhysicalRouter(PhysicalRouter obj) {
        physical_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        physical_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addPhysicalRouter(PhysicalRouter obj) {
        if (physical_router_refs == null) {
            physical_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        physical_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearPhysicalRouter() {
        if (physical_router_refs != null) {
            physical_router_refs.clear();
            return;
        }
        physical_router_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIps() {
        return floating_ips;
    }

    public List<ObjectReference<ServiceInterfaceTag>> getServiceInstanceBackRefs() {
        return service_instance_back_refs;
    }
}