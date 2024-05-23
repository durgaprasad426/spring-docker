package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/welcome")
	public String msg() {
		String msg="welcome to world";
		System.out.println("where are you");
		System.out.println("where are you");
		return msg;
	}
}
