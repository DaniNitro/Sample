package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.service.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import io.swagger.annotations.Api;

@RestController
@Api(value = "api", produces = MediaType.APPLICATION_JSON_VALUE)
public class DemoController  
{
	@Autowired
	DemoService demoService;
	
	@GetMapping("demo")
	public String DemoFunction()
	{
		return "nayan ok";
		
	}

}
