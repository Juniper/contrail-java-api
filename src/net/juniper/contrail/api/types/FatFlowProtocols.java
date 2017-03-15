//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class FatFlowProtocols extends ApiPropertyBase {
    public static class ProtocolType {
        String protocol;
        Integer port;
        public ProtocolType() {
        }
        public ProtocolType(String protocol, Integer port) {
            this.protocol = protocol;
            this.port = port;
        }
        public ProtocolType(String protocol) {
            this(protocol, null);         }
        
        public String getProtocol() {
            return protocol;
        }
        
        public void setProtocol(String protocol) {
            this.protocol = protocol;
        }
        
        
        public Integer getPort() {
            return port;
        }
        
        public void setPort(Integer port) {
            this.port = port;
        }
        
    }
    List<ProtocolType> fat_flow_protocol;
    public FatFlowProtocols() {
    }
    public FatFlowProtocols(List<ProtocolType> fat_flow_protocol) {
        this.fat_flow_protocol = fat_flow_protocol;
    }
    
    public List<ProtocolType> getFatFlowProtocol() {
        return fat_flow_protocol;
    }
    
    
    public void addFatFlowProtocol(ProtocolType obj) {
        if (fat_flow_protocol == null) {
            fat_flow_protocol = new ArrayList<ProtocolType>();
        }
        fat_flow_protocol.add(obj);
    }
    public void clearFatFlowProtocol() {
        fat_flow_protocol = null;
    }
    
    
    public void addFatFlowProtocol(String protocol, Integer port) {
        if (fat_flow_protocol == null) {
            fat_flow_protocol = new ArrayList<ProtocolType>();
        }
        fat_flow_protocol.add(new ProtocolType(protocol, port));
    }
    
}
