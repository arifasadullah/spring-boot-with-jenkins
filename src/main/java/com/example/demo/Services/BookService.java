package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Book;
import com.example.demo.Entity.BookEntity;
import com.example.demo.Repository.BookRepository;


@Service
public class BookService {
    
    @Autowired
    private BookRepository bookRepository;

    public BookEntity saveBooks(String bookName){

        BookEntity book =new BookEntity();
        book.setName(bookName);

      this.bookRepository.save(book);

        
        return book;

    }

    public List<BookEntity> getAllBook(){
      return this.bookRepository.findAll();
    }
    
}
