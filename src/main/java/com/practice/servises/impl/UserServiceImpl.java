package com.practice.servises.impl;

import com.practice.entity.User;
import com.practice.exception.ResourceNotFoundException;
import com.practice.repository.UserRepository;
import com.practice.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getById(int id) {
        return userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("User With given Id is not found on server !! :" + id));
    }

    @Override
    public String deletUser( int id) {
         userRepository.deleteById(id);
         return "User Deleted !!";
    }

    @Override
    public User updateUser(int id, User user) {
        return userRepository.save(user);
    }
}
