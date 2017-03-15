//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class FlowAgingTimeoutList extends ApiPropertyBase {
    public static class FlowAgingTimeout {
        String protocol;
        Integer port;
        Integer timeout_in_seconds;
        public FlowAgingTimeout() {
        }
        public FlowAgingTimeout(String protocol, Integer port, Integer timeout_in_seconds) {
            this.protocol = protocol;
            this.port = port;
            this.timeout_in_seconds = timeout_in_seconds;
        }
        public FlowAgingTimeout(String protocol) {
            this(protocol, null, null);         }
        public FlowAgingTimeout(String protocol, Integer port) {
            this(protocol, port, null);         }
        
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
        
        
        public Integer getTimeoutInSeconds() {
            return timeout_in_seconds;
        }
        
        public void setTimeoutInSeconds(Integer timeout_in_seconds) {
            this.timeout_in_seconds = timeout_in_seconds;
        }
        
    }
    List<FlowAgingTimeout> flow_aging_timeout;
    public FlowAgingTimeoutList() {
    }
    public FlowAgingTimeoutList(List<FlowAgingTimeout> flow_aging_timeout) {
        this.flow_aging_timeout = flow_aging_timeout;
    }
    
    public List<FlowAgingTimeout> getFlowAgingTimeout() {
        return flow_aging_timeout;
    }
    
    
    public void addFlowAgingTimeout(FlowAgingTimeout obj) {
        if (flow_aging_timeout == null) {
            flow_aging_timeout = new ArrayList<FlowAgingTimeout>();
        }
        flow_aging_timeout.add(obj);
    }
    public void clearFlowAgingTimeout() {
        flow_aging_timeout = null;
    }
    
    
    public void addFlowAgingTimeout(String protocol, Integer port, Integer timeout_in_seconds) {
        if (flow_aging_timeout == null) {
            flow_aging_timeout = new ArrayList<FlowAgingTimeout>();
        }
        flow_aging_timeout.add(new FlowAgingTimeout(protocol, port, timeout_in_seconds));
    }
    
}
