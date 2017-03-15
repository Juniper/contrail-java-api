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

public class AliasIp extends ApiObjectBase {
    private String alias_ip_address;
    private String alias_ip_address_family;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> project_refs;
    private List<ObjectReference<ApiPropertyBase>> virtual_machine_interface_refs;

    @Override
    public String getObjectType() {
        return "alias-ip";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project", "default-virtual-network", "default-alias-ip-pool");
    }

    @Override
    public String getDefaultParentType() {
        return "alias-ip-pool";
    }
    
    public String getAddress() {
        return alias_ip_address;
    }
    
    public void setAddress(String alias_ip_address) {
        this.alias_ip_address = alias_ip_address;
    }
    
    
    public String getAddressFamily() {
        return alias_ip_address_family;
    }
    
    public void setAddressFamily(String alias_ip_address_family) {
        this.alias_ip_address_family = alias_ip_address_family;
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
    

    public List<ObjectReference<ApiPropertyBase>> getProject() {
        return project_refs;
    }

    public void setProject(Project obj) {
        project_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        project_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addProject(Project obj) {
        if (project_refs == null) {
            project_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        project_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearProject() {
        if (project_refs != null) {
            project_refs.clear();
            return;
        }
        project_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualMachineInterface() {
        return virtual_machine_interface_refs;
    }

    public void setVirtualMachineInterface(VirtualMachineInterface obj) {
        virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualMachineInterface(VirtualMachineInterface obj) {
        if (virtual_machine_interface_refs == null) {
            virtual_machine_interface_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_machine_interface_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualMachineInterface() {
        if (virtual_machine_interface_refs != null) {
            virtual_machine_interface_refs.clear();
            return;
        }
        virtual_machine_interface_refs = null;
    }
}