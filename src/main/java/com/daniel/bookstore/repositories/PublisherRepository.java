package com.daniel.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.daniel.bookstore.domain.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Integer>{

}
