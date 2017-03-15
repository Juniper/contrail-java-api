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

public class Loadbalancer extends ApiObjectBase {
    private LoadbalancerType loadbalancer_properties;
    private String loadbalancer_provider;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> service_appliance_set_refs;
    private List<ObjectReference<ApiPropertyBase>> service_instance_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
    private transient List<ObjectReference<ApiPropertyBase>> loadbalancer_listener_back_refs;

    @Override
    public String getObjectType() {
        return "loadbalancer";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public LoadbalancerType getProperties() {
        return loadbalancer_properties;
    }
    
    public void setProperties(LoadbalancerType loadbalancer_properties) {
        this.loadbalancer_properties = loadbalancer_properties;
    }
    
    
    public String getProvider() {
        return loadbalancer_provider;
    }
    
    public void setProvider(String loadbalancer_provider) {
        this.loadbalancer_provider = loadbalancer_provider;
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
    

    public List<ObjectReference<ApiPropertyBase>> getServiceApplianceSet() {
        return service_appliance_set_refs;
    }

    public void setServiceApplianceSet(ServiceApplianceSet obj) {
        service_appliance_set_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        service_appliance_set_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addServiceApplianceSet(ServiceApplianceSet obj) {
        if (service_appliance_set_refs == null) {
            service_appliance_set_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        service_appliance_set_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearServiceApplianceSet() {
        if (service_appliance_set_refs != null) {
            service_appliance_set_refs.clear();
            return;
        }
        service_appliance_set_refs = null;
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

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerListenerBackRefs() {
        return loadbalancer_listener_back_refs;
    }
}