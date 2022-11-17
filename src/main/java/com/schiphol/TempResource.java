package com.schiphol;

import org.eclipse.microprofile.reactive.messaging.Incoming;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class TempResource {

    private String temp;

    @Incoming("outTopic")
    public void receiveEvent(String temp) {
        this.temp = temp;
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return this.temp;
    }
}
