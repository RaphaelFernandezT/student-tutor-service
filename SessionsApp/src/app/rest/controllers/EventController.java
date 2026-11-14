package app.rest.controllers;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.EventComponent;
import app.entity.Events;

@Component
@Path("/events")
public class EventController {

	@Autowired
	private EventComponent manager;

	@POST
	@Path("/sessiontitle")
	@Produces(MediaType.APPLICATION_JSON)
	public Events getSessionTitle(@QueryParam("sessionTitle") String title) {
		return manager.getEvent(title);
	}


}