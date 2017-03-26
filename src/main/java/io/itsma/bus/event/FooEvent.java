package io.itsma.bus.event;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

/**
 * Created by 禕 on 2017/3/26.
 */
public class FooEvent extends RemoteApplicationEvent {
    public FooEvent() {
    }

    public FooEvent(Object source, String originService, String destinationService) {
        super(source, originService, destinationService);
    }

    public FooEvent(Object source, String originService) {
        super(source, originService);
    }
}
