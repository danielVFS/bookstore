package com.daniel.bookstore.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.bookstore.domain.Book;
import com.daniel.bookstore.services.BookService;

@RestController
@RequestMapping(value = "/books")
public class BookResource {
	
	@Autowired
	private BookService bookService;

	@GetMapping(value = "{id}")
	public ResponseEntity<Book> list(@PathVariable Integer id){
		Book book = bookService.find(id);
		
		return ResponseEntity.ok().body(book);
	}
}
