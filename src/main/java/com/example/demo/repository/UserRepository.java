package com.example.demo.repository;

import com.example.demo.model.Role;
import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {
    private final PasswordEncoder passwordEncoder;
    private List<User> USERS;

    @Autowired
    public UserRepository(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void initDB() {
        //Harcoded users for DB
        USERS = Arrays.asList(
                new User(1, "James Bond", "james_bond@gmail.com", passwordEncoder.encode("123"), new HashSet<>(Arrays.asList(Role.ADMIN))),
                new User(2, "Maria Jones", "maria_jones@gmail.com", passwordEncoder.encode("234"), new HashSet<>(Arrays.asList(Role.USER))),
                new User(3, "Anna Smith", "anna_smith@gmail.com", passwordEncoder.encode("345"), new HashSet<>(Arrays.asList(Role.ANONYMOUS))),
                new User(4, "ss", "6010935@gmail.com", "", new HashSet<>(Arrays.asList(Role.ANONYMOUS)))
        );

    }

    public Optional<User> findUserByEmail(String email) {
        return USERS
                .stream()
                .filter(user -> user.getUserEmail().equals(email))
                .findFirst();
    }

    public Optional<User> findUserById(Integer id) {
        return USERS
                .stream()
                .filter(user -> user.getUserId().equals(id))
                .findFirst();
    }

}
