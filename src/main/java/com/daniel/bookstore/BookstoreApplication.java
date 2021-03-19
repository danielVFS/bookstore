package com.daniel.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.domain.Publisher;
import com.daniel.bookstore.repositories.AuthorRepository;
import com.daniel.bookstore.repositories.PublisherRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired
	private AuthorRepository authorRepository;
	@Autowired
	private PublisherRepository publisherRepository;
	
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
		
		publisherRepository.saveAll(Arrays.asList(pb1));
		
	}
}
