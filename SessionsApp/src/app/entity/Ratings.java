package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Range;

@Entity
public class Ratings {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long pk;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private TutoringSession session;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private User tutor;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@Column
	private User tutee;
	
	@NotNull
	@Range(min=1, max=5)
	@Column
	private Integer score;
	
	@Column
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
