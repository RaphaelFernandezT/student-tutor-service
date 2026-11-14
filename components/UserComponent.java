package app.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.User;
import app.repositories.UserRepository;

@Component
public class UserComponent {
	
	@Autowired
	private UserRepository repo;
	
	public User getUser(String name) {
		User newUser = repo.findByName(name);
		return newUser;
		//eventually this should accept bookings and use findBybooking
	}

}
