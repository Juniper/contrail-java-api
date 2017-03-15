//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VirtualNetworkType extends ApiPropertyBase {
    boolean allow_transit;
    Integer network_id;
    Integer vxlan_network_identifier;
    String forwarding_mode;
    String rpf;
    boolean mirror_destination;
    public VirtualNetworkType() {
    }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf, boolean mirror_destination) {
        this.allow_transit = allow_transit;
        this.network_id = network_id;
        this.vxlan_network_identifier = vxlan_network_identifier;
        this.forwarding_mode = forwarding_mode;
        this.rpf = rpf;
        this.mirror_destination = mirror_destination;
    }
    public VirtualNetworkType(boolean allow_transit) {
        this(allow_transit, null, null, null, null, false);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id) {
        this(allow_transit, network_id, null, null, null, false);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier) {
        this(allow_transit, network_id, vxlan_network_identifier, null, null, false);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, null, false);     }
    public VirtualNetworkType(boolean allow_transit, Integer network_id, Integer vxlan_network_identifier, String forwarding_mode, String rpf) {
        this(allow_transit, network_id, vxlan_network_identifier, forwarding_mode, rpf, false);     }
    
    public boolean getAllowTransit() {
        return allow_transit;
    }
    
    public void setAllowTransit(boolean allow_transit) {
        this.allow_transit = allow_transit;
    }
    
    
    public Integer getNetworkId() {
        return network_id;
    }
    
    public void setNetworkId(Integer network_id) {
        this.network_id = network_id;
    }
    
    
    public Integer getVxlanNetworkIdentifier() {
        return vxlan_network_identifier;
    }
    
    public void setVxlanNetworkIdentifier(Integer vxlan_network_identifier) {
        this.vxlan_network_identifier = vxlan_network_identifier;
    }
    
    
    public String getForwardingMode() {
        return forwarding_mode;
    }
    
    public void setForwardingMode(String forwarding_mode) {
        this.forwarding_mode = forwarding_mode;
    }
    
    
    public String getRpf() {
        return rpf;
    }
    
    public void setRpf(String rpf) {
        this.rpf = rpf;
    }
    
    
    public boolean getMirrorDestination() {
        return mirror_destination;
    }
    
    public void setMirrorDestination(boolean mirror_destination) {
        this.mirror_destination = mirror_destination;
    }
    
}
