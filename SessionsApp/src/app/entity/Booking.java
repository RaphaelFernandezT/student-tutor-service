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
public class Booking {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long pk;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private User user;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Events events;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private TutoringSession sessions;
	
	@NotNull
	@Column
	private LocalDateTime time;
	
	
	
	
	public Booking() {
		
	}
	public Booking(Long pk, User user, Events events, TutoringSession sessions, LocalDateTime time) {
		super();
		this.pk = pk;
		this.user = user;
		this.events = events;
		this.sessions = sessions;
		this.time = time;
	}
	public Long getPk() {
		return pk;
	}
	public void setPk(Long pk) {
		this.pk = pk;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Events getEvents() {
		return events;
	}
	public void setEvents(Events events) {
		this.events = events;
	}
	public TutoringSession getSessions() {
		return sessions;
	}
	public void setSessions(TutoringSession sessions) {
		this.sessions = sessions;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
}
