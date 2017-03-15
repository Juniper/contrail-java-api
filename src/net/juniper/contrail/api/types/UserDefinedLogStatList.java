//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class UserDefinedLogStatList extends ApiPropertyBase {
    public static class UserDefinedLogStat {
        String name;
        String pattern;
        public UserDefinedLogStat() {
        }
        public UserDefinedLogStat(String name, String pattern) {
            this.name = name;
            this.pattern = pattern;
        }
        public UserDefinedLogStat(String name) {
            this(name, null);         }
        
        public String getName() {
            return name;
        }
        
        public void setName(String name) {
            this.name = name;
        }
        
        
        public String getPattern() {
            return pattern;
        }
        
        public void setPattern(String pattern) {
            this.pattern = pattern;
        }
        
    }
    List<UserDefinedLogStat> statlist;
    public UserDefinedLogStatList() {
    }
    public UserDefinedLogStatList(List<UserDefinedLogStat> statlist) {
        this.statlist = statlist;
    }
    
    public List<UserDefinedLogStat> getStatlist() {
        return statlist;
    }
    
    
    public void addStatlist(UserDefinedLogStat obj) {
        if (statlist == null) {
            statlist = new ArrayList<UserDefinedLogStat>();
        }
        statlist.add(obj);
    }
    public void clearStatlist() {
        statlist = null;
    }
    
    
    public void addStatlist(String name, String pattern) {
        if (statlist == null) {
            statlist = new ArrayList<UserDefinedLogStat>();
        }
        statlist.add(new UserDefinedLogStat(name, pattern));
    }
    
}
