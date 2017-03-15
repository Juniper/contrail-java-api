//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class LoadbalancerMemberType extends ApiPropertyBase {
    boolean admin_state;
    String status;
    String status_description;
    Integer protocol_port;
    Integer weight;
    String address;
    public LoadbalancerMemberType() {
    }
    public LoadbalancerMemberType(boolean admin_state, String status, String status_description, Integer protocol_port, Integer weight, String address) {
        this.admin_state = admin_state;
        this.status = status;
        this.status_description = status_description;
        this.protocol_port = protocol_port;
        this.weight = weight;
        this.address = address;
    }
    public LoadbalancerMemberType(boolean admin_state) {
        this(admin_state, null, null, null, 1, null);     }
    public LoadbalancerMemberType(boolean admin_state, String status) {
        this(admin_state, status, null, null, 1, null);     }
    public LoadbalancerMemberType(boolean admin_state, String status, String status_description) {
        this(admin_state, status, status_description, null, 1, null);     }
    public LoadbalancerMemberType(boolean admin_state, String status, String status_description, Integer protocol_port) {
        this(admin_state, status, status_description, protocol_port, 1, null);     }
    public LoadbalancerMemberType(boolean admin_state, String status, String status_description, Integer protocol_port, Integer weight) {
        this(admin_state, status, status_description, protocol_port, weight, null);     }
    
    public boolean getAdminState() {
        return admin_state;
    }
    
    public void setAdminState(boolean admin_state) {
        this.admin_state = admin_state;
    }
    
    
    public String getStatus() {
        return status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    
    public String getStatusDescription() {
        return status_description;
    }
    
    public void setStatusDescription(String status_description) {
        this.status_description = status_description;
    }
    
    
    public Integer getProtocolPort() {
        return protocol_port;
    }
    
    public void setProtocolPort(Integer protocol_port) {
        this.protocol_port = protocol_port;
    }
    
    
    public Integer getWeight() {
        return weight;
    }
    
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
}
