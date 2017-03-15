//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class GracefulRestartParametersType extends ApiPropertyBase {
    boolean enable;
    Integer restart_time;
    Integer long_lived_restart_time;
    Integer end_of_rib_timeout;
    boolean bgp_helper_enable;
    boolean xmpp_helper_enable;
    public GracefulRestartParametersType() {
    }
    public GracefulRestartParametersType(boolean enable, Integer restart_time, Integer long_lived_restart_time, Integer end_of_rib_timeout, boolean bgp_helper_enable, boolean xmpp_helper_enable) {
        this.enable = enable;
        this.restart_time = restart_time;
        this.long_lived_restart_time = long_lived_restart_time;
        this.end_of_rib_timeout = end_of_rib_timeout;
        this.bgp_helper_enable = bgp_helper_enable;
        this.xmpp_helper_enable = xmpp_helper_enable;
    }
    public GracefulRestartParametersType(boolean enable) {
        this(enable, 300, 300, 30, false, false);     }
    public GracefulRestartParametersType(boolean enable, Integer restart_time) {
        this(enable, restart_time, 300, 30, false, false);     }
    public GracefulRestartParametersType(boolean enable, Integer restart_time, Integer long_lived_restart_time) {
        this(enable, restart_time, long_lived_restart_time, 30, false, false);     }
    public GracefulRestartParametersType(boolean enable, Integer restart_time, Integer long_lived_restart_time, Integer end_of_rib_timeout) {
        this(enable, restart_time, long_lived_restart_time, end_of_rib_timeout, false, false);     }
    public GracefulRestartParametersType(boolean enable, Integer restart_time, Integer long_lived_restart_time, Integer end_of_rib_timeout, boolean bgp_helper_enable) {
        this(enable, restart_time, long_lived_restart_time, end_of_rib_timeout, bgp_helper_enable, false);     }
    
    public boolean getEnable() {
        return enable;
    }
    
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    
    public Integer getRestartTime() {
        return restart_time;
    }
    
    public void setRestartTime(Integer restart_time) {
        this.restart_time = restart_time;
    }
    
    
    public Integer getLongLivedRestartTime() {
        return long_lived_restart_time;
    }
    
    public void setLongLivedRestartTime(Integer long_lived_restart_time) {
        this.long_lived_restart_time = long_lived_restart_time;
    }
    
    
    public Integer getEndOfRibTimeout() {
        return end_of_rib_timeout;
    }
    
    public void setEndOfRibTimeout(Integer end_of_rib_timeout) {
        this.end_of_rib_timeout = end_of_rib_timeout;
    }
    
    
    public boolean getBgpHelperEnable() {
        return bgp_helper_enable;
    }
    
    public void setBgpHelperEnable(boolean bgp_helper_enable) {
        this.bgp_helper_enable = bgp_helper_enable;
    }
    
    
    public boolean getXmppHelperEnable() {
        return xmpp_helper_enable;
    }
    
    public void setXmppHelperEnable(boolean xmpp_helper_enable) {
        this.xmpp_helper_enable = xmpp_helper_enable;
    }
    
}
