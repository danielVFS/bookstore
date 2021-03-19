package com.daniel.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.bookstore.domain.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{

}
