package app.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Organizer;
import app.entity.User;
import app.repositories.OrganizerRepository;
import app.repositories.UserRepository;

@Component
public class UserComponent {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private OrganizerRepository orgRepo;
	
	public User getUser(String name) {
		User newUser = userRepo.findByName(name);
		return newUser;
		//eventually this should accept bookings and use findBybooking
	}
	
	public Organizer getOrganizer(String name) {
		Organizer newOrg = orgRepo.findByName(name);
		return newOrg;
	}


}
