package com.example.apiversioning.service;


import com.example.apiversioning.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user); ;
    List<User> getAllUsers();
    User getUserById(int id);
}
