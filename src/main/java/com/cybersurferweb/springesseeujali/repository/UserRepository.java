package com.cybersurferweb.springesseeujali.repository;

import com.cybersurferweb.springesseeujali.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    public List<User> findByName(String name);

}
