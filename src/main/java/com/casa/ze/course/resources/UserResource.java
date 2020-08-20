package com.casa.ze.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casa.ze.course.entities.User;

@RestController
@RequestMapping(value= "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "João", "joao@gmail.com", "9999999", "joao1001");
		return ResponseEntity.ok().body(u);
	}
}