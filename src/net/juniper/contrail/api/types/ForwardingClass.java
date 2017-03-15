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

public class ForwardingClass extends ApiObjectBase {
    private Integer forwarding_class_id;
    private Integer forwarding_class_dscp;
    private Integer forwarding_class_vlan_priority;
    private Integer forwarding_class_mpls_exp;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> qos_queue_refs;

    @Override
    public String getObjectType() {
        return "forwarding-class";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config", "default-global-qos-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-qos-config";
    }
    
    public Integer getId() {
        return forwarding_class_id;
    }
    
    public void setId(Integer forwarding_class_id) {
        this.forwarding_class_id = forwarding_class_id;
    }
    
    
    public Integer getDscp() {
        return forwarding_class_dscp;
    }
    
    public void setDscp(Integer forwarding_class_dscp) {
        this.forwarding_class_dscp = forwarding_class_dscp;
    }
    
    
    public Integer getVlanPriority() {
        return forwarding_class_vlan_priority;
    }
    
    public void setVlanPriority(Integer forwarding_class_vlan_priority) {
        this.forwarding_class_vlan_priority = forwarding_class_vlan_priority;
    }
    
    
    public Integer getMplsExp() {
        return forwarding_class_mpls_exp;
    }
    
    public void setMplsExp(Integer forwarding_class_mpls_exp) {
        this.forwarding_class_mpls_exp = forwarding_class_mpls_exp;
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
    

    public List<ObjectReference<ApiPropertyBase>> getQosQueue() {
        return qos_queue_refs;
    }

    public void setQosQueue(QosQueue obj) {
        qos_queue_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        qos_queue_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addQosQueue(QosQueue obj) {
        if (qos_queue_refs == null) {
            qos_queue_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        qos_queue_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearQosQueue() {
        if (qos_queue_refs != null) {
            qos_queue_refs.clear();
            return;
        }
        qos_queue_refs = null;
    }
}