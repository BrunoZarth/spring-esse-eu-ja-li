package com.cybersurferweb.springesseeujali.repository;

import com.cybersurferweb.springesseeujali.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
}
