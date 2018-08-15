package com.myjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myjpa.entity.Book;

public interface BookRepository extends JpaRepository<Book, String> {
    
}
