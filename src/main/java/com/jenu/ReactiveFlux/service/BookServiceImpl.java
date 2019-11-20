package com.jenu.ReactiveFlux.service;

import org.springframework.stereotype.Service;

import com.jenu.ReactiveFlux.model.Book;
import com.jenu.ReactiveFlux.repo.BookRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class BookServiceImpl implements BookService {
	
	private BookRepository bookRepository;
	
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

	@Override
	public Mono<Book> findById(String id) {
		return this.bookRepository.findById(id);
	}

	@Override
	public Flux<Book> findAll() {
		return this.bookRepository.findAll();
	}

	@Override
	public Mono<Book> save(Book book) {
		return this.bookRepository.save(book);
	}

	@Override
	public Mono<Void> deleteById(String id) {
		return this.bookRepository.deleteById(id);
	}

}
