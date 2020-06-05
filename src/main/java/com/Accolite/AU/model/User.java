package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	
	private String user_id;
	private String name;	
	private String type;
	
	@Id
	@Column(name="email")
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getUserId() {
		return user_id;
	}
	
	public void setUserId(String user_id) {
		this.user_id = user_id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public User(String user_id,String email, String name,String type) {
		super();
		this.user_id = user_id;
		this.email = email;
		this.name = name;
		this.type = type;
	}
	
	public User() {
		super();
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
