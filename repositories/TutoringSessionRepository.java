package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entity.TutoringSession;

@Repository
public interface TutoringSessionRepository extends JpaRepository <TutoringSession, Long >{
	
	public List<TutoringSession> findByCourse(String course);

}
