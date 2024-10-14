package com.praveenit.restfirstdemo.controller;


import org.springframework.web.bind.annotation.RestController;

import com.praveenit.restfirstdemo.entity.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.praveenit.restfirstdemo.service.BooksService;
import java.util.List;




@RestController
public class BookController {
  @Autowired
    private BooksService bservice;

    @GetMapping("/books")
    public List<Book> getBooks()
    {

       List<Book> books= bservice.getAllBooks();
       return books;
    }

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable("id") int id)
    {

        Book book = bservice.getBook(id);
    return book;
    }

}
