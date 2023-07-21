package com.takeo.BookApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.takeo.BookApi.model.Book;
import com.takeo.BookApi.service.BookService;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookservice;

    @Autowired
    public BookController(BookService bookservice) {
        this.bookservice = bookservice;
    }

    @GetMapping("/allbooks")
    public List<Book> getAllBooks() {
        return bookservice.getAllBooks();
    }

    @GetMapping("/")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("/{id}")
    public Book getBookbyId(@PathVariable Integer id) {
        return bookservice.getBookbyId(id);
    }

    @PostMapping("/addbooks")
    public Book addBook(@RequestBody Book book) {
        return bookservice.createBook(book);

    }

    @DeleteMapping("/{id}")
    public void deleteBookbyId(@PathVariable Integer id) {
        System.out.println("Book Deleted");
        bookservice.deleteBook(id);
    }

    @PatchMapping("/editbook/{id}")
    public Book editBookById(@PathVariable Integer id, @RequestBody Book book) {
        return bookservice.updateBook(id, book);
    }

}
