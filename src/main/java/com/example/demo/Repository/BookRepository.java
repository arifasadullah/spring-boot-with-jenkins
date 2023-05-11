package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity,Long> {
    
}
