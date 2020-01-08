package com.test.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "billionaires")
public class Person {
 
    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private Long id;
    
    @Column(name="first_name", nullable = false)
    private String firstName;
    
    @Column(name="last_name", nullable = false)
    private String lastName;
    
    @Column(name="career")
    private String career;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCareer() {
		return career;
	}

	public void setCareer(String career) {
		this.career = career;
	}
    
    
    
    
}