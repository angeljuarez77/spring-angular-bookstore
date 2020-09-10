package com.example.bookservice.service;

import com.example.bookservice.model.Book;
import com.example.bookservice.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookRepository bookRepository;

    @Override
    public Iterable<Book> listBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findBook(Long id) throws EntityNotFoundException {
        Book book = null;
        try {
            book = bookRepository.findById(id).get();
        } catch(EntityNotFoundException e) {
            throw new EntityNotFoundException("Book with id " + id + " not found");
        }
        return book;
    }

    @Override
    public HttpStatus deleteBook(Long id) {
        bookRepository.deleteById(id);
        return HttpStatus.OK;
    }
}
