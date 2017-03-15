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

public class SecurityLoggingObject extends ApiObjectBase {
    private SecurityLoggingObjectRuleListType security_logging_object_rules;
    private Integer security_logging_object_rate;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<SecurityLoggingObjectRuleListType>> network_policy_refs;
    private List<ObjectReference<SecurityLoggingObjectRuleListType>> security_group_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_network_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;

    @Override
    public String getObjectType() {
        return "security-logging-object";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config", "default-global-vrouter-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-vrouter-config";
    }
    
    public SecurityLoggingObjectRuleListType getRules() {
        return security_logging_object_rules;
    }
    
    public void setRules(SecurityLoggingObjectRuleListType security_logging_object_rules) {
        this.security_logging_object_rules = security_logging_object_rules;
    }
    
    
    public Integer getRate() {
        return security_logging_object_rate;
    }
    
    public void setRate(Integer security_logging_object_rate) {
        this.security_logging_object_rate = security_logging_object_rate;
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
    

    public List<ObjectReference<SecurityLoggingObjectRuleListType>> getNetworkPolicy() {
        return network_policy_refs;
    }

    public void setNetworkPolicy(NetworkPolicy obj, SecurityLoggingObjectRuleListType data) {
        network_policy_refs = new ArrayList<ObjectReference<SecurityLoggingObjectRuleListType>>();
        network_policy_refs.add(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
    }

    public void addNetworkPolicy(NetworkPolicy obj, SecurityLoggingObjectRuleListType data) {
        if (network_policy_refs == null) {
            network_policy_refs = new ArrayList<ObjectReference<SecurityLoggingObjectRuleListType>>();
        }
        network_policy_refs.add(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
    }

    public void removeNetworkPolicy(NetworkPolicy obj, SecurityLoggingObjectRuleListType data) {
        if (network_policy_refs != null) {
            network_policy_refs.remove(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNetworkPolicy() {
        if (network_policy_refs != null) {
            network_policy_refs.clear();
            return;
        }
        network_policy_refs = null;
    }


    public List<ObjectReference<SecurityLoggingObjectRuleListType>> getSecurityGroup() {
        return security_group_refs;
    }

    public void setSecurityGroup(SecurityGroup obj, SecurityLoggingObjectRuleListType data) {
        security_group_refs = new ArrayList<ObjectReference<SecurityLoggingObjectRuleListType>>();
        security_group_refs.add(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
    }

    public void addSecurityGroup(SecurityGroup obj, SecurityLoggingObjectRuleListType data) {
        if (security_group_refs == null) {
            security_group_refs = new ArrayList<ObjectReference<SecurityLoggingObjectRuleListType>>();
        }
        security_group_refs.add(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
    }

    public void removeSecurityGroup(SecurityGroup obj, SecurityLoggingObjectRuleListType data) {
        if (security_group_refs != null) {
            security_group_refs.remove(new ObjectReference<SecurityLoggingObjectRuleListType>(obj.getQualifiedName(), data));
        }
    }

    public void clearSecurityGroup() {
        if (security_group_refs != null) {
            security_group_refs.clear();
            return;
        }
        security_group_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getVirtualNetworkBackRefs() {
        return virtual_network_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }
}