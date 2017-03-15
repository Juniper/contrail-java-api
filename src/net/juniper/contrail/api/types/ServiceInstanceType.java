//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class ServiceInstanceType extends ApiPropertyBase {
    public static class ServiceInstanceInterfaceType {
        String virtual_network;
        String ip_address;
        RouteTableType static_routes;
        AllowedAddressPairs allowed_address_pairs;
        public ServiceInstanceInterfaceType() {
        }
        public ServiceInstanceInterfaceType(String virtual_network, String ip_address, RouteTableType static_routes, AllowedAddressPairs allowed_address_pairs) {
            this.virtual_network = virtual_network;
            this.ip_address = ip_address;
            this.static_routes = static_routes;
            this.allowed_address_pairs = allowed_address_pairs;
        }
        public ServiceInstanceInterfaceType(String virtual_network) {
            this(virtual_network, null, null, null);         }
        public ServiceInstanceInterfaceType(String virtual_network, String ip_address) {
            this(virtual_network, ip_address, null, null);         }
        public ServiceInstanceInterfaceType(String virtual_network, String ip_address, RouteTableType static_routes) {
            this(virtual_network, ip_address, static_routes, null);         }
        
        public String getVirtualNetwork() {
            return virtual_network;
        }
        
        public void setVirtualNetwork(String virtual_network) {
            this.virtual_network = virtual_network;
        }
        
        
        public String getIpAddress() {
            return ip_address;
        }
        
        public void setIpAddress(String ip_address) {
            this.ip_address = ip_address;
        }
        
        
        public RouteTableType getStaticRoutes() {
            return static_routes;
        }
        
        public void setStaticRoutes(RouteTableType static_routes) {
            this.static_routes = static_routes;
        }
        
        
        public AllowedAddressPairs getAllowedAddressPairs() {
            return allowed_address_pairs;
        }
        
        public void setAllowedAddressPairs(AllowedAddressPairs allowed_address_pairs) {
            this.allowed_address_pairs = allowed_address_pairs;
        }
        
    }
    public static class ServiceScaleOutType {
        Integer max_instances;
        boolean auto_scale;
        public ServiceScaleOutType() {
        }
        public ServiceScaleOutType(Integer max_instances, boolean auto_scale) {
            this.max_instances = max_instances;
            this.auto_scale = auto_scale;
        }
        public ServiceScaleOutType(Integer max_instances) {
            this(max_instances, false);         }
        
        public Integer getMaxInstances() {
            return max_instances;
        }
        
        public void setMaxInstances(Integer max_instances) {
            this.max_instances = max_instances;
        }
        
        
        public boolean getAutoScale() {
            return auto_scale;
        }
        
        public void setAutoScale(boolean auto_scale) {
            this.auto_scale = auto_scale;
        }
        
    }
    boolean auto_policy;
    String availability_zone;
    String management_virtual_network;
    String left_virtual_network;
    String left_ip_address;
    String right_virtual_network;
    String right_ip_address;
    List<ServiceInstanceInterfaceType> interface_list;
    ServiceScaleOutType scale_out;
    String ha_mode;
    String virtual_router_id;
    public ServiceInstanceType() {
    }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network, String right_ip_address, List<ServiceInstanceInterfaceType> interface_list, ServiceScaleOutType scale_out, String ha_mode, String virtual_router_id) {
        this.auto_policy = auto_policy;
        this.availability_zone = availability_zone;
        this.management_virtual_network = management_virtual_network;
        this.left_virtual_network = left_virtual_network;
        this.left_ip_address = left_ip_address;
        this.right_virtual_network = right_virtual_network;
        this.right_ip_address = right_ip_address;
        this.interface_list = interface_list;
        this.scale_out = scale_out;
        this.ha_mode = ha_mode;
        this.virtual_router_id = virtual_router_id;
    }
    public ServiceInstanceType(boolean auto_policy) {
        this(auto_policy, null, null, null, null, null, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone) {
        this(auto_policy, availability_zone, null, null, null, null, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network) {
        this(auto_policy, availability_zone, management_virtual_network, null, null, null, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, null, null, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, null, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, right_virtual_network, null, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network, String right_ip_address) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, right_virtual_network, right_ip_address, null, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network, String right_ip_address, List<ServiceInstanceInterfaceType> interface_list) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, right_virtual_network, right_ip_address, interface_list, null, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network, String right_ip_address, List<ServiceInstanceInterfaceType> interface_list, ServiceScaleOutType scale_out) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, right_virtual_network, right_ip_address, interface_list, scale_out, null, null);     }
    public ServiceInstanceType(boolean auto_policy, String availability_zone, String management_virtual_network, String left_virtual_network, String left_ip_address, String right_virtual_network, String right_ip_address, List<ServiceInstanceInterfaceType> interface_list, ServiceScaleOutType scale_out, String ha_mode) {
        this(auto_policy, availability_zone, management_virtual_network, left_virtual_network, left_ip_address, right_virtual_network, right_ip_address, interface_list, scale_out, ha_mode, null);     }
    
    public boolean getAutoPolicy() {
        return auto_policy;
    }
    
    public void setAutoPolicy(boolean auto_policy) {
        this.auto_policy = auto_policy;
    }
    
    
    public String getAvailabilityZone() {
        return availability_zone;
    }
    
    public void setAvailabilityZone(String availability_zone) {
        this.availability_zone = availability_zone;
    }
    
    
    public String getManagementVirtualNetwork() {
        return management_virtual_network;
    }
    
    public void setManagementVirtualNetwork(String management_virtual_network) {
        this.management_virtual_network = management_virtual_network;
    }
    
    
    public String getLeftVirtualNetwork() {
        return left_virtual_network;
    }
    
    public void setLeftVirtualNetwork(String left_virtual_network) {
        this.left_virtual_network = left_virtual_network;
    }
    
    
    public String getLeftIpAddress() {
        return left_ip_address;
    }
    
    public void setLeftIpAddress(String left_ip_address) {
        this.left_ip_address = left_ip_address;
    }
    
    
    public String getRightVirtualNetwork() {
        return right_virtual_network;
    }
    
    public void setRightVirtualNetwork(String right_virtual_network) {
        this.right_virtual_network = right_virtual_network;
    }
    
    
    public String getRightIpAddress() {
        return right_ip_address;
    }
    
    public void setRightIpAddress(String right_ip_address) {
        this.right_ip_address = right_ip_address;
    }
    
    
    public ServiceScaleOutType getScaleOut() {
        return scale_out;
    }
    
    public void setScaleOut(ServiceScaleOutType scale_out) {
        this.scale_out = scale_out;
    }
    
    
    public String getHaMode() {
        return ha_mode;
    }
    
    public void setHaMode(String ha_mode) {
        this.ha_mode = ha_mode;
    }
    
    
    public String getVirtualRouterId() {
        return virtual_router_id;
    }
    
    public void setVirtualRouterId(String virtual_router_id) {
        this.virtual_router_id = virtual_router_id;
    }
    
    
    public List<ServiceInstanceInterfaceType> getInterfaceList() {
        return interface_list;
    }
    
    
    public void addInterface(ServiceInstanceInterfaceType obj) {
        if (interface_list == null) {
            interface_list = new ArrayList<ServiceInstanceInterfaceType>();
        }
        interface_list.add(obj);
    }
    public void clearInterface() {
        interface_list = null;
    }
    
    
    public void addInterface(String virtual_network, String ip_address, RouteTableType static_routes, AllowedAddressPairs allowed_address_pairs) {
        if (interface_list == null) {
            interface_list = new ArrayList<ServiceInstanceInterfaceType>();
        }
        interface_list.add(new ServiceInstanceInterfaceType(virtual_network, ip_address, static_routes, allowed_address_pairs));
    }
    
}
