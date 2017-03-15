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

public class VirtualNetwork extends ApiObjectBase {
    private EcmpHashingIncludeFields ecmp_hashing_include_fields;
    private VirtualNetworkType virtual_network_properties;
    private ProviderDetails provider_properties;
    private Integer virtual_network_network_id;
    private boolean port_security_enabled;
    private RouteTargetList route_target_list;
    private RouteTargetList import_route_target_list;
    private RouteTargetList export_route_target_list;
    private boolean router_external;
    private boolean is_shared;
    private boolean external_ipam;
    private boolean flood_unknown_unicast;
    private boolean multi_policy_service_chains_enabled;
    private String address_allocation_mode;
    private boolean mac_learning_enabled;
    private MACLimitControlType mac_limit_control;
    private MACMoveLimitControlType mac_move_control;
    private Integer mac_aging_time;
    private boolean pbb_evpn_enable;
    private boolean pbb_etree_enable;
    private boolean layer2_control_word;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> security_logging_object_refs;
    private List<ObjectReference<ApiPropertyBase>> qos_config_refs;
    private List<ObjectReference<VnSubnetsType>> network_ipam_refs;
    private List<ObjectReference<VirtualNetworkPolicyType>> network_policy_refs;
    private List<ObjectReference<ApiPropertyBase>> access_control_lists;
    private List<ObjectReference<ApiPropertyBase>> floating_ip_pools;
    private List<ObjectReference<ApiPropertyBase>> alias_ip_pools;
    private List<ObjectReference<ApiPropertyBase>> routing_instances;
    private List<ObjectReference<ApiPropertyBase>> route_table_refs;
    private List<ObjectReference<ApiPropertyBase>> bridge_domains;
    private List<ObjectReference<ApiPropertyBase>> bgpvpn_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> instance_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> physical_router_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> logical_router_back_refs;

    @Override
    public String getObjectType() {
        return "virtual-network";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public EcmpHashingIncludeFields getEcmpHashingIncludeFields() {
        return ecmp_hashing_include_fields;
    }
    
    public void setEcmpHashingIncludeFields(EcmpHashingIncludeFields ecmp_hashing_include_fields) {
        this.ecmp_hashing_include_fields = ecmp_hashing_include_fields;
    }
    
    
    public VirtualNetworkType getProperties() {
        return virtual_network_properties;
    }
    
    public void setProperties(VirtualNetworkType virtual_network_properties) {
        this.virtual_network_properties = virtual_network_properties;
    }
    
    
    public ProviderDetails getProviderProperties() {
        return provider_properties;
    }
    
    public void setProviderProperties(ProviderDetails provider_properties) {
        this.provider_properties = provider_properties;
    }
    
    
    public Integer getNetworkId() {
        return virtual_network_network_id;
    }
    
    public void setNetworkId(Integer virtual_network_network_id) {
        this.virtual_network_network_id = virtual_network_network_id;
    }
    
    
    public boolean getPortSecurityEnabled() {
        return port_security_enabled;
    }
    
    public void setPortSecurityEnabled(boolean port_security_enabled) {
        this.port_security_enabled = port_security_enabled;
    }
    
    
    public RouteTargetList getRouteTargetList() {
        return route_target_list;
    }
    
    public void setRouteTargetList(RouteTargetList route_target_list) {
        this.route_target_list = route_target_list;
    }
    
    
    public RouteTargetList getImportRouteTargetList() {
        return import_route_target_list;
    }
    
    public void setImportRouteTargetList(RouteTargetList import_route_target_list) {
        this.import_route_target_list = import_route_target_list;
    }
    
    
    public RouteTargetList getExportRouteTargetList() {
        return export_route_target_list;
    }
    
    public void setExportRouteTargetList(RouteTargetList export_route_target_list) {
        this.export_route_target_list = export_route_target_list;
    }
    
    
    public boolean getRouterExternal() {
        return router_external;
    }
    
    public void setRouterExternal(boolean router_external) {
        this.router_external = router_external;
    }
    
    
    public boolean getIsShared() {
        return is_shared;
    }
    
    public void setIsShared(boolean is_shared) {
        this.is_shared = is_shared;
    }
    
    
    public boolean getExternalIpam() {
        return external_ipam;
    }
    
    public void setExternalIpam(boolean external_ipam) {
        this.external_ipam = external_ipam;
    }
    
    
    public boolean getFloodUnknownUnicast() {
        return flood_unknown_unicast;
    }
    
    public void setFloodUnknownUnicast(boolean flood_unknown_unicast) {
        this.flood_unknown_unicast = flood_unknown_unicast;
    }
    
    
    public boolean getMultiPolicyServiceChainsEnabled() {
        return multi_policy_service_chains_enabled;
    }
    
    public void setMultiPolicyServiceChainsEnabled(boolean multi_policy_service_chains_enabled) {
        this.multi_policy_service_chains_enabled = multi_policy_service_chains_enabled;
    }
    
    
    public String getAddressAllocationMode() {
        return address_allocation_mode;
    }
    
    public void setAddressAllocationMode(String address_allocation_mode) {
        this.address_allocation_mode = address_allocation_mode;
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
    
    
    public boolean getPbbEvpnEnable() {
        return pbb_evpn_enable;
    }
    
    public void setPbbEvpnEnable(boolean pbb_evpn_enable) {
        this.pbb_evpn_enable = pbb_evpn_enable;
    }
    
    
    public boolean getPbbEtreeEnable() {
        return pbb_etree_enable;
    }
    
    public void setPbbEtreeEnable(boolean pbb_etree_enable) {
        this.pbb_etree_enable = pbb_etree_enable;
    }
    
    
    public boolean getLayer2ControlWord() {
        return layer2_control_word;
    }
    
    public void setLayer2ControlWord(boolean layer2_control_word) {
        this.layer2_control_word = layer2_control_word;
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
    

    public List<ObjectReference<ApiPropertyBase>> getSecurityLoggingObject() {
        return security_logging_object_refs;
    }

    public void setSecurityLoggingObject(SecurityLoggingObject obj) {
        security_logging_object_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        security_logging_object_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addSecurityLoggingObject(SecurityLoggingObject obj) {
        if (security_logging_object_refs == null) {
            security_logging_object_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        security_logging_object_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearSecurityLoggingObject() {
        if (security_logging_object_refs != null) {
            security_logging_object_refs.clear();
            return;
        }
        security_logging_object_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getQosConfig() {
        return qos_config_refs;
    }

    public void setQosConfig(QosConfig obj) {
        qos_config_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        qos_config_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addQosConfig(QosConfig obj) {
        if (qos_config_refs == null) {
            qos_config_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        qos_config_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearQosConfig() {
        if (qos_config_refs != null) {
            qos_config_refs.clear();
            return;
        }
        qos_config_refs = null;
    }

    public List<ObjectReference<VnSubnetsType>> getNetworkIpam() {
        return network_ipam_refs;
    }

    public void setNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        network_ipam_refs = new ArrayList<ObjectReference<VnSubnetsType>>();
        network_ipam_refs.add(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
    }

    public void addNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        if (network_ipam_refs == null) {
            network_ipam_refs = new ArrayList<ObjectReference<VnSubnetsType>>();
        }
        network_ipam_refs.add(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
    }

    public void removeNetworkIpam(NetworkIpam obj, VnSubnetsType data) {
        if (network_ipam_refs != null) {
            network_ipam_refs.remove(new ObjectReference<VnSubnetsType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNetworkIpam() {
        if (network_ipam_refs != null) {
            network_ipam_refs.clear();
            return;
        }
        network_ipam_refs = null;
    }


    public List<ObjectReference<VirtualNetworkPolicyType>> getNetworkPolicy() {
        return network_policy_refs;
    }

    public void setNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        network_policy_refs = new ArrayList<ObjectReference<VirtualNetworkPolicyType>>();
        network_policy_refs.add(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
    }

    public void addNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        if (network_policy_refs == null) {
            network_policy_refs = new ArrayList<ObjectReference<VirtualNetworkPolicyType>>();
        }
        network_policy_refs.add(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
    }

    public void removeNetworkPolicy(NetworkPolicy obj, VirtualNetworkPolicyType data) {
        if (network_policy_refs != null) {
            network_policy_refs.remove(new ObjectReference<VirtualNetworkPolicyType>(obj.getQualifiedName(), data));
        }
    }

    public void clearNetworkPolicy() {
        if (network_policy_refs != null) {
            network_policy_refs.clear();
            return;
        }
        network_policy_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getAccessControlLists() {
        return access_control_lists;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIpPools() {
        return floating_ip_pools;
    }

    public List<ObjectReference<ApiPropertyBase>> getAliasIpPools() {
        return alias_ip_pools;
    }

    public List<ObjectReference<ApiPropertyBase>> getRoutingInstances() {
        return routing_instances;
    }

    public List<ObjectReference<ApiPropertyBase>> getRouteTable() {
        return route_table_refs;
    }

    public void setRouteTable(RouteTable obj) {
        route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addRouteTable(RouteTable obj) {
        if (route_table_refs == null) {
            route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearRouteTable() {
        if (route_table_refs != null) {
            route_table_refs.clear();
            return;
        }
        route_table_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getBridgeDomains() {
        return bridge_domains;
    }

    public List<ObjectReference<ApiPropertyBase>> getBgpvpn() {
        return bgpvpn_refs;
    }

    public void setBgpvpn(Bgpvpn obj) {
        bgpvpn_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        bgpvpn_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addBgpvpn(Bgpvpn obj) {
        if (bgpvpn_refs == null) {
            bgpvpn_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        bgpvpn_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearBgpvpn() {
        if (bgpvpn_refs != null) {
            bgpvpn_refs.clear();
            return;
        }
        bgpvpn_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getInstanceIpBackRefs() {
        return instance_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalRouterBackRefs() {
        return physical_router_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalRouterBackRefs() {
        return logical_router_back_refs;
    }
}