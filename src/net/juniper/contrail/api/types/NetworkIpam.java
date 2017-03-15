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

public class NetworkIpam extends ApiObjectBase {
    private IpamType network_ipam_mgmt;
    private IpamSubnets ipam_subnets;
    private String ipam_subnet_method;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> virtual_DNS_refs;
    private transient List<ObjectReference<VnSubnetsType>> virtual_network_back_refs;

    @Override
    public String getObjectType() {
        return "network-ipam";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of("default-domain", "default-project");
    }

    @Override
    public String getDefaultParentType() {
        return "project";
    }
    
    public IpamType getMgmt() {
        return network_ipam_mgmt;
    }
    
    public void setMgmt(IpamType network_ipam_mgmt) {
        this.network_ipam_mgmt = network_ipam_mgmt;
    }
    
    
    public IpamSubnets getIpamSubnets() {
        return ipam_subnets;
    }
    
    public void setIpamSubnets(IpamSubnets ipam_subnets) {
        this.ipam_subnets = ipam_subnets;
    }
    
    
    public String getIpamSubnetMethod() {
        return ipam_subnet_method;
    }
    
    public void setIpamSubnetMethod(String ipam_subnet_method) {
        this.ipam_subnet_method = ipam_subnet_method;
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
    

    public List<ObjectReference<ApiPropertyBase>> getVirtualDns() {
        return virtual_DNS_refs;
    }

    public void setVirtualDns(VirtualDns obj) {
        virtual_DNS_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        virtual_DNS_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addVirtualDns(VirtualDns obj) {
        if (virtual_DNS_refs == null) {
            virtual_DNS_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        virtual_DNS_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearVirtualDns() {
        if (virtual_DNS_refs != null) {
            virtual_DNS_refs.clear();
            return;
        }
        virtual_DNS_refs = null;
    }

    public List<ObjectReference<VnSubnetsType>> getVirtualNetworkBackRefs() {
        return virtual_network_back_refs;
    }
}