package com.laptrinhjavaweb.model;

import lombok.Data;

@Data
public class createPersonRequest {
	
	private Long id;
	
	private String name;
	
	private String gender;
	
	private Integer age;
	
	private String address;
}
