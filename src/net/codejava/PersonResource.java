package net.codejava;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;

@Path("persons")
public class PersonResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public JsonArray getPersons(@Context HttpHeaders http) {
		JsonObject json = Json.createObjectBuilder().add("name", "message").build();
		return Json.createArrayBuilder().add(json).build();
	}

	@GET
	@Path("person")
	@Produces(MediaType.APPLICATION_JSON)
	public Person getPerson() {
		Person p = new Person();
		p.setName("Nothabo");
		p.setMessage("I am at school");
		return p;
	}

	@GET
	@Path("{name}-{message}")
	@Produces(MediaType.APPLICATION_JSON)
	public Person personMessage(@PathParam("name") String name, @PathParam("message") String message) {
		return new Person(name, message);
	}

}
