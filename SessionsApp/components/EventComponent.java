package app.components;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.Events;
import app.repositories.EventRepository;

@Component
public class EventComponent {

	@Autowired
	private EventRepository repo;
	
	public Events getEvent(String name) {
		Events gotEvent = repo.findBySessionTitle(name);
		return gotEvent;
	}
}
