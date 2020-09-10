package com.example.bookservice.controller;

import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping
    public Iterable<Book> listBooks() {
        return bookService.listBooks();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @GetMapping("/{id}")
    public Book findBook(@PathVariable Long id) {
        return bookService.findBook(id);
    }

    @DeleteMapping("/{id}")
    public HttpStatus deleteBook(@PathVariable Long id) {
        return bookService.deleteBook(id);
    }
}
