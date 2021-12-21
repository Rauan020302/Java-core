package com.example.demoitvdn.rest;

import com.example.demoitvdn.data.Book;
import com.example.demoitvdn.data.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestResource {
    @Autowired
    private BookRepository bookRepository;
    @GetMapping("Test")
    public String ping() {
        return "Ping";
    }

    @GetMapping("all-book")
    public List<Book> allBook() {
        return bookRepository.findAll();
    }

    @GetMapping("add/{name}/{author}")
    public Book add(@PathVariable String name,
                    @PathVariable String author) {
        Book book = new Book();
        book.setName(name);
        book.setAuthor(author);
        return bookRepository.save(book);
    }
    @GetMapping("getBookById/{id}")
    public Book getBookById(@PathVariable Long id){
        return bookRepository.findById(id).orElse(null);
    }
}
