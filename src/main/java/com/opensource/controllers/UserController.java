package com.opensource.controllers;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opensource.models.User;
import com.opensource.services.UserService;

@RestController
@RequestMapping("/users")
@CrossOrigin(origins = { "http://localhost:8080" })
public class UserController {

	UserService uServ;
	
	public UserController (UserService uServ) {
		this.uServ = uServ;
	}

	@GetMapping("/{userid}")
	public ResponseEntity<Optional<User>> getUserById(@RequestHeader("userid") int userId) {
		return ResponseEntity.ok(uServ.findById(userId));
	}
	
	@GetMapping("/{username}")
	public ResponseEntity<Optional<User>> getUserByUsername(@RequestHeader("username") String username) {
		return ResponseEntity.ok(uServ.findByUsername(username));
	}
	
	@GetMapping("/{email}")
	public ResponseEntity<Optional<User>> getUserByEmail(@RequestHeader("email") String userEmail) {
		return ResponseEntity.ok(uServ.findByEmail(userEmail));
	}
	
	
	
	
	
	
}
