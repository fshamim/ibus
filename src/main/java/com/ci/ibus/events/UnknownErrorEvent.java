package com.ci.ibus.events;

import lombok.Data;

/**
 * Created by fshamim on 07.05.15.
 */
@Data
public class UnknownErrorEvent {
            public int errorCode;
        public String description;

        public UnknownErrorEvent(int errorCode, String description) {
            this.errorCode = errorCode;
            this.description = description;
        }
}
