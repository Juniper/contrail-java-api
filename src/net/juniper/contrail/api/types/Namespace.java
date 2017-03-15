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

public class Namespace extends ApiObjectBase {
    private SubnetType namespace_cidr;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private transient List<ObjectReference<SubnetType>> project_back_refs;

    @Override
    public String getObjectType() {
        return "namespace";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain");
    }

    @Override
    public String getDefaultParentType() {
        return "domain";
    }
    
    public SubnetType getCidr() {
        return namespace_cidr;
    }
    
    public void setCidr(SubnetType namespace_cidr) {
        this.namespace_cidr = namespace_cidr;
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
    

    public List<ObjectReference<SubnetType>> getProjectBackRefs() {
        return project_back_refs;
    }
}