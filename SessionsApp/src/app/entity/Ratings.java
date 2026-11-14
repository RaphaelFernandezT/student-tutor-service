package app.entity;

import javax.persistence.Entity;

@Entity
public class Ratings {
	
	
	private Long pk;
	private TutoringSession session;
	private User tutor;
	private User tutee;
	private Integer score;
	private String comment;
	
	public Ratings() {
		
	}

	public Ratings(Long pk, TutoringSession session, User tutor, User tutee, Integer score, String comment) {
		super();
		this.pk = pk;
		this.session = session;
		this.tutor = tutor;
		this.tutee = tutee;
		this.score = score;
		this.comment = comment;
	}

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public TutoringSession getSession() {
		return session;
	}

	public void setSession(TutoringSession session) {
		this.session = session;
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

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	
}
