//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VirtualDnsType extends ApiPropertyBase {
    String domain_name;
    boolean dynamic_records_from_client;
    String record_order;
    Integer default_ttl_seconds;
    String next_virtual_DNS;
    String floating_ip_record;
    boolean external_visible;
    boolean reverse_resolution;
    public VirtualDnsType() {
    }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order, Integer default_ttl_seconds, String next_virtual_DNS, String floating_ip_record, boolean external_visible, boolean reverse_resolution) {
        this.domain_name = domain_name;
        this.dynamic_records_from_client = dynamic_records_from_client;
        this.record_order = record_order;
        this.default_ttl_seconds = default_ttl_seconds;
        this.next_virtual_DNS = next_virtual_DNS;
        this.floating_ip_record = floating_ip_record;
        this.external_visible = external_visible;
        this.reverse_resolution = reverse_resolution;
    }
    public VirtualDnsType(String domain_name) {
        this(domain_name, false, null, null, null, null, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client) {
        this(domain_name, dynamic_records_from_client, null, null, null, null, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order) {
        this(domain_name, dynamic_records_from_client, record_order, null, null, null, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order, Integer default_ttl_seconds) {
        this(domain_name, dynamic_records_from_client, record_order, default_ttl_seconds, null, null, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order, Integer default_ttl_seconds, String next_virtual_DNS) {
        this(domain_name, dynamic_records_from_client, record_order, default_ttl_seconds, next_virtual_DNS, null, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order, Integer default_ttl_seconds, String next_virtual_DNS, String floating_ip_record) {
        this(domain_name, dynamic_records_from_client, record_order, default_ttl_seconds, next_virtual_DNS, floating_ip_record, false, false);     }
    public VirtualDnsType(String domain_name, boolean dynamic_records_from_client, String record_order, Integer default_ttl_seconds, String next_virtual_DNS, String floating_ip_record, boolean external_visible) {
        this(domain_name, dynamic_records_from_client, record_order, default_ttl_seconds, next_virtual_DNS, floating_ip_record, external_visible, false);     }
    
    public String getDomainName() {
        return domain_name;
    }
    
    public void setDomainName(String domain_name) {
        this.domain_name = domain_name;
    }
    
    
    public boolean getDynamicRecordsFromClient() {
        return dynamic_records_from_client;
    }
    
    public void setDynamicRecordsFromClient(boolean dynamic_records_from_client) {
        this.dynamic_records_from_client = dynamic_records_from_client;
    }
    
    
    public String getRecordOrder() {
        return record_order;
    }
    
    public void setRecordOrder(String record_order) {
        this.record_order = record_order;
    }
    
    
    public Integer getDefaultTtlSeconds() {
        return default_ttl_seconds;
    }
    
    public void setDefaultTtlSeconds(Integer default_ttl_seconds) {
        this.default_ttl_seconds = default_ttl_seconds;
    }
    
    
    public String getNextVirtualDns() {
        return next_virtual_DNS;
    }
    
    public void setNextVirtualDns(String next_virtual_DNS) {
        this.next_virtual_DNS = next_virtual_DNS;
    }
    
    
    public String getFloatingIpRecord() {
        return floating_ip_record;
    }
    
    public void setFloatingIpRecord(String floating_ip_record) {
        this.floating_ip_record = floating_ip_record;
    }
    
    
    public boolean getExternalVisible() {
        return external_visible;
    }
    
    public void setExternalVisible(boolean external_visible) {
        this.external_visible = external_visible;
    }
    
    
    public boolean getReverseResolution() {
        return reverse_resolution;
    }
    
    public void setReverseResolution(boolean reverse_resolution) {
        this.reverse_resolution = reverse_resolution;
    }
    
}
