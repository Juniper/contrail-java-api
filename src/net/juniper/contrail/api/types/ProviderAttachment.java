//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;
import com.google.common.collect.ImmutableList;

import net.juniper.contrail.api.ApiObjectBase;
import net.juniper.contrail.api.ApiPropertyBase;
import net.juniper.contrail.api.ObjectReference;

public class ProviderAttachment extends ApiObjectBase {
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_router_refs;

    @Override
    public String getObjectType() {
        return "provider-attachment";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of();
    }

    @Override
    public String getDefaultParentType() {
        return null;
    }
    
    public IdPermsType getIdPerms() {
        return id_perms;
    }
    
    public void setIdPerms(IdPermsType id_perms) {
        this.id_perms = id_perms;
    }
    
    
    public PermType2 getPerms2() {
        return perms2;
    }
    
    public void setPerms2(PermType2 perms2) {
        this.perms2 = perms2;
    }
    
    
    public KeyValuePairs getAnnotations() {
        return annotations;
    }
    
    public void setAnnotations(KeyValuePairs annotations) {
        this.annotations = annotations;
    }
    
    
    public String getDisplayName() {
        return display_name;
    }
    
    public void setDisplayName(String display_name) {
        this.display_name = display_name;
    }
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualRouter() {
        return virtual_router_refs;
    }

    public void setVirtualRouter(VirtualRouter obj) {
        virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualRouter(VirtualRouter obj) {
        if (virtual_router_refs == null) {
            virtual_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualRouter() {
        if (virtual_router_refs != null) {
            virtual_router_refs.clear();
            return;
        }
        virtual_router_refs = null;
    }
}