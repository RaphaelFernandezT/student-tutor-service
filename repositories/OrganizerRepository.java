package app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import app.entity.Organizer;

@Repository
public interface OrganizerRepository extends JpaRepository <Organizer, Long> {
	
	public Organizer findByName(String name);

}
