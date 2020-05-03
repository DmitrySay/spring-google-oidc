package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@AllArgsConstructor
public class User {

    private Integer userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private Set<Role> roles = new HashSet<>();

}
