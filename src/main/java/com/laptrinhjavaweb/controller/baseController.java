package com.laptrinhjavaweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class baseController {
	
	@GetMapping("/admin")
	public String admin() {
		return "person1";
	}
	
	//chưa hoàn thiện
	@GetMapping("/")
	public String index(@RequestParam(value = "key", required = false) String key) {
		System.out.println(key);
		return "person";
	}


}
