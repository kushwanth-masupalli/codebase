package com.example.crud_intro.service;

import com.example.crud_intro.entities.Book;
import com.example.crud_intro.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {


    @Autowired
    BookRepository bookRepository ;

    public Book addBook(Book b) {
       Book book =  bookRepository.save(b);
       return book;
    }

    public List<Book> getBooks() {
        List<Book> listOfBooks = bookRepository.findAll();
        return listOfBooks;
    }

    public Book getBookByName(String name) {
        Book b = bookRepository.findBookByTitle(name);
                return b;
    }

    public Book updateBook(Book b) {
        Book book = bookRepository.save(b);
        return book;
    }

    public void deleteBookById(Integer id) {
         bookRepository.deleteById(id);
    }
}
