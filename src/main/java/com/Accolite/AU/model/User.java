package com.Accolite.AU.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	private String user_id;
	private String name;	
	private String type;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="email")
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getId() {
		return user_id;
	}
	
	public void setId(String user_id) {
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
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "User [id="+user_id+" email=" + email + ", Name=" + name +" Type="+type+ "]";
	}
}
