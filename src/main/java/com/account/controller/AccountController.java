package com.account.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	
	@GetMapping("/check")
	public String check() {
		
		return "accountcontroller";
	}
}
