package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Dao.Book;
import com.example.demo.Entity.BookEntity;
import com.example.demo.Services.BookService;




@Controller
@RequestMapping(path = "/book")
public class BookController {

    @Autowired
    private BookService bookService;

    
    @PostMapping("/save")
    public ResponseEntity<BookEntity> saveBook(@RequestBody String name){
        BookEntity book= bookService.saveBooks(name);

       
        return ResponseEntity.ok().body(book);
    }

    @GetMapping("/all")
    public ResponseEntity<List<BookEntity>> getAllBook(){
        return ResponseEntity.ok().body((bookService.getAllBook()));
    }
}
