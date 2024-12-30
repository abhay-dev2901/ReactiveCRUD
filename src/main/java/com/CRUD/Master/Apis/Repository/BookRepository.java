package com.CRUD.Master.Apis.Repository;

import com.CRUD.Master.Apis.entities.Book;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends ReactiveCrudRepository <Book, Integer> {

}
