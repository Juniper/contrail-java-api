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

public class ServiceAppliance extends ApiObjectBase {
    private UserCredentials service_appliance_user_credentials;
    private String service_appliance_ip_address;
    private KeyValuePairs service_appliance_properties;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ServiceApplianceInterfaceType>> physical_interface_refs;

    @Override
    public String getObjectType() {
        return "service-appliance";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config", "default-service-appliance-set");
    }

    @Override
    public String getDefaultParentType() {
        return "service-appliance-set";
    }
    
    public UserCredentials getUserCredentials() {
        return service_appliance_user_credentials;
    }
    
    public void setUserCredentials(UserCredentials service_appliance_user_credentials) {
        this.service_appliance_user_credentials = service_appliance_user_credentials;
    }
    
    
    public String getIpAddress() {
        return service_appliance_ip_address;
    }
    
    public void setIpAddress(String service_appliance_ip_address) {
        this.service_appliance_ip_address = service_appliance_ip_address;
    }
    
    
    public KeyValuePairs getProperties() {
        return service_appliance_properties;
    }
    
    public void setProperties(KeyValuePairs service_appliance_properties) {
        this.service_appliance_properties = service_appliance_properties;
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
    

    public List<ObjectReference<ServiceApplianceInterfaceType>> getPhysicalInterface() {
        return physical_interface_refs;
    }

    public void setPhysicalInterface(PhysicalInterface obj, ServiceApplianceInterfaceType data) {
        physical_interface_refs = new ArrayList<ObjectReference<ServiceApplianceInterfaceType>>();
        physical_interface_refs.add(new ObjectReference<ServiceApplianceInterfaceType>(obj.getQualifiedName(), data));
    }

    public void addPhysicalInterface(PhysicalInterface obj, ServiceApplianceInterfaceType data) {
        if (physical_interface_refs == null) {
            physical_interface_refs = new ArrayList<ObjectReference<ServiceApplianceInterfaceType>>();
        }
        physical_interface_refs.add(new ObjectReference<ServiceApplianceInterfaceType>(obj.getQualifiedName(), data));
    }

    public void removePhysicalInterface(PhysicalInterface obj, ServiceApplianceInterfaceType data) {
        if (physical_interface_refs != null) {
            physical_interface_refs.remove(new ObjectReference<ServiceApplianceInterfaceType>(obj.getQualifiedName(), data));
        }
    }

    public void clearPhysicalInterface() {
        if (physical_interface_refs != null) {
            physical_interface_refs.clear();
            return;
        }
        physical_interface_refs = null;
    }

}