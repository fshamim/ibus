package com.ci.ibus.events;

import lombok.Data;

/**
 * Event Pojo for performing a vibration on the smartphone.
 * Created by fshamim on 04.09.14.
 */
@Data
public class VibrateEvent {
    private final long duration;

    /**
     * Constructor
     * @param duration of the vibration.
     */
    public VibrateEvent(long duration){
        this.duration = duration;
    }

    /**
     * @return duration of the vibration.
     */
    public long getDuration() {
        return duration;
    }
}
