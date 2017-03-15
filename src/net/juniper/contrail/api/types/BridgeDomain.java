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

public class BridgeDomain extends ApiObjectBase {
    private boolean mac_learning_enabled;
    private MACLimitControlType mac_limit_control;
    private MACMoveLimitControlType mac_move_control;
    private Integer mac_aging_time;
    private Integer isid;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private transient List<ObjectReference<BridgeDomainMembershipType>> virtual_machine_interface_back_refs;

    @Override
    public String getObjectType() {
        return "bridge-domain";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project", "default-virtual-network");
    }

    @Override
    public String getDefaultParentType() {
        return "virtual-network";
    }
    
    public boolean getMacLearningEnabled() {
        return mac_learning_enabled;
    }
    
    public void setMacLearningEnabled(boolean mac_learning_enabled) {
        this.mac_learning_enabled = mac_learning_enabled;
    }
    
    
    public MACLimitControlType getMacLimitControl() {
        return mac_limit_control;
    }
    
    public void setMacLimitControl(MACLimitControlType mac_limit_control) {
        this.mac_limit_control = mac_limit_control;
    }
    
    
    public MACMoveLimitControlType getMacMoveControl() {
        return mac_move_control;
    }
    
    public void setMacMoveControl(MACMoveLimitControlType mac_move_control) {
        this.mac_move_control = mac_move_control;
    }
    
    
    public Integer getMacAgingTime() {
        return mac_aging_time;
    }
    
    public void setMacAgingTime(Integer mac_aging_time) {
        this.mac_aging_time = mac_aging_time;
    }
    
    
    public Integer getIsid() {
        return isid;
    }
    
    public void setIsid(Integer isid) {
        this.isid = isid;
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
    

    public List<ObjectReference<BridgeDomainMembershipType>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }
}