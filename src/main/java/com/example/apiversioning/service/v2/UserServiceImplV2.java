package com.example.apiversioning.service.v2;

//import com.example.apiversioning.model.User;
import com.example.apiversioning.model.v2.UserV2;
//import com.example.apiversioning.reposotory.UserRepository;
import com.example.apiversioning.repository.v2.UserRepositoryV2;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserServiceImplV2 implements UserServiceV2 {
    private UserRepositoryV2 userRepositoryV2;

    @Autowired
    public UserServiceImplV2(UserRepositoryV2 userRepositoryV2){

        this.userRepositoryV2 = userRepositoryV2;
    }
    @Override
    public UserV2 saveUser(UserV2 user)  {
        return userRepositoryV2.save(user);
    }

    @Override
    public List<UserV2> getAllUsers() {
        return (List<UserV2>)userRepositoryV2.findAll();
    }
}
