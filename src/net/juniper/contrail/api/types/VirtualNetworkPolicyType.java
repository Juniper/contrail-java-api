//
// Automatically generated.
//
package net.juniper.contrail.api.types;

import java.util.List;
import java.util.ArrayList;

import net.juniper.contrail.api.ApiPropertyBase;

public class VirtualNetworkPolicyType extends ApiPropertyBase {
    public static class SequenceType {
        Integer major;
        Integer minor;
        public SequenceType() {
        }
        public SequenceType(Integer major, Integer minor) {
            this.major = major;
            this.minor = minor;
        }
        public SequenceType(Integer major) {
            this(major, null);         }
        
        public Integer getMajor() {
            return major;
        }
        
        public void setMajor(Integer major) {
            this.major = major;
        }
        
        
        public Integer getMinor() {
            return minor;
        }
        
        public void setMinor(Integer minor) {
            this.minor = minor;
        }
        
    }
    public static class TimerType {
        volatile java.util.Date start_time;
        Long on_interval;
        Long off_interval;
        volatile java.util.Date end_time;
        public TimerType() {
        }
        public TimerType(java.util.Date start_time, Long on_interval, Long off_interval, java.util.Date end_time) {
            this.start_time = start_time;
            this.on_interval = on_interval;
            this.off_interval = off_interval;
            this.end_time = end_time;
        }
        public TimerType(java.util.Date start_time) {
            this(start_time, null, null, null);         }
        public TimerType(java.util.Date start_time, Long on_interval) {
            this(start_time, on_interval, null, null);         }
        public TimerType(java.util.Date start_time, Long on_interval, Long off_interval) {
            this(start_time, on_interval, off_interval, null);         }
        
        public java.util.Date getStartTime() {
            return start_time;
        }
        
        public void setStartTime(java.util.Date start_time) {
            this.start_time = start_time;
        }
        
        
        public Long getOnInterval() {
            return on_interval;
        }
        
        public void setOnInterval(Long on_interval) {
            this.on_interval = on_interval;
        }
        
        
        public Long getOffInterval() {
            return off_interval;
        }
        
        public void setOffInterval(Long off_interval) {
            this.off_interval = off_interval;
        }
        
        
        public java.util.Date getEndTime() {
            return end_time;
        }
        
        public void setEndTime(java.util.Date end_time) {
            this.end_time = end_time;
        }
        
    }
    SequenceType sequence;
    TimerType timer;
    public VirtualNetworkPolicyType() {
    }
    public VirtualNetworkPolicyType(SequenceType sequence, TimerType timer) {
        this.sequence = sequence;
        this.timer = timer;
    }
    public VirtualNetworkPolicyType(SequenceType sequence) {
        this(sequence, null);     }
    
    public SequenceType getSequence() {
        return sequence;
    }
    
    public void setSequence(SequenceType sequence) {
        this.sequence = sequence;
    }
    
    
    public TimerType getTimer() {
        return timer;
    }
    
    public void setTimer(TimerType timer) {
        this.timer = timer;
    }
    
}
