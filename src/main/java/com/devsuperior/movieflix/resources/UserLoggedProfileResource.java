package com.devsuperior.movieflix.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.movieflix.dto.UserDTO;
import com.devsuperior.movieflix.services.UserService;

@RestController
@RequestMapping(value = "/users/profile")
public class UserLoggedProfileResource {

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<UserDTO> findUserLogged() {
		UserDTO dto = service.findUserLogged();
		return ResponseEntity.ok().body(dto);
	}
}
