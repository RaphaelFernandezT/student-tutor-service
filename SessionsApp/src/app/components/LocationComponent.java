package app.components;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.Location;
import app.repositories.LocationRepository;

@Component
public class LocationComponent {
	
	@Autowired
	private LocationRepository repo;
	
	public List<Location> getLocation() {
		List<Location> allLocation = repo.findAll();
		return allLocation;
	}
	
}
