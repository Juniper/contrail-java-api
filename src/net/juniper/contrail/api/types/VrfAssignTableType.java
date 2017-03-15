//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VrfAssignTableType extends ApiPropertyBase {
    public static class VrfAssignRuleType {
        public static class MatchConditionType {
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
                    this(subnet, null, null, null, null);                 }
                public AddressType(SubnetType subnet, String virtual_network) {
                    this(subnet, virtual_network, null, null, null);                 }
                public AddressType(SubnetType subnet, String virtual_network, String security_group) {
                    this(subnet, virtual_network, security_group, null, null);                 }
                public AddressType(SubnetType subnet, String virtual_network, String security_group, String network_policy) {
                    this(subnet, virtual_network, security_group, network_policy, null);                 }
                
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
                    this(start_port, 65535);                 }
                
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
            String protocol;
            AddressType src_address;
            PortType src_port;
            AddressType dst_address;
            PortType dst_port;
            String ethertype;
            public MatchConditionType() {
            }
            public MatchConditionType(String protocol, AddressType src_address, PortType src_port, AddressType dst_address, PortType dst_port, String ethertype) {
                this.protocol = protocol;
                this.src_address = src_address;
                this.src_port = src_port;
                this.dst_address = dst_address;
                this.dst_port = dst_port;
                this.ethertype = ethertype;
            }
            public MatchConditionType(String protocol) {
                this(protocol, null, null, null, null, null);             }
            public MatchConditionType(String protocol, AddressType src_address) {
                this(protocol, src_address, null, null, null, null);             }
            public MatchConditionType(String protocol, AddressType src_address, PortType src_port) {
                this(protocol, src_address, src_port, null, null, null);             }
            public MatchConditionType(String protocol, AddressType src_address, PortType src_port, AddressType dst_address) {
                this(protocol, src_address, src_port, dst_address, null, null);             }
            public MatchConditionType(String protocol, AddressType src_address, PortType src_port, AddressType dst_address, PortType dst_port) {
                this(protocol, src_address, src_port, dst_address, dst_port, null);             }
            
            public String getProtocol() {
                return protocol;
            }
            
            public void setProtocol(String protocol) {
                this.protocol = protocol;
            }
            
            
            public AddressType getSrcAddress() {
                return src_address;
            }
            
            public void setSrcAddress(AddressType src_address) {
                this.src_address = src_address;
            }
            
            
            public PortType getSrcPort() {
                return src_port;
            }
            
            public void setSrcPort(PortType src_port) {
                this.src_port = src_port;
            }
            
            
            public AddressType getDstAddress() {
                return dst_address;
            }
            
            public void setDstAddress(AddressType dst_address) {
                this.dst_address = dst_address;
            }
            
            
            public PortType getDstPort() {
                return dst_port;
            }
            
            public void setDstPort(PortType dst_port) {
                this.dst_port = dst_port;
            }
            
            
            public String getEthertype() {
                return ethertype;
            }
            
            public void setEthertype(String ethertype) {
                this.ethertype = ethertype;
            }
            
        }
        MatchConditionType match_condition;
        Integer vlan_tag;
        String routing_instance;
        boolean ignore_acl;
        public VrfAssignRuleType() {
        }
        public VrfAssignRuleType(MatchConditionType match_condition, Integer vlan_tag, String routing_instance, boolean ignore_acl) {
            this.match_condition = match_condition;
            this.vlan_tag = vlan_tag;
            this.routing_instance = routing_instance;
            this.ignore_acl = ignore_acl;
        }
        public VrfAssignRuleType(MatchConditionType match_condition) {
            this(match_condition, null, null, false);         }
        public VrfAssignRuleType(MatchConditionType match_condition, Integer vlan_tag) {
            this(match_condition, vlan_tag, null, false);         }
        public VrfAssignRuleType(MatchConditionType match_condition, Integer vlan_tag, String routing_instance) {
            this(match_condition, vlan_tag, routing_instance, false);         }
        
        public MatchConditionType getMatchCondition() {
            return match_condition;
        }
        
        public void setMatchCondition(MatchConditionType match_condition) {
            this.match_condition = match_condition;
        }
        
        
        public Integer getVlanTag() {
            return vlan_tag;
        }
        
        public void setVlanTag(Integer vlan_tag) {
            this.vlan_tag = vlan_tag;
        }
        
        
        public String getRoutingInstance() {
            return routing_instance;
        }
        
        public void setRoutingInstance(String routing_instance) {
            this.routing_instance = routing_instance;
        }
        
        
        public boolean getIgnoreAcl() {
            return ignore_acl;
        }
        
        public void setIgnoreAcl(boolean ignore_acl) {
            this.ignore_acl = ignore_acl;
        }
        
    }
    List<VrfAssignRuleType> vrf_assign_rule;
    public VrfAssignTableType() {
    }
    public VrfAssignTableType(List<VrfAssignRuleType> vrf_assign_rule) {
        this.vrf_assign_rule = vrf_assign_rule;
    }
    
    public List<VrfAssignRuleType> getVrfAssignRule() {
        return vrf_assign_rule;
    }
    
    
    public void addVrfAssignRule(VrfAssignRuleType obj) {
        if (vrf_assign_rule == null) {
            vrf_assign_rule = new ArrayList<VrfAssignRuleType>();
        }
        vrf_assign_rule.add(obj);
    }
    public void clearVrfAssignRule() {
        vrf_assign_rule = null;
    }
    
    
    public void addVrfAssignRule(VrfAssignRuleType.MatchConditionType match_condition, Integer vlan_tag, String routing_instance, boolean ignore_acl) {
        if (vrf_assign_rule == null) {
            vrf_assign_rule = new ArrayList<VrfAssignRuleType>();
        }
        vrf_assign_rule.add(new VrfAssignRuleType(match_condition, vlan_tag, routing_instance, ignore_acl));
    }
    
}
