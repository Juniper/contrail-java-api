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

public class SecurityGroup extends ApiObjectBase {
    private String security_group_id;
    private Integer configured_security_group_id;
    private PolicyEntriesType security_group_entries;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> access_control_lists;
    private transient List<ObjectReference<SecurityLoggingObjectRuleListType>> security_logging_object_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;

    @Override
    public String getObjectType() {
        return "security-group";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public String getId() {
        return security_group_id;
    }
    
    public void setId(String security_group_id) {
        this.security_group_id = security_group_id;
    }
    
    
    public Integer getConfiguredSecurityGroupId() {
        return configured_security_group_id;
    }
    
    public void setConfiguredSecurityGroupId(Integer configured_security_group_id) {
        this.configured_security_group_id = configured_security_group_id;
    }
    
    
    public PolicyEntriesType getEntries() {
        return security_group_entries;
    }
    
    public void setEntries(PolicyEntriesType security_group_entries) {
        this.security_group_entries = security_group_entries;
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
    

    public List<ObjectReference<ApiPropertyBase>> getAccessControlLists() {
        return access_control_lists;
    }

    public List<ObjectReference<SecurityLoggingObjectRuleListType>> getSecurityLoggingObjectBackRefs() {
        return security_logging_object_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }
}