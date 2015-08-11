package com.myvicino.catalog.resources;

import com.google.common.base.Optional;
import com.codahale.metrics.annotation.Timed;
import com.myvicino.catalog.modal.Hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;


/**
 * Created by pradeep.kaushal on 03/08/15.
 */
@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
public class AdminResource {

    private final String template;
    private final String defaultName;
    private final AtomicLong counter;

    public AdminResource(String template, String defaultName) {
        this.template = template;
        this.defaultName = defaultName;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Hello sayHello(@QueryParam("name") Optional<String> name) {
        final String value = String.format(template, name.or(defaultName));
        return new Hello(counter.incrementAndGet(), value);
    }



}


