//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class AllowedAddressPairs extends ApiPropertyBase {
    public static class AllowedAddressPair {
        SubnetType ip;
        String mac;
        String address_mode;
        public AllowedAddressPair() {
        }
        public AllowedAddressPair(SubnetType ip, String mac, String address_mode) {
            this.ip = ip;
            this.mac = mac;
            this.address_mode = address_mode;
        }
        public AllowedAddressPair(SubnetType ip) {
            this(ip, null, null);         }
        public AllowedAddressPair(SubnetType ip, String mac) {
            this(ip, mac, null);         }
        
        public SubnetType getIp() {
            return ip;
        }
        
        public void setIp(SubnetType ip) {
            this.ip = ip;
        }
        
        
        public String getMac() {
            return mac;
        }
        
        public void setMac(String mac) {
            this.mac = mac;
        }
        
        
        public String getAddressMode() {
            return address_mode;
        }
        
        public void setAddressMode(String address_mode) {
            this.address_mode = address_mode;
        }
        
    }
    List<AllowedAddressPair> allowed_address_pair;
    public AllowedAddressPairs() {
    }
    public AllowedAddressPairs(List<AllowedAddressPair> allowed_address_pair) {
        this.allowed_address_pair = allowed_address_pair;
    }
    
    public List<AllowedAddressPair> getAllowedAddressPair() {
        return allowed_address_pair;
    }
    
    
    public void addAllowedAddressPair(AllowedAddressPair obj) {
        if (allowed_address_pair == null) {
            allowed_address_pair = new ArrayList<AllowedAddressPair>();
        }
        allowed_address_pair.add(obj);
    }
    public void clearAllowedAddressPair() {
        allowed_address_pair = null;
    }
    
    
    public void addAllowedAddressPair(SubnetType ip, String mac, String address_mode) {
        if (allowed_address_pair == null) {
            allowed_address_pair = new ArrayList<AllowedAddressPair>();
        }
        allowed_address_pair.add(new AllowedAddressPair(ip, mac, address_mode));
    }
    
}
