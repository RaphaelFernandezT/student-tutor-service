package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.TutoringSessionComponent;
import app.entity.TutoringSession;

@Component
@Path("/tutoringsessions")
public class TutoringSessionController {

	@Autowired
	private TutoringSessionComponent manager;
	
	@GET
	@Path("/getcourse")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TutoringSession> getSessionWithCourse(@QueryParam("course") String course) {
		return manager.getSessionWithCourse(course);
	}
	
}
