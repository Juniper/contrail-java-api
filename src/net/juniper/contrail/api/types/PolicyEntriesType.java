//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class PolicyEntriesType extends ApiPropertyBase {
    public static class PolicyRuleType {
        public static class SequenceType {
            Integer major;
            Integer minor;
            public SequenceType() {
            }
            public SequenceType(Integer major, Integer minor) {
                this.major = major;
                this.minor = minor;
            }
            public SequenceType(Integer major) {
                this(major, null);             }
            
            public Integer getMajor() {
                return major;
            }
            
            public void setMajor(Integer major) {
                this.major = major;
            }
            
            
            public Integer getMinor() {
                return minor;
            }
            
            public void setMinor(Integer minor) {
                this.minor = minor;
            }
            
        }
        public static class AddressType {
            SubnetType subnet;
            String virtual_network;
            String security_group;
            String network_policy;
            List<SubnetType> subnet_list;
            public AddressType() {
            }
            public AddressType(SubnetType subnet, String virtual_network, String security_group, String network_policy, List<SubnetType> subnet_list) {
                this.subnet = subnet;
                this.virtual_network = virtual_network;
                this.security_group = security_group;
                this.network_policy = network_policy;
                this.subnet_list = subnet_list;
            }
            public AddressType(SubnetType subnet) {
                this(subnet, null, null, null, null);             }
            public AddressType(SubnetType subnet, String virtual_network) {
                this(subnet, virtual_network, null, null, null);             }
            public AddressType(SubnetType subnet, String virtual_network, String security_group) {
                this(subnet, virtual_network, security_group, null, null);             }
            public AddressType(SubnetType subnet, String virtual_network, String security_group, String network_policy) {
                this(subnet, virtual_network, security_group, network_policy, null);             }
            
            public SubnetType getSubnet() {
                return subnet;
            }
            
            public void setSubnet(SubnetType subnet) {
                this.subnet = subnet;
            }
            
            
            public String getVirtualNetwork() {
                return virtual_network;
            }
            
            public void setVirtualNetwork(String virtual_network) {
                this.virtual_network = virtual_network;
            }
            
            
            public String getSecurityGroup() {
                return security_group;
            }
            
            public void setSecurityGroup(String security_group) {
                this.security_group = security_group;
            }
            
            
            public String getNetworkPolicy() {
                return network_policy;
            }
            
            public void setNetworkPolicy(String network_policy) {
                this.network_policy = network_policy;
            }
            
            
            public List<SubnetType> getSubnetList() {
                return subnet_list;
            }
            
            
            public void addSubnet(SubnetType obj) {
                if (subnet_list == null) {
                    subnet_list = new ArrayList<SubnetType>();
                }
                subnet_list.add(obj);
            }
            public void clearSubnet() {
                subnet_list = null;
            }
            
            
            public void addSubnet(String ip_prefix, Integer ip_prefix_len) {
                if (subnet_list == null) {
                    subnet_list = new ArrayList<SubnetType>();
                }
                subnet_list.add(new SubnetType(ip_prefix, ip_prefix_len));
            }
            
        }
        public static class PortType {
            Integer start_port;
            Integer end_port;
            public PortType() {
            }
            public PortType(Integer start_port, Integer end_port) {
                this.start_port = start_port;
                this.end_port = end_port;
            }
            public PortType(Integer start_port) {
                this(start_port, 65535);             }
            
            public Integer getStartPort() {
                return start_port;
            }
            
            public void setStartPort(Integer start_port) {
                this.start_port = start_port;
            }
            
            
            public Integer getEndPort() {
                return end_port;
            }
            
            public void setEndPort(Integer end_port) {
                this.end_port = end_port;
            }
            
        }
        public static class ActionListType {
            public static class MirrorActionType {
                public static class StaticMirrorNhType {
                    String vtep_dst_ip_address;
                    String vtep_dst_mac_address;
                    Integer vni;
                    public StaticMirrorNhType() {
                    }
                    public StaticMirrorNhType(String vtep_dst_ip_address, String vtep_dst_mac_address, Integer vni) {
                        this.vtep_dst_ip_address = vtep_dst_ip_address;
                        this.vtep_dst_mac_address = vtep_dst_mac_address;
                        this.vni = vni;
                    }
                    public StaticMirrorNhType(String vtep_dst_ip_address) {
                        this(vtep_dst_ip_address, null, null);                     }
                    public StaticMirrorNhType(String vtep_dst_ip_address, String vtep_dst_mac_address) {
                        this(vtep_dst_ip_address, vtep_dst_mac_address, null);                     }
                    
                    public String getVtepDstIpAddress() {
                        return vtep_dst_ip_address;
                    }
                    
                    public void setVtepDstIpAddress(String vtep_dst_ip_address) {
                        this.vtep_dst_ip_address = vtep_dst_ip_address;
                    }
                    
                    
                    public String getVtepDstMacAddress() {
                        return vtep_dst_mac_address;
                    }
                    
                    public void setVtepDstMacAddress(String vtep_dst_mac_address) {
                        this.vtep_dst_mac_address = vtep_dst_mac_address;
                    }
                    
                    
                    public Integer getVni() {
                        return vni;
                    }
                    
                    public void setVni(Integer vni) {
                        this.vni = vni;
                    }
                    
                }
                String analyzer_name;
                String encapsulation;
                String analyzer_ip_address;
                String analyzer_mac_address;
                String routing_instance;
                Integer udp_port;
                boolean juniper_header;
                String nh_mode;
                StaticMirrorNhType static_nh_header;
                boolean nic_assisted_mirroring;
                Integer nic_assisted_mirroring_vlan;
                public MirrorActionType() {
                }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode, StaticMirrorNhType static_nh_header, boolean nic_assisted_mirroring, Integer nic_assisted_mirroring_vlan) {
                    this.analyzer_name = analyzer_name;
                    this.encapsulation = encapsulation;
                    this.analyzer_ip_address = analyzer_ip_address;
                    this.analyzer_mac_address = analyzer_mac_address;
                    this.routing_instance = routing_instance;
                    this.udp_port = udp_port;
                    this.juniper_header = juniper_header;
                    this.nh_mode = nh_mode;
                    this.static_nh_header = static_nh_header;
                    this.nic_assisted_mirroring = nic_assisted_mirroring;
                    this.nic_assisted_mirroring_vlan = nic_assisted_mirroring_vlan;
                }
                public MirrorActionType(String analyzer_name) {
                    this(analyzer_name, null, null, null, null, null, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation) {
                    this(analyzer_name, encapsulation, null, null, null, null, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, null, null, null, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, null, null, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, null, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, true, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, null, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, null, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode, StaticMirrorNhType static_nh_header) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, static_nh_header, false, null);                 }
                public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode, StaticMirrorNhType static_nh_header, boolean nic_assisted_mirroring) {
                    this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, static_nh_header, nic_assisted_mirroring, null);                 }
                
                public String getAnalyzerName() {
                    return analyzer_name;
                }
                
                public void setAnalyzerName(String analyzer_name) {
                    this.analyzer_name = analyzer_name;
                }
                
                
                public String getEncapsulation() {
                    return encapsulation;
                }
                
                public void setEncapsulation(String encapsulation) {
                    this.encapsulation = encapsulation;
                }
                
                
                public String getAnalyzerIpAddress() {
                    return analyzer_ip_address;
                }
                
                public void setAnalyzerIpAddress(String analyzer_ip_address) {
                    this.analyzer_ip_address = analyzer_ip_address;
                }
                
                
                public String getAnalyzerMacAddress() {
                    return analyzer_mac_address;
                }
                
                public void setAnalyzerMacAddress(String analyzer_mac_address) {
                    this.analyzer_mac_address = analyzer_mac_address;
                }
                
                
                public String getRoutingInstance() {
                    return routing_instance;
                }
                
                public void setRoutingInstance(String routing_instance) {
                    this.routing_instance = routing_instance;
                }
                
                
                public Integer getUdpPort() {
                    return udp_port;
                }
                
                public void setUdpPort(Integer udp_port) {
                    this.udp_port = udp_port;
                }
                
                
                public boolean getJuniperHeader() {
                    return juniper_header;
                }
                
                public void setJuniperHeader(boolean juniper_header) {
                    this.juniper_header = juniper_header;
                }
                
                
                public String getNhMode() {
                    return nh_mode;
                }
                
                public void setNhMode(String nh_mode) {
                    this.nh_mode = nh_mode;
                }
                
                
                public StaticMirrorNhType getStaticNhHeader() {
                    return static_nh_header;
                }
                
                public void setStaticNhHeader(StaticMirrorNhType static_nh_header) {
                    this.static_nh_header = static_nh_header;
                }
                
                
                public boolean getNicAssistedMirroring() {
                    return nic_assisted_mirroring;
                }
                
                public void setNicAssistedMirroring(boolean nic_assisted_mirroring) {
                    this.nic_assisted_mirroring = nic_assisted_mirroring;
                }
                
                
                public Integer getNicAssistedMirroringVlan() {
                    return nic_assisted_mirroring_vlan;
                }
                
                public void setNicAssistedMirroringVlan(Integer nic_assisted_mirroring_vlan) {
                    this.nic_assisted_mirroring_vlan = nic_assisted_mirroring_vlan;
                }
                
            }
            String simple_action;
            String gateway_name;
            List<String> apply_service;
            MirrorActionType mirror_to;
            String assign_routing_instance;
            boolean log;
            boolean alert;
            String qos_action;
            public ActionListType() {
            }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service, MirrorActionType mirror_to, String assign_routing_instance, boolean log, boolean alert, String qos_action) {
                this.simple_action = simple_action;
                this.gateway_name = gateway_name;
                this.apply_service = apply_service;
                this.mirror_to = mirror_to;
                this.assign_routing_instance = assign_routing_instance;
                this.log = log;
                this.alert = alert;
                this.qos_action = qos_action;
            }
            public ActionListType(String simple_action) {
                this(simple_action, null, null, null, null, false, false, null);             }
            public ActionListType(String simple_action, String gateway_name) {
                this(simple_action, gateway_name, null, null, null, false, false, null);             }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service) {
                this(simple_action, gateway_name, apply_service, null, null, false, false, null);             }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service, MirrorActionType mirror_to) {
                this(simple_action, gateway_name, apply_service, mirror_to, null, false, false, null);             }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service, MirrorActionType mirror_to, String assign_routing_instance) {
                this(simple_action, gateway_name, apply_service, mirror_to, assign_routing_instance, false, false, null);             }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service, MirrorActionType mirror_to, String assign_routing_instance, boolean log) {
                this(simple_action, gateway_name, apply_service, mirror_to, assign_routing_instance, log, false, null);             }
            public ActionListType(String simple_action, String gateway_name, List<String> apply_service, MirrorActionType mirror_to, String assign_routing_instance, boolean log, boolean alert) {
                this(simple_action, gateway_name, apply_service, mirror_to, assign_routing_instance, log, alert, null);             }
            
            public String getSimpleAction() {
                return simple_action;
            }
            
            public void setSimpleAction(String simple_action) {
                this.simple_action = simple_action;
            }
            
            
            public String getGatewayName() {
                return gateway_name;
            }
            
            public void setGatewayName(String gateway_name) {
                this.gateway_name = gateway_name;
            }
            
            
            public MirrorActionType getMirrorTo() {
                return mirror_to;
            }
            
            public void setMirrorTo(MirrorActionType mirror_to) {
                this.mirror_to = mirror_to;
            }
            
            
            public String getAssignRoutingInstance() {
                return assign_routing_instance;
            }
            
            public void setAssignRoutingInstance(String assign_routing_instance) {
                this.assign_routing_instance = assign_routing_instance;
            }
            
            
            public boolean getLog() {
                return log;
            }
            
            public void setLog(boolean log) {
                this.log = log;
            }
            
            
            public boolean getAlert() {
                return alert;
            }
            
            public void setAlert(boolean alert) {
                this.alert = alert;
            }
            
            
            public String getQosAction() {
                return qos_action;
            }
            
            public void setQosAction(String qos_action) {
                this.qos_action = qos_action;
            }
            
            
            public List<String> getApplyService() {
                return apply_service;
            }
            
            
            public void addApplyService(String obj) {
                if (apply_service == null) {
                    apply_service = new ArrayList<String>();
                }
                apply_service.add(obj);
            }
            public void clearApplyService() {
                apply_service = null;
            }
            
        }
        SequenceType rule_sequence;
        String rule_uuid;
        String direction;
        String protocol;
        List<AddressType> src_addresses;
        List<PortType> src_ports;
        List<String> application;
        List<AddressType> dst_addresses;
        List<PortType> dst_ports;
        ActionListType action_list;
        String ethertype;
        public PolicyRuleType() {
        }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports, List<String> application, List<AddressType> dst_addresses, List<PortType> dst_ports, ActionListType action_list, String ethertype) {
            this.rule_sequence = rule_sequence;
            this.rule_uuid = rule_uuid;
            this.direction = direction;
            this.protocol = protocol;
            this.src_addresses = src_addresses;
            this.src_ports = src_ports;
            this.application = application;
            this.dst_addresses = dst_addresses;
            this.dst_ports = dst_ports;
            this.action_list = action_list;
            this.ethertype = ethertype;
        }
        public PolicyRuleType(SequenceType rule_sequence) {
            this(rule_sequence, null, null, null, null, null, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid) {
            this(rule_sequence, rule_uuid, null, null, null, null, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction) {
            this(rule_sequence, rule_uuid, direction, null, null, null, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol) {
            this(rule_sequence, rule_uuid, direction, protocol, null, null, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, null, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, src_ports, null, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports, List<String> application) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, src_ports, application, null, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports, List<String> application, List<AddressType> dst_addresses) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, src_ports, application, dst_addresses, null, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports, List<String> application, List<AddressType> dst_addresses, List<PortType> dst_ports) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, src_ports, application, dst_addresses, dst_ports, null, null);         }
        public PolicyRuleType(SequenceType rule_sequence, String rule_uuid, String direction, String protocol, List<AddressType> src_addresses, List<PortType> src_ports, List<String> application, List<AddressType> dst_addresses, List<PortType> dst_ports, ActionListType action_list) {
            this(rule_sequence, rule_uuid, direction, protocol, src_addresses, src_ports, application, dst_addresses, dst_ports, action_list, null);         }
        
        public SequenceType getRuleSequence() {
            return rule_sequence;
        }
        
        public void setRuleSequence(SequenceType rule_sequence) {
            this.rule_sequence = rule_sequence;
        }
        
        
        public String getRuleUuid() {
            return rule_uuid;
        }
        
        public void setRuleUuid(String rule_uuid) {
            this.rule_uuid = rule_uuid;
        }
        
        
        public String getDirection() {
            return direction;
        }
        
        public void setDirection(String direction) {
            this.direction = direction;
        }
        
        
        public String getProtocol() {
            return protocol;
        }
        
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }
        
        
        public ActionListType getActionList() {
            return action_list;
        }
        
        public void setActionList(ActionListType action_list) {
            this.action_list = action_list;
        }
        
        
        public String getEthertype() {
            return ethertype;
        }
        
        public void setEthertype(String ethertype) {
            this.ethertype = ethertype;
        }
        
        
        public List<AddressType> getSrcAddresses() {
            return src_addresses;
        }
        
        
        public void addSrcAddresses(AddressType obj) {
            if (src_addresses == null) {
                src_addresses = new ArrayList<AddressType>();
            }
            src_addresses.add(obj);
        }
        public void clearSrcAddresses() {
            src_addresses = null;
        }
        
        
        public List<PortType> getSrcPorts() {
            return src_ports;
        }
        
        
        public void addSrcPorts(PortType obj) {
            if (src_ports == null) {
                src_ports = new ArrayList<PortType>();
            }
            src_ports.add(obj);
        }
        public void clearSrcPorts() {
            src_ports = null;
        }
        
        
        public void addSrcPorts(Integer start_port, Integer end_port) {
            if (src_ports == null) {
                src_ports = new ArrayList<PortType>();
            }
            src_ports.add(new PortType(start_port, end_port));
        }
        
        
        public List<String> getApplication() {
            return application;
        }
        
        
        public void addApplication(String obj) {
            if (application == null) {
                application = new ArrayList<String>();
            }
            application.add(obj);
        }
        public void clearApplication() {
            application = null;
        }
        
        
        public List<AddressType> getDstAddresses() {
            return dst_addresses;
        }
        
        
        public void addDstAddresses(AddressType obj) {
            if (dst_addresses == null) {
                dst_addresses = new ArrayList<AddressType>();
            }
            dst_addresses.add(obj);
        }
        public void clearDstAddresses() {
            dst_addresses = null;
        }
        
        
        public List<PortType> getDstPorts() {
            return dst_ports;
        }
        
        
        public void addDstPorts(PortType obj) {
            if (dst_ports == null) {
                dst_ports = new ArrayList<PortType>();
            }
            dst_ports.add(obj);
        }
        public void clearDstPorts() {
            dst_ports = null;
        }
        
        
        public void addDstPorts(Integer start_port, Integer end_port) {
            if (dst_ports == null) {
                dst_ports = new ArrayList<PortType>();
            }
            dst_ports.add(new PortType(start_port, end_port));
        }
        
    }
    List<PolicyRuleType> policy_rule;
    public PolicyEntriesType() {
    }
    public PolicyEntriesType(List<PolicyRuleType> policy_rule) {
        this.policy_rule = policy_rule;
    }
    
    public List<PolicyRuleType> getPolicyRule() {
        return policy_rule;
    }
    
    
    public void addPolicyRule(PolicyRuleType obj) {
        if (policy_rule == null) {
            policy_rule = new ArrayList<PolicyRuleType>();
        }
        policy_rule.add(obj);
    }
    public void clearPolicyRule() {
        policy_rule = null;
    }
    
}
