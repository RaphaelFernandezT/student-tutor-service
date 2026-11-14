package app.components;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import app.entity.TutoringSession;
import app.repositories.TutoringSessionRepository;

@Component
public class TutoringSessionController {
	
	@Autowired
	private TutoringSessionRepository repo;
	
	public List<TutoringSession> getSessionWithCourse(String course) {
		List<TutoringSession> gotSession = repo.findByCourse(course);
		return gotSession;
	}

}
