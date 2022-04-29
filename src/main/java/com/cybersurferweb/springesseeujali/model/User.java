package com.cybersurferweb.springesseeujali.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name= "user", schema = "public")
@Builder
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
