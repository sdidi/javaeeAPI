package net.codejava;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

//@Produces(MediaType.APPLICATION_JSON)
//@Consumes(MediaType.APPLICATION_JSON)
@Singleton
@Path("actors")
public class ActorResource {

	private final ActorDAO actorDAO;

	@Inject
	public ActorResource(ActorDAO actorDAO) {
		this.actorDAO = actorDAO;
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAll() {
		if (this.actorDAO == null) {
			return null;
		}
		return Response.ok(this.actorDAO.getActors()).build();
	}

	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getActor(@PathParam("id") int id) {
		Actor actor = actorDAO.findById(id);
		return Response.ok(actor).build();
	}

	@PUT
	@Path("{id}")
	public Response update(@PathParam("id") int id, Actor actor) {
		Actor updateActor = actorDAO.findById(id);

		updateActor.setName(actor.getName());
		updateActor.setNickname(actor.getNickname());
		actorDAO.update(updateActor);

		return Response.ok().build();
	}

	@POST
	public Response create(Actor Actor) {
		actorDAO.create(Actor);
		return Response.ok().build();
	}

	@DELETE
	@Path("{id}")
	public Response delete(@PathParam("id") int id) {
		Actor getActor = actorDAO.findById(id);

		actorDAO.delete(getActor);

		return Response.ok().build();
	}

	
}
