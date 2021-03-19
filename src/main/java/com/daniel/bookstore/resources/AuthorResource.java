package com.daniel.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.services.AuthorService;

@RestController
@RequestMapping(value = "/authors")
public class AuthorResource {

	@Autowired 
	AuthorService authorService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Author> list(@PathVariable Integer id) {
		Author author = authorService.find(id);
		
		return ResponseEntity.ok().body(author);
	}
}
