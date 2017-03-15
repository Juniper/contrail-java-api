//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VirtualMachineInterfacePropertiesType extends ApiPropertyBase {
    public static class InterfaceMirrorType {
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
                    this(vtep_dst_ip_address, null, null);                 }
                public StaticMirrorNhType(String vtep_dst_ip_address, String vtep_dst_mac_address) {
                    this(vtep_dst_ip_address, vtep_dst_mac_address, null);                 }
                
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
                this(analyzer_name, null, null, null, null, null, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation) {
                this(analyzer_name, encapsulation, null, null, null, null, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address) {
                this(analyzer_name, encapsulation, analyzer_ip_address, null, null, null, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, null, null, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, null, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, true, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, null, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, null, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode, StaticMirrorNhType static_nh_header) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, static_nh_header, false, null);             }
            public MirrorActionType(String analyzer_name, String encapsulation, String analyzer_ip_address, String analyzer_mac_address, String routing_instance, Integer udp_port, boolean juniper_header, String nh_mode, StaticMirrorNhType static_nh_header, boolean nic_assisted_mirroring) {
                this(analyzer_name, encapsulation, analyzer_ip_address, analyzer_mac_address, routing_instance, udp_port, juniper_header, nh_mode, static_nh_header, nic_assisted_mirroring, null);             }
            
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
        String traffic_direction;
        MirrorActionType mirror_to;
        public InterfaceMirrorType() {
        }
        public InterfaceMirrorType(String traffic_direction, MirrorActionType mirror_to) {
            this.traffic_direction = traffic_direction;
            this.mirror_to = mirror_to;
        }
        public InterfaceMirrorType(String traffic_direction) {
            this(traffic_direction, null);         }
        
        public String getTrafficDirection() {
            return traffic_direction;
        }
        
        public void setTrafficDirection(String traffic_direction) {
            this.traffic_direction = traffic_direction;
        }
        
        
        public MirrorActionType getMirrorTo() {
            return mirror_to;
        }
        
        public void setMirrorTo(MirrorActionType mirror_to) {
            this.mirror_to = mirror_to;
        }
        
    }
    String service_interface_type;
    InterfaceMirrorType interface_mirror;
    Integer local_preference;
    Integer sub_interface_vlan_tag;
    public VirtualMachineInterfacePropertiesType() {
    }
    public VirtualMachineInterfacePropertiesType(String service_interface_type, InterfaceMirrorType interface_mirror, Integer local_preference, Integer sub_interface_vlan_tag) {
        this.service_interface_type = service_interface_type;
        this.interface_mirror = interface_mirror;
        this.local_preference = local_preference;
        this.sub_interface_vlan_tag = sub_interface_vlan_tag;
    }
    public VirtualMachineInterfacePropertiesType(String service_interface_type) {
        this(service_interface_type, null, null, null);     }
    public VirtualMachineInterfacePropertiesType(String service_interface_type, InterfaceMirrorType interface_mirror) {
        this(service_interface_type, interface_mirror, null, null);     }
    public VirtualMachineInterfacePropertiesType(String service_interface_type, InterfaceMirrorType interface_mirror, Integer local_preference) {
        this(service_interface_type, interface_mirror, local_preference, null);     }
    
    public String getServiceInterfaceType() {
        return service_interface_type;
    }
    
    public void setServiceInterfaceType(String service_interface_type) {
        this.service_interface_type = service_interface_type;
    }
    
    
    public InterfaceMirrorType getInterfaceMirror() {
        return interface_mirror;
    }
    
    public void setInterfaceMirror(InterfaceMirrorType interface_mirror) {
        this.interface_mirror = interface_mirror;
    }
    
    
    public Integer getLocalPreference() {
        return local_preference;
    }
    
    public void setLocalPreference(Integer local_preference) {
        this.local_preference = local_preference;
    }
    
    
    public Integer getSubInterfaceVlanTag() {
        return sub_interface_vlan_tag;
    }
    
    public void setSubInterfaceVlanTag(Integer sub_interface_vlan_tag) {
        this.sub_interface_vlan_tag = sub_interface_vlan_tag;
    }
    
}
