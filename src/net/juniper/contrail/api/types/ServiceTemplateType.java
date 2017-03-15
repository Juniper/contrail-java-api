//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class ServiceTemplateType extends ApiPropertyBase {
    public static class ServiceTemplateInterfaceType {
        String service_interface_type;
        boolean shared_ip;
        boolean static_route_enable;
        public ServiceTemplateInterfaceType() {
        }
        public ServiceTemplateInterfaceType(String service_interface_type, boolean shared_ip, boolean static_route_enable) {
            this.service_interface_type = service_interface_type;
            this.shared_ip = shared_ip;
            this.static_route_enable = static_route_enable;
        }
        public ServiceTemplateInterfaceType(String service_interface_type) {
            this(service_interface_type, false, false);         }
        public ServiceTemplateInterfaceType(String service_interface_type, boolean shared_ip) {
            this(service_interface_type, shared_ip, false);         }
        
        public String getServiceInterfaceType() {
            return service_interface_type;
        }
        
        public void setServiceInterfaceType(String service_interface_type) {
            this.service_interface_type = service_interface_type;
        }
        
        
        public boolean getSharedIp() {
            return shared_ip;
        }
        
        public void setSharedIp(boolean shared_ip) {
            this.shared_ip = shared_ip;
        }
        
        
        public boolean getStaticRouteEnable() {
            return static_route_enable;
        }
        
        public void setStaticRouteEnable(boolean static_route_enable) {
            this.static_route_enable = static_route_enable;
        }
        
    }
    Integer version;
    String service_mode;
    String service_type;
    String image_name;
    boolean service_scaling;
    List<ServiceTemplateInterfaceType> interface_type;
    String flavor;
    boolean ordered_interfaces;
    String service_virtualization_type;
    boolean availability_zone_enable;
    String vrouter_instance_type;
    String instance_data;
    public ServiceTemplateType() {
    }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor, boolean ordered_interfaces, String service_virtualization_type, boolean availability_zone_enable, String vrouter_instance_type, String instance_data) {
        this.version = version;
        this.service_mode = service_mode;
        this.service_type = service_type;
        this.image_name = image_name;
        this.service_scaling = service_scaling;
        this.interface_type = interface_type;
        this.flavor = flavor;
        this.ordered_interfaces = ordered_interfaces;
        this.service_virtualization_type = service_virtualization_type;
        this.availability_zone_enable = availability_zone_enable;
        this.vrouter_instance_type = vrouter_instance_type;
        this.instance_data = instance_data;
    }
    public ServiceTemplateType(Integer version) {
        this(version, null, null, null, false, null, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode) {
        this(version, service_mode, null, null, false, null, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type) {
        this(version, service_mode, service_type, null, false, null, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name) {
        this(version, service_mode, service_type, image_name, false, null, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling) {
        this(version, service_mode, service_type, image_name, service_scaling, null, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, null, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, flavor, false, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor, boolean ordered_interfaces) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, flavor, ordered_interfaces, null, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor, boolean ordered_interfaces, String service_virtualization_type) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, flavor, ordered_interfaces, service_virtualization_type, false, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor, boolean ordered_interfaces, String service_virtualization_type, boolean availability_zone_enable) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, flavor, ordered_interfaces, service_virtualization_type, availability_zone_enable, null, null);     }
    public ServiceTemplateType(Integer version, String service_mode, String service_type, String image_name, boolean service_scaling, List<ServiceTemplateInterfaceType> interface_type, String flavor, boolean ordered_interfaces, String service_virtualization_type, boolean availability_zone_enable, String vrouter_instance_type) {
        this(version, service_mode, service_type, image_name, service_scaling, interface_type, flavor, ordered_interfaces, service_virtualization_type, availability_zone_enable, vrouter_instance_type, null);     }
    
    public Integer getVersion() {
        return version;
    }
    
    public void setVersion(Integer version) {
        this.version = version;
    }
    
    
    public String getServiceMode() {
        return service_mode;
    }
    
    public void setServiceMode(String service_mode) {
        this.service_mode = service_mode;
    }
    
    
    public String getServiceType() {
        return service_type;
    }
    
    public void setServiceType(String service_type) {
        this.service_type = service_type;
    }
    
    
    public String getImageName() {
        return image_name;
    }
    
    public void setImageName(String image_name) {
        this.image_name = image_name;
    }
    
    
    public boolean getServiceScaling() {
        return service_scaling;
    }
    
    public void setServiceScaling(boolean service_scaling) {
        this.service_scaling = service_scaling;
    }
    
    
    public String getFlavor() {
        return flavor;
    }
    
    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
    
    
    public boolean getOrderedInterfaces() {
        return ordered_interfaces;
    }
    
    public void setOrderedInterfaces(boolean ordered_interfaces) {
        this.ordered_interfaces = ordered_interfaces;
    }
    
    
    public String getServiceVirtualizationType() {
        return service_virtualization_type;
    }
    
    public void setServiceVirtualizationType(String service_virtualization_type) {
        this.service_virtualization_type = service_virtualization_type;
    }
    
    
    public boolean getAvailabilityZoneEnable() {
        return availability_zone_enable;
    }
    
    public void setAvailabilityZoneEnable(boolean availability_zone_enable) {
        this.availability_zone_enable = availability_zone_enable;
    }
    
    
    public String getVrouterInstanceType() {
        return vrouter_instance_type;
    }
    
    public void setVrouterInstanceType(String vrouter_instance_type) {
        this.vrouter_instance_type = vrouter_instance_type;
    }
    
    
    public String getInstanceData() {
        return instance_data;
    }
    
    public void setInstanceData(String instance_data) {
        this.instance_data = instance_data;
    }
    
    
    public List<ServiceTemplateInterfaceType> getInterfaceType() {
        return interface_type;
    }
    
    
    public void addInterfaceType(ServiceTemplateInterfaceType obj) {
        if (interface_type == null) {
            interface_type = new ArrayList<ServiceTemplateInterfaceType>();
        }
        interface_type.add(obj);
    }
    public void clearInterfaceType() {
        interface_type = null;
    }
    
    
    public void addInterfaceType(String service_interface_type, boolean shared_ip, boolean static_route_enable) {
        if (interface_type == null) {
            interface_type = new ArrayList<ServiceTemplateInterfaceType>();
        }
        interface_type.add(new ServiceTemplateInterfaceType(service_interface_type, shared_ip, static_route_enable));
    }
    
}
