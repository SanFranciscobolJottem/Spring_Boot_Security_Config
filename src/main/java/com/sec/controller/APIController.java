package com.sec.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

	@RequestMapping("/")
	public String index() {
		return "Főoldal";
	}
	

	@RequestMapping("/stories")
	public String stories() {
		return "Stories";
	}
	

	@RequestMapping("/delete")
	public String delete() {
		return "Delete";
	}
	
}
