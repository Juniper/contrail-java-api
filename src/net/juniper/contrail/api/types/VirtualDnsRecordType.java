//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VirtualDnsRecordType extends ApiPropertyBase {
    String record_name;
    String record_type;
    String record_class;
    String record_data;
    Integer record_ttl_seconds;
    Integer record_mx_preference;
    public VirtualDnsRecordType() {
    }
    public VirtualDnsRecordType(String record_name, String record_type, String record_class, String record_data, Integer record_ttl_seconds, Integer record_mx_preference) {
        this.record_name = record_name;
        this.record_type = record_type;
        this.record_class = record_class;
        this.record_data = record_data;
        this.record_ttl_seconds = record_ttl_seconds;
        this.record_mx_preference = record_mx_preference;
    }
    public VirtualDnsRecordType(String record_name) {
        this(record_name, null, null, null, null, null);     }
    public VirtualDnsRecordType(String record_name, String record_type) {
        this(record_name, record_type, null, null, null, null);     }
    public VirtualDnsRecordType(String record_name, String record_type, String record_class) {
        this(record_name, record_type, record_class, null, null, null);     }
    public VirtualDnsRecordType(String record_name, String record_type, String record_class, String record_data) {
        this(record_name, record_type, record_class, record_data, null, null);     }
    public VirtualDnsRecordType(String record_name, String record_type, String record_class, String record_data, Integer record_ttl_seconds) {
        this(record_name, record_type, record_class, record_data, record_ttl_seconds, null);     }
    
    public String getRecordName() {
        return record_name;
    }
    
    public void setRecordName(String record_name) {
        this.record_name = record_name;
    }
    
    
    public String getRecordType() {
        return record_type;
    }
    
    public void setRecordType(String record_type) {
        this.record_type = record_type;
    }
    
    
    public String getRecordClass() {
        return record_class;
    }
    
    public void setRecordClass(String record_class) {
        this.record_class = record_class;
    }
    
    
    public String getRecordData() {
        return record_data;
    }
    
    public void setRecordData(String record_data) {
        this.record_data = record_data;
    }
    
    
    public Integer getRecordTtlSeconds() {
        return record_ttl_seconds;
    }
    
    public void setRecordTtlSeconds(Integer record_ttl_seconds) {
        this.record_ttl_seconds = record_ttl_seconds;
    }
    
    
    public Integer getRecordMxPreference() {
        return record_mx_preference;
    }
    
    public void setRecordMxPreference(Integer record_mx_preference) {
        this.record_mx_preference = record_mx_preference;
    }
    
}
