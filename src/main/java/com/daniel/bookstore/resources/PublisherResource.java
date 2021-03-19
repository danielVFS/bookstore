package com.daniel.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.bookstore.domain.Publisher;
import com.daniel.bookstore.services.PublisherService;

@RestController
@RequestMapping(value = "/publisher")
public class PublisherResource {

	@Autowired
	private PublisherService publisherService;

	@GetMapping(value = "{id}")
	public ResponseEntity<Publisher> list(@PathVariable Integer id) {
		Publisher publisher = publisherService.find(id);

		return ResponseEntity.ok().body(publisher);
	}
}
