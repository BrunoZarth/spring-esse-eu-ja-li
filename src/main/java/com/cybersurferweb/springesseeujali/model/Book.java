package com.cybersurferweb.springesseeujali.model;

import javax.persistence.*;

@Entity
@Table(name = "book", schema = "public")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;

    @Column(name = "title", length = 50, nullable = false)
    public String title;

    @Column(name = "description", nullable = false)
    public String description;

    @Column(name = "pages", nullable = false)
    public int pages;

    @Column(name = "author", nullable = false)
    public String author;
}
