package com.practice.Controller;

import com.practice.entity.User;
import com.practice.servises.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;
    //Create
    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User user1=userService.saveUser(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(user1);
    }

    //GetAll
    @GetMapping("/getAll")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return ResponseEntity.ok(allUser);
    }

    //GetById
    @GetMapping("/getById/{id}")
    public ResponseEntity<User> getById(@PathVariable int id){
      User user=userService.getById(id);
      return ResponseEntity.ok(user);
    }

    //delete
   @DeleteMapping("/delete/{id}")
    public ResponseEntity<String>deleteuser(@PathVariable int id){
        userService.deletUser(id);
        return ResponseEntity.ok("User Deleted!!");

   }


    //Update
    @PutMapping("/update/{id}")
    public ResponseEntity<User>updateuser(@PathVariable int id, @RequestBody User user){
        userService.saveUser(user);
        return ResponseEntity.ok(user);
    }
}
