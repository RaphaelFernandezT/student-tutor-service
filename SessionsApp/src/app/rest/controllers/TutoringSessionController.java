package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.TutoringSession;

@Component
@Path("/location")
public class TutoringSessionController {

	@Autowired
	private TutoringSessionController manager;
	
	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<TutoringSession> getSessionWithCourse(@QueryParam("course") String course) {
		return manager.getSessionWithCourse(course);
	}
	
}
