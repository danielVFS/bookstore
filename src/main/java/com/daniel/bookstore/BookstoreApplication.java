package com.daniel.bookstore;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.daniel.bookstore.domain.Author;
import com.daniel.bookstore.repositories.AuthorRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{

	@Autowired
	private AuthorRepository authorRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Author a1 = new Author(null, "Márcio marques", "marcio.com");
		Author a2 = new Author(null, "Lúcio ventura", "lucio.com");
		
		authorRepository.saveAll(Arrays.asList(a1, a2));
	}
}
