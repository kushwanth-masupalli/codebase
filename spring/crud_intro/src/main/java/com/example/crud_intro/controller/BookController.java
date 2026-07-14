package com.example.crud_intro.controller;


import com.example.crud_intro.entities.Book;
import com.example.crud_intro.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController {

    private final BookService bookService ;
    @Autowired
    public BookController(BookService bookService){
        this.bookService = bookService;
    }

    @PostMapping("/addBook")
    public ResponseEntity<Book> addBook(@RequestBody Book b){
          Book saveBook =    bookService.addBook(b);
          return ResponseEntity.ok(saveBook);
    }


    @GetMapping("/getBooks")
    public ResponseEntity<?> getBooks(){
        List<Book>  listOfBooks = bookService.getBooks();
        return ResponseEntity.ok(listOfBooks);
    }

    @GetMapping("/getBookByName/{name}")
    public ResponseEntity<?> getBookByName(@PathVariable String name){
        Book book = bookService.getBookByName(name);
        return ResponseEntity.ok(book);
    }

    @PutMapping("/updateBook/")
    public ResponseEntity<?> updateBook(@RequestBody Book b){
        Book book = bookService.updateBook(b);
        return ResponseEntity.ok(b);
    }

    @DeleteMapping("deleteBookById/{id}")
    public ResponseEntity<?> deletBook(@PathVariable Integer id){
         bookService.deleteBookById(id);
        return ResponseEntity.ok().build();
    }

}
