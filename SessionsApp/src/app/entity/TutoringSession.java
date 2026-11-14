package app.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

@Entity
public class TutoringSession {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long pk;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private Location location;
	
	@NotNull
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private User tutor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private User tutee;
	
	@Column
	private String description;
	
	@NotNull
	@Column
	private LocalDateTime time;
	
	
	public TutoringSession() {
		
	}


	public TutoringSession(Long pk, Location location, User tutor, User tutee, String description, LocalDateTime time) {
		super();
		this.pk = pk;
		this.location = location;
		this.tutor = tutor;
		this.tutee = tutee;
		this.description = description;
		this.time = time;
	}


	public Long getPk() {
		return pk;
	}


	public void setPk(Long pk) {
		this.pk = pk;
	}


	public Location getLocation() {
		return location;
	}


	public void setLocation(Location location) {
		this.location = location;
	}


	public User getTutor() {
		return tutor;
	}


	public void setTutor(User tutor) {
		this.tutor = tutor;
	}


	public User getTutee() {
		return tutee;
	}


	public void setTutee(User tutee) {
		this.tutee = tutee;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public LocalDateTime getTime() {
		return time;
	}


	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
	
	
}
