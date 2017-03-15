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

public class VirtualMachineInterface extends ApiObjectBase {
    private EcmpHashingIncludeFields ecmp_hashing_include_fields;
    private boolean port_security_enabled;
    private MacAddressesType virtual_machine_interface_mac_addresses;
    private DhcpOptionsListType virtual_machine_interface_dhcp_option_list;
    private RouteTableType virtual_machine_interface_host_routes;
    private AllowedAddressPairs virtual_machine_interface_allowed_address_pairs;
    private VrfAssignTableType vrf_assign_table;
    private String virtual_machine_interface_device_owner;
    private boolean virtual_machine_interface_disable_policy;
    private VirtualMachineInterfacePropertiesType virtual_machine_interface_properties;
    private KeyValuePairs virtual_machine_interface_bindings;
    private FatFlowProtocols virtual_machine_interface_fat_flow_protocols;
    private boolean vlan_tag_based_bridge_domain;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> security_logging_object_refs;
    private List<ObjectReference<ApiPropertyBase>> qos_config_refs;
    private List<ObjectReference<ApiPropertyBase>> security_group_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_network_refs;
    private List<ObjectReference<PolicyBasedForwardingRuleType>> routing_instance_refs;
    private List<ObjectReference<ApiPropertyBase>> port_tuple_refs;
    private List<ObjectReference<ApiPropertyBase>> service_health_check_refs;
    private List<ObjectReference<ApiPropertyBase>> interface_route_table_refs;
    private List<ObjectReference<ApiPropertyBase>> physical_interface_refs;
    private List<ObjectReference<BridgeDomainMembershipType>> bridge_domain_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> instance_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> subnet_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> floating_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> alias_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> logical_interface_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> bgp_as_a_service_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> customer_attachment_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> logical_router_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> loadbalancer_pool_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> virtual_ip_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> loadbalancer_back_refs;

    @Override
    public String getObjectType() {
        return "virtual-machine-interface";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-virtual-machine");
    }

    @Override
    public String getDefaultParentType() {
        return "virtual-machine";
    }
    
    public EcmpHashingIncludeFields getEcmpHashingIncludeFields() {
        return ecmp_hashing_include_fields;
    }
    
    public void setEcmpHashingIncludeFields(EcmpHashingIncludeFields ecmp_hashing_include_fields) {
        this.ecmp_hashing_include_fields = ecmp_hashing_include_fields;
    }
    
    
    public boolean getPortSecurityEnabled() {
        return port_security_enabled;
    }
    
    public void setPortSecurityEnabled(boolean port_security_enabled) {
        this.port_security_enabled = port_security_enabled;
    }
    
    
    public MacAddressesType getMacAddresses() {
        return virtual_machine_interface_mac_addresses;
    }
    
    public void setMacAddresses(MacAddressesType virtual_machine_interface_mac_addresses) {
        this.virtual_machine_interface_mac_addresses = virtual_machine_interface_mac_addresses;
    }
    
    
    public DhcpOptionsListType getDhcpOptionList() {
        return virtual_machine_interface_dhcp_option_list;
    }
    
    public void setDhcpOptionList(DhcpOptionsListType virtual_machine_interface_dhcp_option_list) {
        this.virtual_machine_interface_dhcp_option_list = virtual_machine_interface_dhcp_option_list;
    }
    
    
    public RouteTableType getHostRoutes() {
        return virtual_machine_interface_host_routes;
    }
    
    public void setHostRoutes(RouteTableType virtual_machine_interface_host_routes) {
        this.virtual_machine_interface_host_routes = virtual_machine_interface_host_routes;
    }
    
    
    public AllowedAddressPairs getAllowedAddressPairs() {
        return virtual_machine_interface_allowed_address_pairs;
    }
    
    public void setAllowedAddressPairs(AllowedAddressPairs virtual_machine_interface_allowed_address_pairs) {
        this.virtual_machine_interface_allowed_address_pairs = virtual_machine_interface_allowed_address_pairs;
    }
    
    
    public VrfAssignTableType getVrfAssignTable() {
        return vrf_assign_table;
    }
    
    public void setVrfAssignTable(VrfAssignTableType vrf_assign_table) {
        this.vrf_assign_table = vrf_assign_table;
    }
    
    
    public String getDeviceOwner() {
        return virtual_machine_interface_device_owner;
    }
    
    public void setDeviceOwner(String virtual_machine_interface_device_owner) {
        this.virtual_machine_interface_device_owner = virtual_machine_interface_device_owner;
    }
    
    
    public boolean getDisablePolicy() {
        return virtual_machine_interface_disable_policy;
    }
    
    public void setDisablePolicy(boolean virtual_machine_interface_disable_policy) {
        this.virtual_machine_interface_disable_policy = virtual_machine_interface_disable_policy;
    }
    
    
    public VirtualMachineInterfacePropertiesType getProperties() {
        return virtual_machine_interface_properties;
    }
    
    public void setProperties(VirtualMachineInterfacePropertiesType virtual_machine_interface_properties) {
        this.virtual_machine_interface_properties = virtual_machine_interface_properties;
    }
    
    
    public KeyValuePairs getBindings() {
        return virtual_machine_interface_bindings;
    }
    
    public void setBindings(KeyValuePairs virtual_machine_interface_bindings) {
        this.virtual_machine_interface_bindings = virtual_machine_interface_bindings;
    }
    
    
    public FatFlowProtocols getFatFlowProtocols() {
        return virtual_machine_interface_fat_flow_protocols;
    }
    
    public void setFatFlowProtocols(FatFlowProtocols virtual_machine_interface_fat_flow_protocols) {
        this.virtual_machine_interface_fat_flow_protocols = virtual_machine_interface_fat_flow_protocols;
    }
    
    
    public boolean getVlanTagBasedBridgeDomain() {
        return vlan_tag_based_bridge_domain;
    }
    
    public void setVlanTagBasedBridgeDomain(boolean vlan_tag_based_bridge_domain) {
        this.vlan_tag_based_bridge_domain = vlan_tag_based_bridge_domain;
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

    public List<ObjectReference<ApiPropertyBase>> getSecurityGroup() {
        return security_group_refs;
    }

    public void setSecurityGroup(SecurityGroup obj) {
        security_group_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        security_group_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addSecurityGroup(SecurityGroup obj) {
        if (security_group_refs == null) {
            security_group_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        security_group_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearSecurityGroup() {
        if (security_group_refs != null) {
            security_group_refs.clear();
            return;
        }
        security_group_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterface() {
        return virtual_machine_interface_refs;
    }

    public void setVirtualMachineInterface(VirtualMachineInterface obj) {
        virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualMachineInterface(VirtualMachineInterface obj) {
        if (virtual_machine_interface_refs == null) {
            virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualMachineInterface() {
        if (virtual_machine_interface_refs != null) {
            virtual_machine_interface_refs.clear();
            return;
        }
        virtual_machine_interface_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachine() {
        return virtual_machine_refs;
    }

    public void setVirtualMachine(VirtualMachine obj) {
        virtual_machine_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_machine_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualMachine(VirtualMachine obj) {
        if (virtual_machine_refs == null) {
            virtual_machine_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_machine_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualMachine() {
        if (virtual_machine_refs != null) {
            virtual_machine_refs.clear();
            return;
        }
        virtual_machine_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualNetwork() {
        return virtual_network_refs;
    }

    public void setVirtualNetwork(VirtualNetwork obj) {
        virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualNetwork(VirtualNetwork obj) {
        if (virtual_network_refs == null) {
            virtual_network_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_network_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualNetwork() {
        if (virtual_network_refs != null) {
            virtual_network_refs.clear();
            return;
        }
        virtual_network_refs = null;
    }

    public List<ObjectReference<PolicyBasedForwardingRuleType>> getRoutingInstance() {
        return routing_instance_refs;
    }

    public void setRoutingInstance(RoutingInstance obj, PolicyBasedForwardingRuleType data) {
        routing_instance_refs = new ArrayList<ObjectReference<PolicyBasedForwardingRuleType>>();
        routing_instance_refs.add(new ObjectReference<PolicyBasedForwardingRuleType>(obj.getQualifiedName(), data));
    }

    public void addRoutingInstance(RoutingInstance obj, PolicyBasedForwardingRuleType data) {
        if (routing_instance_refs == null) {
            routing_instance_refs = new ArrayList<ObjectReference<PolicyBasedForwardingRuleType>>();
        }
        routing_instance_refs.add(new ObjectReference<PolicyBasedForwardingRuleType>(obj.getQualifiedName(), data));
    }

    public void removeRoutingInstance(RoutingInstance obj, PolicyBasedForwardingRuleType data) {
        if (routing_instance_refs != null) {
            routing_instance_refs.remove(new ObjectReference<PolicyBasedForwardingRuleType>(obj.getQualifiedName(), data));
        }
    }

    public void clearRoutingInstance() {
        if (routing_instance_refs != null) {
            routing_instance_refs.clear();
            return;
        }
        routing_instance_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getPortTuple() {
        return port_tuple_refs;
    }

    public void setPortTuple(PortTuple obj) {
        port_tuple_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        port_tuple_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addPortTuple(PortTuple obj) {
        if (port_tuple_refs == null) {
            port_tuple_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        port_tuple_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearPortTuple() {
        if (port_tuple_refs != null) {
            port_tuple_refs.clear();
            return;
        }
        port_tuple_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getServiceHealthCheck() {
        return service_health_check_refs;
    }

    public void setServiceHealthCheck(ServiceHealthCheck obj) {
        service_health_check_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        service_health_check_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addServiceHealthCheck(ServiceHealthCheck obj) {
        if (service_health_check_refs == null) {
            service_health_check_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        service_health_check_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearServiceHealthCheck() {
        if (service_health_check_refs != null) {
            service_health_check_refs.clear();
            return;
        }
        service_health_check_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getInterfaceRouteTable() {
        return interface_route_table_refs;
    }

    public void setInterfaceRouteTable(InterfaceRouteTable obj) {
        interface_route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        interface_route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addInterfaceRouteTable(InterfaceRouteTable obj) {
        if (interface_route_table_refs == null) {
            interface_route_table_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        interface_route_table_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearInterfaceRouteTable() {
        if (interface_route_table_refs != null) {
            interface_route_table_refs.clear();
            return;
        }
        interface_route_table_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalInterface() {
        return physical_interface_refs;
    }

    public void setPhysicalInterface(PhysicalInterface obj) {
        physical_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        physical_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addPhysicalInterface(PhysicalInterface obj) {
        if (physical_interface_refs == null) {
            physical_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        physical_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearPhysicalInterface() {
        if (physical_interface_refs != null) {
            physical_interface_refs.clear();
            return;
        }
        physical_interface_refs = null;
    }

    public List<ObjectReference<BridgeDomainMembershipType>> getBridgeDomain() {
        return bridge_domain_refs;
    }

    public void setBridgeDomain(BridgeDomain obj, BridgeDomainMembershipType data) {
        bridge_domain_refs = new ArrayList<ObjectReference<BridgeDomainMembershipType>>();
        bridge_domain_refs.add(new ObjectReference<BridgeDomainMembershipType>(obj.getQualifiedName(), data));
    }

    public void addBridgeDomain(BridgeDomain obj, BridgeDomainMembershipType data) {
        if (bridge_domain_refs == null) {
            bridge_domain_refs = new ArrayList<ObjectReference<BridgeDomainMembershipType>>();
        }
        bridge_domain_refs.add(new ObjectReference<BridgeDomainMembershipType>(obj.getQualifiedName(), data));
    }

    public void removeBridgeDomain(BridgeDomain obj, BridgeDomainMembershipType data) {
        if (bridge_domain_refs != null) {
            bridge_domain_refs.remove(new ObjectReference<BridgeDomainMembershipType>(obj.getQualifiedName(), data));
        }
    }

    public void clearBridgeDomain() {
        if (bridge_domain_refs != null) {
            bridge_domain_refs.clear();
            return;
        }
        bridge_domain_refs = null;
    }


    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterfaceBackRefs() {
        return virtual_machine_interface_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getInstanceIpBackRefs() {
        return instance_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getSubnetBackRefs() {
        return subnet_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getFloatingIpBackRefs() {
        return floating_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getAliasIpBackRefs() {
        return alias_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalInterfaceBackRefs() {
        return logical_interface_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getBgpAsAServiceBackRefs() {
        return bgp_as_a_service_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getCustomerAttachmentBackRefs() {
        return customer_attachment_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLogicalRouterBackRefs() {
        return logical_router_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerPoolBackRefs() {
        return loadbalancer_pool_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualIpBackRefs() {
        return virtual_ip_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getLoadbalancerBackRefs() {
        return loadbalancer_back_refs;
    }
}