//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class RbacRuleEntriesType extends ApiPropertyBase {
    public static class RbacRuleType {
        public static class RbacPermType {
            String role_name;
            String role_crud;
            public RbacPermType() {
            }
            public RbacPermType(String role_name, String role_crud) {
                this.role_name = role_name;
                this.role_crud = role_crud;
            }
            public RbacPermType(String role_name) {
                this(role_name, null);             }
            
            public String getRoleName() {
                return role_name;
            }
            
            public void setRoleName(String role_name) {
                this.role_name = role_name;
            }
            
            
            public String getRoleCrud() {
                return role_crud;
            }
            
            public void setRoleCrud(String role_crud) {
                this.role_crud = role_crud;
            }
            
        }
        String rule_object;
        String rule_field;
        List<RbacPermType> rule_perms;
        public RbacRuleType() {
        }
        public RbacRuleType(String rule_object, String rule_field, List<RbacPermType> rule_perms) {
            this.rule_object = rule_object;
            this.rule_field = rule_field;
            this.rule_perms = rule_perms;
        }
        public RbacRuleType(String rule_object) {
            this(rule_object, null, null);         }
        public RbacRuleType(String rule_object, String rule_field) {
            this(rule_object, rule_field, null);         }
        
        public String getRuleObject() {
            return rule_object;
        }
        
        public void setRuleObject(String rule_object) {
            this.rule_object = rule_object;
        }
        
        
        public String getRuleField() {
            return rule_field;
        }
        
        public void setRuleField(String rule_field) {
            this.rule_field = rule_field;
        }
        
        
        public List<RbacPermType> getRulePerms() {
            return rule_perms;
        }
        
        
        public void addRulePerms(RbacPermType obj) {
            if (rule_perms == null) {
                rule_perms = new ArrayList<RbacPermType>();
            }
            rule_perms.add(obj);
        }
        public void clearRulePerms() {
            rule_perms = null;
        }
        
        
        public void addRulePerms(String role_name, String role_crud) {
            if (rule_perms == null) {
                rule_perms = new ArrayList<RbacPermType>();
            }
            rule_perms.add(new RbacPermType(role_name, role_crud));
        }
        
    }
    List<RbacRuleType> rbac_rule;
    public RbacRuleEntriesType() {
    }
    public RbacRuleEntriesType(List<RbacRuleType> rbac_rule) {
        this.rbac_rule = rbac_rule;
    }
    
    public List<RbacRuleType> getRbacRule() {
        return rbac_rule;
    }
    
    
    public void addRbacRule(RbacRuleType obj) {
        if (rbac_rule == null) {
            rbac_rule = new ArrayList<RbacRuleType>();
        }
        rbac_rule.add(obj);
    }
    public void clearRbacRule() {
        rbac_rule = null;
    }
    
    
    public void addRbacRule(String rule_object, String rule_field, List<RbacRuleType.RbacPermType> rule_perms) {
        if (rbac_rule == null) {
            rbac_rule = new ArrayList<RbacRuleType>();
        }
        rbac_rule.add(new RbacRuleType(rule_object, rule_field, rule_perms));
    }
    
}
