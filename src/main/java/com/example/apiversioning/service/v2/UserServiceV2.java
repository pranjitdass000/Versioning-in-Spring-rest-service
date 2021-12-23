package com.example.apiversioning.service.v2;


import com.example.apiversioning.model.v2.UserV2;

import java.util.List;

public interface UserServiceV2 {
    UserV2 saveUser(UserV2 user);
    List<UserV2> getAllUsers();}