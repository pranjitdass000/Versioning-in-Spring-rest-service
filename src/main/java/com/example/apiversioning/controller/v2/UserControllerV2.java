package com.example.apiversioning.controller.v2;


import com.example.apiversioning.model.v2.UserV2;

import com.example.apiversioning.service.v2.UserServiceV2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v2")
public class UserControllerV2 {
    private com.example.apiversioning.service.v2.UserServiceV2 userServiceV2;

    @Autowired
    public UserControllerV2(UserServiceV2 userServiceV2) {

        this.userServiceV2 = userServiceV2;
    }

    @PostMapping("/user")
    public ResponseEntity<UserV2> saveUser(@RequestBody UserV2 userV2) {
        UserV2 savedUserV2 = userServiceV2.saveUser(userV2);
        return new ResponseEntity<>(savedUserV2, HttpStatus.CREATED);

    }

    @GetMapping("/users")
    public ResponseEntity<List<UserV2>> getAllUsers() {
        return new ResponseEntity<List<UserV2>>((List<UserV2>) userServiceV2.getAllUsers(), HttpStatus.OK);
    }
}