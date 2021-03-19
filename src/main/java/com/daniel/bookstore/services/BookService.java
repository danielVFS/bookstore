package com.daniel.bookstore.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.domain.Book;
import com.daniel.bookstore.repositories.BookRepository;
import com.daniel.bookstore.services.exceptions.ObjectNotFoundException;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book find(Integer id) {
		Optional<Book> book = bookRepository.findById(id);
		
		return book.orElseThrow(() -> new ObjectNotFoundException("Object not found, ID:" + id + ", Type: " + Author.class.getName()));
	}
}
