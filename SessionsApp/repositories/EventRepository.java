package app.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entity.Events;

@Repository
public interface EventRepository extends JpaRepository <Events, Long> {
	
	public Events findBySessionTitle(String sessionTitle);

}
