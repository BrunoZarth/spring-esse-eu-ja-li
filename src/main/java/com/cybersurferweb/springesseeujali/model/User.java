package com.cybersurferweb.springesseeujali.model;

import javax.persistence.*;

@Entity
@Table(name= "user", schema = "public")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public int id;

    @Column(name="name", nullable = false)
    public String name;

    @Column(name="email", nullable = false)
    public String email;

    @Column(name="password", nullable = false)
    public String password;

    @Column(name="score", nullable = false)
    public int score;
}
