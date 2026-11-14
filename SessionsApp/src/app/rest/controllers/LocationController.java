package app.rest.controllers;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.LocationComponent;
import app.entity.Location;

@Component
@Path("/location")
public class LocationController {

	@Autowired
	private LocationComponent manager;

	@GET
	@Path("/getall")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Location> getAllLocations() {
		return manager.getLocation();
	}
}