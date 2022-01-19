package com.reddit.files.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.reddit.files.dto.RegisterRequest;

@RestController
@RequestMapping("/api/auth")
public class AuthController {
	
	@PostMapping("/signup")
	public void signUp(@RequestBody RegisterRequest registerRequest) { 
		//DTO - Data transfer Object(RegisterRequest)
		
	}

}
