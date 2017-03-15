//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class AlarmOrList extends ApiPropertyBase {
    public static class AlarmAndList {
        public static class AlarmExpression {
            public static class AlarmOperand2 {
                String uve_attribute;
                String json_value;
                public AlarmOperand2() {
                }
                public AlarmOperand2(String uve_attribute, String json_value) {
                    this.uve_attribute = uve_attribute;
                    this.json_value = json_value;
                }
                public AlarmOperand2(String uve_attribute) {
                    this(uve_attribute, null);                 }
                
                public String getUveAttribute() {
                    return uve_attribute;
                }
                
                public void setUveAttribute(String uve_attribute) {
                    this.uve_attribute = uve_attribute;
                }
                
                
                public String getJsonValue() {
                    return json_value;
                }
                
                public void setJsonValue(String json_value) {
                    this.json_value = json_value;
                }
                
            }
            String operation;
            String operand1;
            AlarmOperand2 operand2;
            List<String> variables;
            public AlarmExpression() {
            }
            public AlarmExpression(String operation, String operand1, AlarmOperand2 operand2, List<String> variables) {
                this.operation = operation;
                this.operand1 = operand1;
                this.operand2 = operand2;
                this.variables = variables;
            }
            public AlarmExpression(String operation) {
                this(operation, null, null, null);             }
            public AlarmExpression(String operation, String operand1) {
                this(operation, operand1, null, null);             }
            public AlarmExpression(String operation, String operand1, AlarmOperand2 operand2) {
                this(operation, operand1, operand2, null);             }
            
            public String getOperation() {
                return operation;
            }
            
            public void setOperation(String operation) {
                this.operation = operation;
            }
            
            
            public String getOperand1() {
                return operand1;
            }
            
            public void setOperand1(String operand1) {
                this.operand1 = operand1;
            }
            
            
            public AlarmOperand2 getOperand2() {
                return operand2;
            }
            
            public void setOperand2(AlarmOperand2 operand2) {
                this.operand2 = operand2;
            }
            
            
            public List<String> getVariables() {
                return variables;
            }
            
            
            public void addVariables(String obj) {
                if (variables == null) {
                    variables = new ArrayList<String>();
                }
                variables.add(obj);
            }
            public void clearVariables() {
                variables = null;
            }
            
        }
        List<AlarmExpression> and_list;
        public AlarmAndList() {
        }
        public AlarmAndList(List<AlarmExpression> and_list) {
            this.and_list = and_list;
        }
        
        public List<AlarmExpression> getAndList() {
            return and_list;
        }
        
        
        public void addAnd(AlarmExpression obj) {
            if (and_list == null) {
                and_list = new ArrayList<AlarmExpression>();
            }
            and_list.add(obj);
        }
        public void clearAnd() {
            and_list = null;
        }
        
        
        public void addAnd(String operation, String operand1, AlarmExpression.AlarmOperand2 operand2, List<String> variables) {
            if (and_list == null) {
                and_list = new ArrayList<AlarmExpression>();
            }
            and_list.add(new AlarmExpression(operation, operand1, operand2, variables));
        }
        
    }
    List<AlarmAndList> or_list;
    public AlarmOrList() {
    }
    public AlarmOrList(List<AlarmAndList> or_list) {
        this.or_list = or_list;
    }
    
    public List<AlarmAndList> getOrList() {
        return or_list;
    }
    
    
    public void addOr(AlarmAndList obj) {
        if (or_list == null) {
            or_list = new ArrayList<AlarmAndList>();
        }
        or_list.add(obj);
    }
    public void clearOr() {
        or_list = null;
    }
    
    
    public void addOr(List<AlarmAndList.AlarmExpression> and_list) {
        if (or_list == null) {
            or_list = new ArrayList<AlarmAndList>();
        }
        or_list.add(new AlarmAndList(and_list));
    }
    
}
