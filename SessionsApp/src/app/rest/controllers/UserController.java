package app.rest.controllers;


import javax.ws.rs.QueryParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.components.UserComponent;
import app.entity.Organizer;
import app.entity.User;

@Component
public class UserController {

	@Autowired
	private UserComponent manager;
	
	public User getUser(@QueryParam("name") String name) {
		return manager.getUser(name);
	}
	
	public Organizer geOrganizer(@QueryParam("name") String name) {
		return manager.getOrganizer(name);
	}
}
