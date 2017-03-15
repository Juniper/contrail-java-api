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

public class Alarm extends ApiObjectBase {
    private UveKeysType uve_keys;
    private Integer alarm_severity;
    private AlarmOrList alarm_rules;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;

    @Override
    public String getObjectType() {
        return "alarm";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-system-config";
    }
    
    public UveKeysType getUveKeys() {
        return uve_keys;
    }
    
    public void setUveKeys(UveKeysType uve_keys) {
        this.uve_keys = uve_keys;
    }
    
    
    public Integer getSeverity() {
        return alarm_severity;
    }
    
    public void setSeverity(Integer alarm_severity) {
        this.alarm_severity = alarm_severity;
    }
    
    
    public AlarmOrList getRules() {
        return alarm_rules;
    }
    
    public void setRules(AlarmOrList alarm_rules) {
        this.alarm_rules = alarm_rules;
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