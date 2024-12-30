package com.CRUD.Master.Apis.Services;


import com.CRUD.Master.Apis.entities.Book;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface BookService {

    public Mono<Book> create(Book book);

    public Flux<Book> getAll();

    public Mono<Book> getBook(int bookId);

    public Mono<Book> update(Book book, int bookId);

    public Mono<Void> delete(int bookId);

    public Flux<Book> search(String query);

}
