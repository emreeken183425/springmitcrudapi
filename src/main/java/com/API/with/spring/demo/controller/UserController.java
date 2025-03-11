package com.api.with.spring.demo.controller;

import com.api.with.spring.demo.model.User;
import com.api.with.spring.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping
    public ResponseEntity<List<User>>getUser(){
        return new ResponseEntity<>(userService.getUser(), HttpStatus.FOUND);
    }
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @PostMapping
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
@PutMapping("/{id}")
    public User updateUser(@RequestBody User user,@PathVariable Long id){
       return userService.updateUser(user,id);
}
@DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
}

}
