package com.cjc.main.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.main.helper.Student;

@RestController
public class HomeController 
{
	@Autowired
	private Student stu;
	@GetMapping("/getData")
	public Map<String, String> getData()
	{
		return Map.of("name", "Akshay"); 
		
	}
}
