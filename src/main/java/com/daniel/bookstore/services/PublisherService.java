package com.daniel.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.domain.Publisher;
import com.daniel.bookstore.repositories.PublisherRepository;
import com.daniel.bookstore.services.exceptions.ObjectNotFoundException;

@Service
public class PublisherService {

	@Autowired
	private PublisherRepository publisherRepository;

	public Publisher find(Integer id) {
		Optional<Publisher> publisher = publisherRepository.findById(id);

		return publisher.orElseThrow(
				() -> new ObjectNotFoundException("Object not found, ID:" + id + ", Type: " + Author.class.getName()));

	}
}
