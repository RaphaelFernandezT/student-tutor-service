package app.entity;

import javax.persistence.Entity;

@Entity
public class Organizer {

	private Long pk;
	private String name;
	private String status;
	
	
	
	public Organizer() {
		
	}

	public Organizer(Long pk, String name, String status) {
		super();
		this.pk = pk;
		this.name = name;
		this.status = status;
	}

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
}
