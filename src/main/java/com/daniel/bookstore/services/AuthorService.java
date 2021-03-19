package com.daniel.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.repositories.AuthorRepository;
import com.daniel.bookstore.services.exceptions.ObjectNotFoundException;

@Service
public class AuthorService {
	
	@Autowired
	private AuthorRepository authorRepository;
	
	public Author find(Integer id) {
		Optional<Author> author = authorRepository.findById(id);
		
		return author.orElseThrow(() -> new ObjectNotFoundException("Object not found, ID:" + id + ", Type: " + Author.class.getName()));
	}
}
