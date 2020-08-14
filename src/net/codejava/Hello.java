package net.codejava;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/bonjour")
public class Hello {
 
	/*
    @GET
    @Produces(MediaType.TEXT_HTML)
    public String direBonjour() {
        return "<html><title>Hello</title><body><h1>Bonjour, tout le monde!</h1><body></html>";
    }*/
	
	 @GET
	    @Produces(MediaType.APPLICATION_JSON)
	    public String direBonjour() {
	        return "{\"name\":\"Sabre\",\"message\":\"Greetings!\"}";
	    }

    }