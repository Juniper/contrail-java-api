//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VnSubnetsType extends ApiPropertyBase {
    public static class IpamSubnetType {
        public static class AllocationPoolType {
            String start;
            String end;
            public AllocationPoolType() {
            }
            public AllocationPoolType(String start, String end) {
                this.start = start;
                this.end = end;
            }
            public AllocationPoolType(String start) {
                this(start, null);             }
            
            public String getStart() {
                return start;
            }
            
            public void setStart(String start) {
                this.start = start;
            }
            
            
            public String getEnd() {
                return end;
            }
            
            public void setEnd(String end) {
                this.end = end;
            }
            
        }
        SubnetType subnet;
        String default_gateway;
        String dns_server_address;
        String subnet_uuid;
        boolean enable_dhcp;
        List<String> dns_nameservers;
        List<AllocationPoolType> allocation_pools;
        boolean addr_from_start;
        DhcpOptionsListType dhcp_option_list;
        RouteTableType host_routes;
        String subnet_name;
        Integer alloc_unit;
        public IpamSubnetType() {
        }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools, boolean addr_from_start, DhcpOptionsListType dhcp_option_list, RouteTableType host_routes, String subnet_name, Integer alloc_unit) {
            this.subnet = subnet;
            this.default_gateway = default_gateway;
            this.dns_server_address = dns_server_address;
            this.subnet_uuid = subnet_uuid;
            this.enable_dhcp = enable_dhcp;
            this.dns_nameservers = dns_nameservers;
            this.allocation_pools = allocation_pools;
            this.addr_from_start = addr_from_start;
            this.dhcp_option_list = dhcp_option_list;
            this.host_routes = host_routes;
            this.subnet_name = subnet_name;
            this.alloc_unit = alloc_unit;
        }
        public IpamSubnetType(SubnetType subnet) {
            this(subnet, null, null, null, true, null, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway) {
            this(subnet, default_gateway, null, null, true, null, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address) {
            this(subnet, default_gateway, dns_server_address, null, true, null, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, true, null, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, null, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, null, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, allocation_pools, false, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools, boolean addr_from_start) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, allocation_pools, addr_from_start, null, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools, boolean addr_from_start, DhcpOptionsListType dhcp_option_list) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, allocation_pools, addr_from_start, dhcp_option_list, null, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools, boolean addr_from_start, DhcpOptionsListType dhcp_option_list, RouteTableType host_routes) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, allocation_pools, addr_from_start, dhcp_option_list, host_routes, null, 1);         }
        public IpamSubnetType(SubnetType subnet, String default_gateway, String dns_server_address, String subnet_uuid, boolean enable_dhcp, List<String> dns_nameservers, List<AllocationPoolType> allocation_pools, boolean addr_from_start, DhcpOptionsListType dhcp_option_list, RouteTableType host_routes, String subnet_name) {
            this(subnet, default_gateway, dns_server_address, subnet_uuid, enable_dhcp, dns_nameservers, allocation_pools, addr_from_start, dhcp_option_list, host_routes, subnet_name, 1);         }
        
        public SubnetType getSubnet() {
            return subnet;
        }
        
        public void setSubnet(SubnetType subnet) {
            this.subnet = subnet;
        }
        
        
        public String getDefaultGateway() {
            return default_gateway;
        }
        
        public void setDefaultGateway(String default_gateway) {
            this.default_gateway = default_gateway;
        }
        
        
        public String getDnsServerAddress() {
            return dns_server_address;
        }
        
        public void setDnsServerAddress(String dns_server_address) {
            this.dns_server_address = dns_server_address;
        }
        
        
        public String getSubnetUuid() {
            return subnet_uuid;
        }
        
        public void setSubnetUuid(String subnet_uuid) {
            this.subnet_uuid = subnet_uuid;
        }
        
        
        public boolean getEnableDhcp() {
            return enable_dhcp;
        }
        
        public void setEnableDhcp(boolean enable_dhcp) {
            this.enable_dhcp = enable_dhcp;
        }
        
        
        public boolean getAddrFromStart() {
            return addr_from_start;
        }
        
        public void setAddrFromStart(boolean addr_from_start) {
            this.addr_from_start = addr_from_start;
        }
        
        
        public DhcpOptionsListType getDhcpOptionList() {
            return dhcp_option_list;
        }
        
        public void setDhcpOptionList(DhcpOptionsListType dhcp_option_list) {
            this.dhcp_option_list = dhcp_option_list;
        }
        
        
        public RouteTableType getHostRoutes() {
            return host_routes;
        }
        
        public void setHostRoutes(RouteTableType host_routes) {
            this.host_routes = host_routes;
        }
        
        
        public String getSubnetName() {
            return subnet_name;
        }
        
        public void setSubnetName(String subnet_name) {
            this.subnet_name = subnet_name;
        }
        
        
        public Integer getAllocUnit() {
            return alloc_unit;
        }
        
        public void setAllocUnit(Integer alloc_unit) {
            this.alloc_unit = alloc_unit;
        }
        
        
        public List<String> getDnsNameservers() {
            return dns_nameservers;
        }
        
        
        public void addDnsNameservers(String obj) {
            if (dns_nameservers == null) {
                dns_nameservers = new ArrayList<String>();
            }
            dns_nameservers.add(obj);
        }
        public void clearDnsNameservers() {
            dns_nameservers = null;
        }
        
        
        public List<AllocationPoolType> getAllocationPools() {
            return allocation_pools;
        }
        
        
        public void addAllocationPools(AllocationPoolType obj) {
            if (allocation_pools == null) {
                allocation_pools = new ArrayList<AllocationPoolType>();
            }
            allocation_pools.add(obj);
        }
        public void clearAllocationPools() {
            allocation_pools = null;
        }
        
        
        public void addAllocationPools(String start, String end) {
            if (allocation_pools == null) {
                allocation_pools = new ArrayList<AllocationPoolType>();
            }
            allocation_pools.add(new AllocationPoolType(start, end));
        }
        
    }
    List<IpamSubnetType> ipam_subnets;
    RouteTableType host_routes;
    public VnSubnetsType() {
    }
    public VnSubnetsType(List<IpamSubnetType> ipam_subnets, RouteTableType host_routes) {
        this.ipam_subnets = ipam_subnets;
        this.host_routes = host_routes;
    }
    public VnSubnetsType(List<IpamSubnetType> ipam_subnets) {
        this(ipam_subnets, null);     }
    
    public RouteTableType getHostRoutes() {
        return host_routes;
    }
    
    public void setHostRoutes(RouteTableType host_routes) {
        this.host_routes = host_routes;
    }
    
    
    public List<IpamSubnetType> getIpamSubnets() {
        return ipam_subnets;
    }
    
    
    public void addIpamSubnets(IpamSubnetType obj) {
        if (ipam_subnets == null) {
            ipam_subnets = new ArrayList<IpamSubnetType>();
        }
        ipam_subnets.add(obj);
    }
    public void clearIpamSubnets() {
        ipam_subnets = null;
    }
    
}
