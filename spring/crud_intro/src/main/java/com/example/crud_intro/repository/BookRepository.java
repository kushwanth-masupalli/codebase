package com.example.crud_intro.repository;

import com.example.crud_intro.entities.Book;
import jdk.jfr.Registered;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    public Book findBookByTitle(String name);

}
