package com.daniel.bookstore.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.bookstore.domain.Author;

@RestController
@RequestMapping(value = "/authors")
public class AuthorResource {

	@GetMapping
	public List<Author> list() {
		Author a1 = new Author(1, "Márcio marques", "marcio.com");
		Author a2 = new Author(2, "Lúcio ventura", "lucio.com");

		List<Author> list = new ArrayList<>();
		list.add(a1);
		list.add(a2);
		
		return list;
	}
}
