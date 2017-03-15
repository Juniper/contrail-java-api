//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class DiscoveryServiceAssignmentType extends ApiPropertyBase {
    public static class DiscoveryPubSubEndPointType {
        String ep_type;
        String ep_id;
        SubnetType ep_prefix;
        String ep_version;
        public DiscoveryPubSubEndPointType() {
        }
        public DiscoveryPubSubEndPointType(String ep_type, String ep_id, SubnetType ep_prefix, String ep_version) {
            this.ep_type = ep_type;
            this.ep_id = ep_id;
            this.ep_prefix = ep_prefix;
            this.ep_version = ep_version;
        }
        public DiscoveryPubSubEndPointType(String ep_type) {
            this(ep_type, null, null, null);         }
        public DiscoveryPubSubEndPointType(String ep_type, String ep_id) {
            this(ep_type, ep_id, null, null);         }
        public DiscoveryPubSubEndPointType(String ep_type, String ep_id, SubnetType ep_prefix) {
            this(ep_type, ep_id, ep_prefix, null);         }
        
        public String getEpType() {
            return ep_type;
        }
        
        public void setEpType(String ep_type) {
            this.ep_type = ep_type;
        }
        
        
        public String getEpId() {
            return ep_id;
        }
        
        public void setEpId(String ep_id) {
            this.ep_id = ep_id;
        }
        
        
        public SubnetType getEpPrefix() {
            return ep_prefix;
        }
        
        public void setEpPrefix(SubnetType ep_prefix) {
            this.ep_prefix = ep_prefix;
        }
        
        
        public String getEpVersion() {
            return ep_version;
        }
        
        public void setEpVersion(String ep_version) {
            this.ep_version = ep_version;
        }
        
    }
    DiscoveryPubSubEndPointType publisher;
    List<DiscoveryPubSubEndPointType> subscriber;
    public DiscoveryServiceAssignmentType() {
    }
    public DiscoveryServiceAssignmentType(DiscoveryPubSubEndPointType publisher, List<DiscoveryPubSubEndPointType> subscriber) {
        this.publisher = publisher;
        this.subscriber = subscriber;
    }
    public DiscoveryServiceAssignmentType(DiscoveryPubSubEndPointType publisher) {
        this(publisher, null);     }
    
    public DiscoveryPubSubEndPointType getPublisher() {
        return publisher;
    }
    
    public void setPublisher(DiscoveryPubSubEndPointType publisher) {
        this.publisher = publisher;
    }
    
    
    public List<DiscoveryPubSubEndPointType> getSubscriber() {
        return subscriber;
    }
    
    
    public void addSubscriber(DiscoveryPubSubEndPointType obj) {
        if (subscriber == null) {
            subscriber = new ArrayList<DiscoveryPubSubEndPointType>();
        }
        subscriber.add(obj);
    }
    public void clearSubscriber() {
        subscriber = null;
    }
    
    
    public void addSubscriber(String ep_type, String ep_id, SubnetType ep_prefix, String ep_version) {
        if (subscriber == null) {
            subscriber = new ArrayList<DiscoveryPubSubEndPointType>();
        }
        subscriber.add(new DiscoveryPubSubEndPointType(ep_type, ep_id, ep_prefix, ep_version));
    }
    
}
