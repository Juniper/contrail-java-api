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

public class FloatingIpPool extends ApiObjectBase {
    private FloatingIpPoolSubnetType floating_ip_pool_subnets;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> floating_ips;
    private transient List<ObjectReference<ApiPropertyBase>> project_back_refs;

    @Override
    public String getObjectType() {
        return "floating-ip-pool";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project", "default-virtual-network");
    }

    @Override
    public String getDefaultParentType() {
        return "virtual-network";
    }
    
    public FloatingIpPoolSubnetType getSubnets() {
        return floating_ip_pool_subnets;
    }
    
    public void setSubnets(FloatingIpPoolSubnetType floating_ip_pool_subnets) {
        this.floating_ip_pool_subnets = floating_ip_pool_subnets;
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
    

    public List<ObjectReference<ApiPropertyBase>> getFloatingIps() {
        return floating_ips;
    }

    public List<ObjectReference<ApiPropertyBase>> getProjectBackRefs() {
        return project_back_refs;
    }
}