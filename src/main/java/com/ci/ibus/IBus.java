package com.ci.ibus;

/**
 * Common Interface that describes the very basic usage of an event bus.
 * By default the event should be delivered same as the posting thread.
 * Created by fshamim on 27.04.15.
 */
public interface IBus {
    void register(Object object);
    void unregister(Object object);
    void post(Object object);
}
