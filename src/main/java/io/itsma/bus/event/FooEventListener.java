package io.itsma.bus.event;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Created by 禕 on 2017/3/26.
 */
@Component
public class FooEventListener implements ApplicationListener<FooEvent> {

    private static Log log = LogFactory.getLog(FooEventListener.class);


    @Override
    public void onApplicationEvent(FooEvent event) {
        log.info("Received remote foo request. Keys refreshed ");
    }
}