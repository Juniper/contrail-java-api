//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class PermType2 extends ApiPropertyBase {
    public static class ShareType {
        String tenant;
        Integer tenant_access;
        public ShareType() {
        }
        public ShareType(String tenant, Integer tenant_access) {
            this.tenant = tenant;
            this.tenant_access = tenant_access;
        }
        public ShareType(String tenant) {
            this(tenant, null);         }
        
        public String getTenant() {
            return tenant;
        }
        
        public void setTenant(String tenant) {
            this.tenant = tenant;
        }
        
        
        public Integer getTenantAccess() {
            return tenant_access;
        }
        
        public void setTenantAccess(Integer tenant_access) {
            this.tenant_access = tenant_access;
        }
        
    }
    String owner;
    Integer owner_access;
    Integer global_access;
    List<ShareType> share;
    public PermType2() {
    }
    public PermType2(String owner, Integer owner_access, Integer global_access, List<ShareType> share) {
        this.owner = owner;
        this.owner_access = owner_access;
        this.global_access = global_access;
        this.share = share;
    }
    public PermType2(String owner) {
        this(owner, null, null, null);     }
    public PermType2(String owner, Integer owner_access) {
        this(owner, owner_access, null, null);     }
    public PermType2(String owner, Integer owner_access, Integer global_access) {
        this(owner, owner_access, global_access, null);     }
    
    public String getOwner() {
        return owner;
    }
    
    public void setOwner(String owner) {
        this.owner = owner;
    }
    
    
    public Integer getOwnerAccess() {
        return owner_access;
    }
    
    public void setOwnerAccess(Integer owner_access) {
        this.owner_access = owner_access;
    }
    
    
    public Integer getGlobalAccess() {
        return global_access;
    }
    
    public void setGlobalAccess(Integer global_access) {
        this.global_access = global_access;
    }
    
    
    public List<ShareType> getShare() {
        return share;
    }
    
    
    public void addShare(ShareType obj) {
        if (share == null) {
            share = new ArrayList<ShareType>();
        }
        share.add(obj);
    }
    public void clearShare() {
        share = null;
    }
    
    
    public void addShare(String tenant, Integer tenant_access) {
        if (share == null) {
            share = new ArrayList<ShareType>();
        }
        share.add(new ShareType(tenant, tenant_access));
    }
    
}
