package com.daniel.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.daniel.bookstore.domain.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer>{

}
