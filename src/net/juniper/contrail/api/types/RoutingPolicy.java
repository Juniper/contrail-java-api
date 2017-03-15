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

public class RoutingPolicy extends ApiObjectBase {
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<RoutingPolicyServiceInstanceType>> service_instance_refs;

    @Override
    public String getObjectType() {
        return "routing-policy";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
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
    

    public List<ObjectReference<RoutingPolicyServiceInstanceType>> getServiceInstance() {
        return service_instance_refs;
    }

    public void setServiceInstance(ServiceInstance obj, RoutingPolicyServiceInstanceType data) {
        service_instance_refs = new ArrayList<ObjectReference<RoutingPolicyServiceInstanceType>>();
        service_instance_refs.add(new ObjectReference<RoutingPolicyServiceInstanceType>(obj.getQualifiedName(), data));
    }

    public void addServiceInstance(ServiceInstance obj, RoutingPolicyServiceInstanceType data) {
        if (service_instance_refs == null) {
            service_instance_refs = new ArrayList<ObjectReference<RoutingPolicyServiceInstanceType>>();
        }
        service_instance_refs.add(new ObjectReference<RoutingPolicyServiceInstanceType>(obj.getQualifiedName(), data));
    }

    public void removeServiceInstance(ServiceInstance obj, RoutingPolicyServiceInstanceType data) {
        if (service_instance_refs != null) {
            service_instance_refs.remove(new ObjectReference<RoutingPolicyServiceInstanceType>(obj.getQualifiedName(), data));
        }
    }

    public void clearServiceInstance() {
        if (service_instance_refs != null) {
            service_instance_refs.clear();
            return;
        }
        service_instance_refs = null;
    }

}