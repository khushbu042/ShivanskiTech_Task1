package com.crudapp.crud.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private String email;
	private String phone;
	private String emptitle;
	
	public User() {}
	
	public User(Long id, String name, String email, String  phone, String emptitle) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.emptitle = emptitle;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmptitle() {
		return emptitle;
	}
	public void setEmptitle(String emptitle) {
		this.emptitle = emptitle;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", emptitle=" + emptitle
				+ "]";
	}
}


