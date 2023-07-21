package com.takeo.BookApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.takeo.BookApi.model.Book;
import com.takeo.BookApi.repository.BookRepository;

@Service
public class BookService {

    private final BookRepository bookRepo;

    @Autowired
    public BookService(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();

    }

    public Book getBookbyId(Integer id) {
        return bookRepo.findById(id).orElse(null);
    }

    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    public void deleteBook(Integer id) {
        bookRepo.deleteById(id);

    }

    public Book updateBook(Integer id, Book book) {
        Book existingbook = bookRepo.findById(id).orElse(null);

        if (existingbook != null) {
            existingbook.setBook_name(book.getBook_name());
            return bookRepo.save(existingbook);
        }

        return null;
    }

}
