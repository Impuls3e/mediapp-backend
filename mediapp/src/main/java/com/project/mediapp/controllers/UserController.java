package com.project.mediapp.controllers;

import com.project.mediapp.entities.User;
import com.project.mediapp.services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;



    public UserController(UserService userService){

        this.userService =userService;
    }
    @GetMapping
    public List<User> getAllUsers(){

        return userService.getAllUsers();
    }

    @PostMapping
    public  User createUser(@RequestBody User newUser){

        return userService.saveOneUser(newUser);
    }

    @GetMapping("/{userId}")
    public User GetOneUser(@PathVariable Long userId){
        //custom
        return userService.getOneUserById(userId);
    }
@PutMapping("/{userId}")
    public  User updateOneUser(@PathVariable Long userId, @RequestBody User newUser)
{
    return  userService.updateOneUSer(userId, newUser);
}
@DeleteMapping("/{userId}")
    public  void deleteOneUser(@PathVariable Long userId){

        userService.deleteById(userId);
}

}
