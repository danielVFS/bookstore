package com.daniel.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.domain.Book;
import com.daniel.bookstore.domain.Publisher;
import com.daniel.bookstore.repositories.AuthorRepository;
import com.daniel.bookstore.repositories.BookRepository;
import com.daniel.bookstore.repositories.PublisherRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	@Autowired
	private BookRepository bookRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Author a1 = new Author(null, "Márcio marques", "marcio.com");
		Author a2 = new Author(null, "Lúcio ventura", "lucio.com");
		
		a1.getPhones().addAll(Arrays.asList("996871253", "995415986"));
		a2.getPhones().addAll(Arrays.asList("33654892"));
		
		authorRepository.saveAll(Arrays.asList(a1, a2));
		
		///////////////////////////////////////////////////////////
		
		Publisher pb1 = new Publisher(null, "pearson", "pearson.com");
		Publisher pb2 = new Publisher(null, "zoom", "zoom.com");
		
		publisherRepository.saveAll(Arrays.asList(pb1, pb2));
		
		///////////////////////////////////////////////////////////
		
		Book b1 = new Book(null, "978-0-7334-2635-4", "2018", "Fundamento de C#", 110.0, pb1);
		Book b2 = new Book(null, "952-3-7354-0062-1", "2121", "Criando um blog com ReactJS", 163.0, pb2);

		bookRepository.saveAll(Arrays.asList(b1, b2));
	}
}
