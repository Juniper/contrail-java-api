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

public class VirtualRouter extends ApiObjectBase {
    private String virtual_router_type;
    private boolean virtual_router_dpdk_enabled;
    private String virtual_router_ip_address;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_refs;
    private transient List<ObjectReference<ApiPropertyBase>> physical_router_back_refs;
    private transient List<ObjectReference<ApiPropertyBase>> provider_attachment_back_refs;

    @Override
    public String getObjectType() {
        return "virtual-router";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-global-system-config");
    }

    @Override
    public String getDefaultParentType() {
        return "global-system-config";
    }
    
    public String getType() {
        return virtual_router_type;
    }
    
    public void setType(String virtual_router_type) {
        this.virtual_router_type = virtual_router_type;
    }
    
    
    public boolean getDpdkEnabled() {
        return virtual_router_dpdk_enabled;
    }
    
    public void setDpdkEnabled(boolean virtual_router_dpdk_enabled) {
        this.virtual_router_dpdk_enabled = virtual_router_dpdk_enabled;
    }
    
    
    public String getIpAddress() {
        return virtual_router_ip_address;
    }
    
    public void setIpAddress(String virtual_router_ip_address) {
        this.virtual_router_ip_address = virtual_router_ip_address;
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
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachine() {
        return virtual_machine_refs;
    }

    public void setVirtualMachine(VirtualMachine obj) {
        virtual_machine_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_machine_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualMachine(VirtualMachine obj) {
        if (virtual_machine_refs == null) {
            virtual_machine_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_machine_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualMachine() {
        if (virtual_machine_refs != null) {
            virtual_machine_refs.clear();
            return;
        }
        virtual_machine_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalRouterBackRefs() {
        return physical_router_back_refs;
    }

    public List<ObjectReference<ApiPropertyBase>> getProviderAttachmentBackRefs() {
        return provider_attachment_back_refs;
    }
}