package com.practice.servises;

import com.practice.entity.User;

import java.util.List;

public interface UserService {

    //Create User

    User saveUser(User user);

    //getAllUser
    List<User> getAllUser();

    //GetUserById
    User getById(int id);

    //DeleteUser
     String deletUser(int id);

//    //UpdateUser
     User updateUser(int id, User user);


}
