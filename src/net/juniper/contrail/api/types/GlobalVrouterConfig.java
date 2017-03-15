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

public class GlobalVrouterConfig extends ApiObjectBase {
    private EcmpHashingIncludeFields ecmp_hashing_include_fields;
    private LinklocalServicesTypes linklocal_services;
    private EncapsulationPrioritiesType encapsulation_priorities;
    private String vxlan_network_identifier_mode;
    private Integer flow_export_rate;
    private FlowAgingTimeoutList flow_aging_timeout_list;
    private boolean enable_security_logging;
    private String forwarding_mode;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> security_logging_objects;

    @Override
    public String getObjectType() {
        return "global-vrouter-config";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-system-config";
    }
    
    public EcmpHashingIncludeFields getEcmpHashingIncludeFields() {
        return ecmp_hashing_include_fields;
    }
    
    public void setEcmpHashingIncludeFields(EcmpHashingIncludeFields ecmp_hashing_include_fields) {
        this.ecmp_hashing_include_fields = ecmp_hashing_include_fields;
    }
    
    
    public LinklocalServicesTypes getLinklocalServices() {
        return linklocal_services;
    }
    
    public void setLinklocalServices(LinklocalServicesTypes linklocal_services) {
        this.linklocal_services = linklocal_services;
    }
    
    
    public EncapsulationPrioritiesType getEncapsulationPriorities() {
        return encapsulation_priorities;
    }
    
    public void setEncapsulationPriorities(EncapsulationPrioritiesType encapsulation_priorities) {
        this.encapsulation_priorities = encapsulation_priorities;
    }
    
    
    public String getVxlanNetworkIdentifierMode() {
        return vxlan_network_identifier_mode;
    }
    
    public void setVxlanNetworkIdentifierMode(String vxlan_network_identifier_mode) {
        this.vxlan_network_identifier_mode = vxlan_network_identifier_mode;
    }
    
    
    public Integer getFlowExportRate() {
        return flow_export_rate;
    }
    
    public void setFlowExportRate(Integer flow_export_rate) {
        this.flow_export_rate = flow_export_rate;
    }
    
    
    public FlowAgingTimeoutList getFlowAgingTimeoutList() {
        return flow_aging_timeout_list;
    }
    
    public void setFlowAgingTimeoutList(FlowAgingTimeoutList flow_aging_timeout_list) {
        this.flow_aging_timeout_list = flow_aging_timeout_list;
    }
    
    
    public boolean getEnableSecurityLogging() {
        return enable_security_logging;
    }
    
    public void setEnableSecurityLogging(boolean enable_security_logging) {
        this.enable_security_logging = enable_security_logging;
    }
    
    
    public String getForwardingMode() {
        return forwarding_mode;
    }
    
    public void setForwardingMode(String forwarding_mode) {
        this.forwarding_mode = forwarding_mode;
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
    

    public List<ObjectReference<ApiPropertyBase>> getSecurityLoggingObjects() {
        return security_logging_objects;
    }
}