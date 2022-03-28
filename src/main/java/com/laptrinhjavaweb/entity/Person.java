package com.laptrinhjavaweb.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="person")
public class Person {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto increment
	@Column(name="id")
	Long id;
	
	@Column(name="name")
	String name;
	
	@Column(name="age")
	Integer age;
	
	@Column(name="gender")
	String gender;
	
	@Column(name="address")
	String address;
}
