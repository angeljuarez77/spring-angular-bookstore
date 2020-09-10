package com.example.bookservice.repository;

import com.example.bookservice.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
