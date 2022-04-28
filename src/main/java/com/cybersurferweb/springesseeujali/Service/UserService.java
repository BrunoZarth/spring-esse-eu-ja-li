package com.cybersurferweb.springesseeujali.Service;

import com.cybersurferweb.springesseeujali.model.User;
import com.cybersurferweb.springesseeujali.repository.UserRepository;
import lombok.AllArgsConstructor;
import net.bytebuddy.implementation.bytecode.Throw;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public Optional<User> findById(int id){
        if(userRepository.findById(id).isPresent()){
            return userRepository.findById(id);
        } else throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found!");
               // .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, ""));

    }

    public User saveUser(User user){
        userRepository.save(user);
        return user;
    }

    public void deleteUserById(int id){
        this.findById(id);
        userRepository.deleteById(id);
    }
}
