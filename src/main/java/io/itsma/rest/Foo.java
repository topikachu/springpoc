package io.itsma.rest;

import io.itsma.bus.event.FooEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 禕 on 2017/3/26.
 */
@RestController
public class Foo {
    @Autowired
    private ApplicationContext context;

    @RequestMapping("/foo")
    public void greeting() {
        context.publishEvent(new FooEvent(this, context.getId()));
    }
}
