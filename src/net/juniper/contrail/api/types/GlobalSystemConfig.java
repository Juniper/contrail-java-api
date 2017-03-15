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

public class GlobalSystemConfig extends ApiObjectBase {
    private Integer autonomous_system;
    private String config_version;
    private GracefulRestartParametersType graceful_restart_parameters;
    private PluginProperties plugin_tuning;
    private boolean ibgp_auto_mesh;
    private SubnetListType ip_fabric_subnets;
    private MACLimitControlType mac_limit_control;
    private MACMoveLimitControlType mac_move_control;
    private Integer mac_aging_time;
    private boolean alarm_enable;
    private UserDefinedLogStatList user_defined_log_statistics;
    private IdPermsType id_perms;
    private PermType2 perms2;
    private KeyValuePairs annotations;
    private String display_name;
    private List<ObjectReference<ApiPropertyBase>> bgp_router_refs;
    private List<ObjectReference<ApiPropertyBase>> global_vrouter_configs;
    private List<ObjectReference<ApiPropertyBase>> global_qos_configs;
    private List<ObjectReference<ApiPropertyBase>> physical_routers;
    private List<ObjectReference<ApiPropertyBase>> virtual_routers;
    private List<ObjectReference<ApiPropertyBase>> config_nodes;
    private List<ObjectReference<ApiPropertyBase>> analytics_nodes;
    private List<ObjectReference<ApiPropertyBase>> database_nodes;
    private List<ObjectReference<ApiPropertyBase>> service_appliance_sets;
    private List<ObjectReference<ApiPropertyBase>> api_access_lists;
    private List<ObjectReference<ApiPropertyBase>> alarms;
    private transient List<ObjectReference<ApiPropertyBase>> qos_config_back_refs;

    @Override
    public String getObjectType() {
        return "global-system-config";
    }

    @Override
    public List<String> getDefaultParent() {
        return ImmutableList.of();
    }

    @Override
    public String getDefaultParentType() {
        return "config-root";
    }
    
    public Integer getAutonomousSystem() {
        return autonomous_system;
    }
    
    public void setAutonomousSystem(Integer autonomous_system) {
        this.autonomous_system = autonomous_system;
    }
    
    
    public String getConfigVersion() {
        return config_version;
    }
    
    public void setConfigVersion(String config_version) {
        this.config_version = config_version;
    }
    
    
    public GracefulRestartParametersType getGracefulRestartParameters() {
        return graceful_restart_parameters;
    }
    
    public void setGracefulRestartParameters(GracefulRestartParametersType graceful_restart_parameters) {
        this.graceful_restart_parameters = graceful_restart_parameters;
    }
    
    
    public PluginProperties getPluginTuning() {
        return plugin_tuning;
    }
    
    public void setPluginTuning(PluginProperties plugin_tuning) {
        this.plugin_tuning = plugin_tuning;
    }
    
    
    public boolean getIbgpAutoMesh() {
        return ibgp_auto_mesh;
    }
    
    public void setIbgpAutoMesh(boolean ibgp_auto_mesh) {
        this.ibgp_auto_mesh = ibgp_auto_mesh;
    }
    
    
    public SubnetListType getIpFabricSubnets() {
        return ip_fabric_subnets;
    }
    
    public void setIpFabricSubnets(SubnetListType ip_fabric_subnets) {
        this.ip_fabric_subnets = ip_fabric_subnets;
    }
    
    
    public MACLimitControlType getMacLimitControl() {
        return mac_limit_control;
    }
    
    public void setMacLimitControl(MACLimitControlType mac_limit_control) {
        this.mac_limit_control = mac_limit_control;
    }
    
    
    public MACMoveLimitControlType getMacMoveControl() {
        return mac_move_control;
    }
    
    public void setMacMoveControl(MACMoveLimitControlType mac_move_control) {
        this.mac_move_control = mac_move_control;
    }
    
    
    public Integer getMacAgingTime() {
        return mac_aging_time;
    }
    
    public void setMacAgingTime(Integer mac_aging_time) {
        this.mac_aging_time = mac_aging_time;
    }
    
    
    public boolean getAlarmEnable() {
        return alarm_enable;
    }
    
    public void setAlarmEnable(boolean alarm_enable) {
        this.alarm_enable = alarm_enable;
    }
    
    
    public UserDefinedLogStatList getUserDefinedLogStatistics() {
        return user_defined_log_statistics;
    }
    
    public void setUserDefinedLogStatistics(UserDefinedLogStatList user_defined_log_statistics) {
        this.user_defined_log_statistics = user_defined_log_statistics;
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
    

    public List<ObjectReference<ApiPropertyBase>> getBgpRouter() {
        return bgp_router_refs;
    }

    public void setBgpRouter(BgpRouter obj) {
        bgp_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        bgp_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void addBgpRouter(BgpRouter obj) {
        if (bgp_router_refs == null) {
            bgp_router_refs = new ArrayList<ObjectReference<ApiPropertyBase>>();
        }
        bgp_router_refs.add(new ObjectReference<ApiPropertyBase>(obj.getQualifiedName(), null));
    }
    public void clearBgpRouter() {
        if (bgp_router_refs != null) {
            bgp_router_refs.clear();
            return;
        }
        bgp_router_refs = null;
    }

    public List<ObjectReference<ApiPropertyBase>> getGlobalVrouterConfigs() {
        return global_vrouter_configs;
    }

    public List<ObjectReference<ApiPropertyBase>> getGlobalQosConfigs() {
        return global_qos_configs;
    }

    public List<ObjectReference<ApiPropertyBase>> getPhysicalRouters() {
        return physical_routers;
    }

    public List<ObjectReference<ApiPropertyBase>> getVirtualRouters() {
        return virtual_routers;
    }

    public List<ObjectReference<ApiPropertyBase>> getConfigNodes() {
        return config_nodes;
    }

    public List<ObjectReference<ApiPropertyBase>> getAnalyticsNodes() {
        return analytics_nodes;
    }

    public List<ObjectReference<ApiPropertyBase>> getDatabaseNodes() {
        return database_nodes;
    }

    public List<ObjectReference<ApiPropertyBase>> getServiceApplianceSets() {
        return service_appliance_sets;
    }

    public List<ObjectReference<ApiPropertyBase>> getApiAccessLists() {
        return api_access_lists;
    }

    public List<ObjectReference<ApiPropertyBase>> getAlarms() {
        return alarms;
    }

    public List<ObjectReference<ApiPropertyBase>> getQosConfigBackRefs() {
        return qos_config_back_refs;
    }
}