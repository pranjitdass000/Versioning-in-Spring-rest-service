package com.example.apiversioning.service;

//import com.example.apiversioning.exception.UserAlreadyExistException;
import com.example.apiversioning.model.User;
import com.example.apiversioning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @Override
    public User saveUser(User user)  {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>)userRepository.findAll();
    }
    @Override
    public User getUserById(int id){
        return null;
    }
}
