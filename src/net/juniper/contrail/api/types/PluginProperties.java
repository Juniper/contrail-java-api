//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class PluginProperties extends ApiPropertyBase {
    public static class PluginProperty {
        String property;
        String value;
        public PluginProperty() {
        }
        public PluginProperty(String property, String value) {
            this.property = property;
            this.value = value;
        }
        public PluginProperty(String property) {
            this(property, null);         }
        
        public String getProperty() {
            return property;
        }
        
        public void setProperty(String property) {
            this.property = property;
        }
        
        
        public String getValue() {
            return value;
        }
        
        public void setValue(String value) {
            this.value = value;
        }
        
    }
    List<PluginProperty> plugin_property;
    public PluginProperties() {
    }
    public PluginProperties(List<PluginProperty> plugin_property) {
        this.plugin_property = plugin_property;
    }
    
    public List<PluginProperty> getPluginProperty() {
        return plugin_property;
    }
    
    
    public void addPluginProperty(PluginProperty obj) {
        if (plugin_property == null) {
            plugin_property = new ArrayList<PluginProperty>();
        }
        plugin_property.add(obj);
    }
    public void clearPluginProperty() {
        plugin_property = null;
    }
    
    
    public void addPluginProperty(String property, String value) {
        if (plugin_property == null) {
            plugin_property = new ArrayList<PluginProperty>();
        }
        plugin_property.add(new PluginProperty(property, value));
    }
    
}
