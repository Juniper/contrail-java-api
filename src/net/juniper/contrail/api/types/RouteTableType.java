//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class RouteTableType extends ApiPropertyBase {
    public static class RouteType {
        public static class CommunityAttributes {
            List<String> community_attribute;
            public CommunityAttributes() {
            }
            public CommunityAttributes(List<String> community_attribute) {
                this.community_attribute = community_attribute;
            }
            
            public List<String> getCommunityAttribute() {
                return community_attribute;
            }
            
            
            public void addCommunityAttribute(String obj) {
                if (community_attribute == null) {
                    community_attribute = new ArrayList<String>();
                }
                community_attribute.add(obj);
            }
            public void clearCommunityAttribute() {
                community_attribute = null;
            }
            
        }
        String prefix;
        String next_hop;
        String next_hop_type;
        CommunityAttributes community_attributes;
        public RouteType() {
        }
        public RouteType(String prefix, String next_hop, String next_hop_type, CommunityAttributes community_attributes) {
            this.prefix = prefix;
            this.next_hop = next_hop;
            this.next_hop_type = next_hop_type;
            this.community_attributes = community_attributes;
        }
        public RouteType(String prefix) {
            this(prefix, null, null, null);         }
        public RouteType(String prefix, String next_hop) {
            this(prefix, next_hop, null, null);         }
        public RouteType(String prefix, String next_hop, String next_hop_type) {
            this(prefix, next_hop, next_hop_type, null);         }
        
        public String getPrefix() {
            return prefix;
        }
        
        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }
        
        
        public String getNextHop() {
            return next_hop;
        }
        
        public void setNextHop(String next_hop) {
            this.next_hop = next_hop;
        }
        
        
        public String getNextHopType() {
            return next_hop_type;
        }
        
        public void setNextHopType(String next_hop_type) {
            this.next_hop_type = next_hop_type;
        }
        
        
        public CommunityAttributes getCommunityAttributes() {
            return community_attributes;
        }
        
        public void setCommunityAttributes(CommunityAttributes community_attributes) {
            this.community_attributes = community_attributes;
        }
        
    }
    List<RouteType> route;
    public RouteTableType() {
    }
    public RouteTableType(List<RouteType> route) {
        this.route = route;
    }
    
    public List<RouteType> getRoute() {
        return route;
    }
    
    
    public void addRoute(RouteType obj) {
        if (route == null) {
            route = new ArrayList<RouteType>();
        }
        route.add(obj);
    }
    public void clearRoute() {
        route = null;
    }
    
    
    public void addRoute(String prefix, String next_hop, String next_hop_type, RouteType.CommunityAttributes community_attributes) {
        if (route == null) {
            route = new ArrayList<RouteType>();
        }
        route.add(new RouteType(prefix, next_hop, next_hop_type, community_attributes));
    }
    
}
