package com.cybersurferweb.springesseeujali.repository;

import com.cybersurferweb.springesseeujali.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
