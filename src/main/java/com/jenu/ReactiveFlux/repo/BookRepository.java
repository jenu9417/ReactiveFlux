package com.jenu.ReactiveFlux.repo;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.jenu.ReactiveFlux.model.Book;

public interface BookRepository extends ReactiveMongoRepository<Book, String> {
	
}