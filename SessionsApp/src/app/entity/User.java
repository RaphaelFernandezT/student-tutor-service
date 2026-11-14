package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private Long pk;
	
	@NotNull
	@Column
	private String name;
	
	@NotNull
	@Column
	private String program;
	
	@NotNull
	@Pattern(regexp= "tutor|tutee")
	@Column
	private String role;
	
	
	
	public User() {
		
	}
	
	public User(Long pk, String name, String program, String role) {
		super();
		this.pk = pk;
		this.name = name;
		this.program = program;
		this.role = role;
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
	public String getProgram() {
		return program;
	}
	public void setProgram(String program) {
		this.program = program;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
	
}
