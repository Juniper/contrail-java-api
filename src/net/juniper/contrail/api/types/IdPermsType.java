//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class IdPermsType extends ApiPropertyBase {
    public static class PermType {
        String owner;
        Integer owner_access;
        String group;
        Integer group_access;
        Integer other_access;
        public PermType() {
        }
        public PermType(String owner, Integer owner_access, String group, Integer group_access, Integer other_access) {
            this.owner = owner;
            this.owner_access = owner_access;
            this.group = group;
            this.group_access = group_access;
            this.other_access = other_access;
        }
        public PermType(String owner) {
            this(owner, null, null, null, null);         }
        public PermType(String owner, Integer owner_access) {
            this(owner, owner_access, null, null, null);         }
        public PermType(String owner, Integer owner_access, String group) {
            this(owner, owner_access, group, null, null);         }
        public PermType(String owner, Integer owner_access, String group, Integer group_access) {
            this(owner, owner_access, group, group_access, null);         }
        
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
        
        
        public String getGroup() {
            return group;
        }
        
        public void setGroup(String group) {
            this.group = group;
        }
        
        
        public Integer getGroupAccess() {
            return group_access;
        }
        
        public void setGroupAccess(Integer group_access) {
            this.group_access = group_access;
        }
        
        
        public Integer getOtherAccess() {
            return other_access;
        }
        
        public void setOtherAccess(Integer other_access) {
            this.other_access = other_access;
        }
        
    }
    public static class UuidType {
        BigDecimal uuid_mslong;
        BigDecimal uuid_lslong;

        public UuidType() {
        }

        public UuidType(BigDecimal uuid_mslong) {
            this.uuid_mslong = uuid_mslong;
        }

        public UuidType(BigDecimal uuid_mslong, BigDecimal uuid_lslong) {
            this.uuid_mslong = uuid_mslong;
            this.uuid_lslong = uuid_lslong;
        }

        public BigDecimal getUuid_mslong() {
            return uuid_mslong;
        }

        public void setUuid_mslong(BigDecimal uuid_mslong) {
            this.uuid_mslong = uuid_mslong;
        }

        public BigDecimal getUuid_lslong() {
            return uuid_lslong;
        }

        public void setUuid_lslong(BigDecimal uuid_lslong) {
            this.uuid_lslong = uuid_lslong;
        }
    }
    PermType permissions;
    UuidType uuid;
    boolean enable;
    volatile java.util.Date created;
    volatile java.util.Date last_modified;
    String description;
    boolean user_visible;
    String creator;
    public IdPermsType() {
    }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable, java.util.Date created, java.util.Date last_modified, String description, boolean user_visible, String creator) {
        this.permissions = permissions;
        this.uuid = uuid;
        this.enable = enable;
        this.created = created;
        this.last_modified = last_modified;
        this.description = description;
        this.user_visible = user_visible;
        this.creator = creator;
    }
    public IdPermsType(PermType permissions) {
        this(permissions, null, false, null, null, null, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid) {
        this(permissions, uuid, false, null, null, null, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable) {
        this(permissions, uuid, enable, null, null, null, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable, java.util.Date created) {
        this(permissions, uuid, enable, created, null, null, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable, java.util.Date created, java.util.Date last_modified) {
        this(permissions, uuid, enable, created, last_modified, null, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable, java.util.Date created, java.util.Date last_modified, String description) {
        this(permissions, uuid, enable, created, last_modified, description, true, null);     }
    public IdPermsType(PermType permissions, UuidType uuid, boolean enable, java.util.Date created, java.util.Date last_modified, String description, boolean user_visible) {
        this(permissions, uuid, enable, created, last_modified, description, user_visible, null);     }
    
    public PermType getPermissions() {
        return permissions;
    }
    
    public void setPermissions(PermType permissions) {
        this.permissions = permissions;
    }
    
    
    public UuidType getUuid() {
        return uuid;
    }
    
    public void setUuid(UuidType uuid) {
        this.uuid = uuid;
    }
    
    
    public boolean getEnable() {
        return enable;
    }
    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    
    public java.util.Date getCreated() {
        return created;
    }
    
    public void setCreated(java.util.Date created) {
        this.created = created;
    }
    
    
    public java.util.Date getLastModified() {
        return last_modified;
    }
    
    public void setLastModified(java.util.Date last_modified) {
        this.last_modified = last_modified;
    }
    
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    
    public boolean getUserVisible() {
        return user_visible;
    }
    
    public void setUserVisible(boolean user_visible) {
        this.user_visible = user_visible;
    }
    
    
    public String getCreator() {
        return creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
}
