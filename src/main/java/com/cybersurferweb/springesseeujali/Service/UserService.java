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

    public User findByIdOrThrowBadRequestException(int id){
        return userRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "User not found!"));
    }

    public User saveUser(User user){
        // user.setId(idAleatorio);
        userRepository.save(user);

        this.findByIdOrThrowBadRequestException(user.id);

        return user;
    }

    public void deleteUserById(int id){
        this.findByIdOrThrowBadRequestException(id);
        userRepository.deleteById(id);
    }

    public User replaceUser(User user) {
        this.deleteUserById(user.id);
        this.saveUser(user);
        return user;
    }
}
