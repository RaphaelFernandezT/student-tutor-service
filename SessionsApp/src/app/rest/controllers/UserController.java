package app.rest.controllers;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.UserComponent;
import app.entity.Organizer;
import app.entity.User;

@Component
@Path("/users")
public class UserController {

	@Autowired
	private UserComponent manager;
	
	@GET
	@Path("/getuser")
	@Produces(MediaType.APPLICATION_JSON)
	public User getUser(@QueryParam("name") String name) {
		return manager.getUser(name);
	}
	
	@GET
	@Path("/getorganizer")
	@Produces(MediaType.APPLICATION_JSON)
	public Organizer geOrganizer(@QueryParam("name") String name) {
		return manager.getOrganizer(name);
	}
}
