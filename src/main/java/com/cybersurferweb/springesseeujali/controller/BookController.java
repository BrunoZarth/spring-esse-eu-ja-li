package com.cybersurferweb.springesseeujali.controller;

import com.cybersurferweb.springesseeujali.model.Book;
import com.cybersurferweb.springesseeujali.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookRepository bookRepository;

    @GetMapping("/bookList")
    public List<Book> bookList(){
        return bookRepository.findAll();
    }

}
