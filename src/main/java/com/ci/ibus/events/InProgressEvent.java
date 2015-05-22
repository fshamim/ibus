package com.ci.ibus.events;

import lombok.Data;

/**
 * Created by fshamim on 07.05.15.
 */
@Data
public class InProgressEvent {
    public String loadingMsg;

    public InProgressEvent(String loadingMsg) {
        this.loadingMsg = loadingMsg;
    }
}
