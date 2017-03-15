//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class EncapsulationPrioritiesType extends ApiPropertyBase {
    List<String> encapsulation;
    public EncapsulationPrioritiesType() {
    }
    public EncapsulationPrioritiesType(List<String> encapsulation) {
        this.encapsulation = encapsulation;
    }
    
    public List<String> getEncapsulation() {
        return encapsulation;
    }
    
    
    public void addEncapsulation(String obj) {
        if (encapsulation == null) {
            encapsulation = new ArrayList<String>();
        }
        encapsulation.add(obj);
    }
    public void clearEncapsulation() {
        encapsulation = null;
    }
    
}
