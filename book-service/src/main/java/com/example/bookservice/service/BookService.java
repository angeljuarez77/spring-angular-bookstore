package com.example.bookservice.service;

import com.example.bookservice.model.Book;
import org.springframework.http.HttpStatus;

public interface BookService {
    Iterable<Book> listBooks();
    Book createBook(Book book);
    Book findBook(Long id);
    HttpStatus deleteBook(Long id);
}
