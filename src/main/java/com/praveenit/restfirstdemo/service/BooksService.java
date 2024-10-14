package com.praveenit.restfirstdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.praveenit.restfirstdemo.entity.Book;

@Service
public class BooksService {
    private static  List<Book> list= new ArrayList<Book>();
    static{
list.add(new Book(200,"anu",20.23));
list.add(new Book(201,"mani",30.23));
list.add(new Book(202,"chaitu",20.23));

    }

    public List<Book> getAllBooks()
    {
        return list;
    }

    public Book getBook(int id)
    {
        Book book= null;
        book=list.stream().filter(e->e.getId()==id).findFirst().get();
return book;

    }



}
