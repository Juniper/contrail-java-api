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

public class AccessControlList extends ApiObjectBase {
    private AclEntriesType access_control_list_entries;
    private Long access_control_list_hash;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;

    @Override
    public String getObjectType() {
        return "access-control-list";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project", "default-virtual-network");
    }

    @Override
    public String getDefaultParentType() {
        return "virtual-network";
    }
    
    public AclEntriesType getEntries() {
        return access_control_list_entries;
    }
    
    public void setEntries(AclEntriesType access_control_list_entries) {
        this.access_control_list_entries = access_control_list_entries;
    }
    
    
    public Long getHash() {
        return access_control_list_hash;
    }
    
    public void setHash(Long access_control_list_hash) {
        this.access_control_list_hash = access_control_list_hash;
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
    
}