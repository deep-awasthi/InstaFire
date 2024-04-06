package com.deepawasthi.InstaFire.Controller;

import com.deepawasthi.InstaFire.Entity.UserEntity;
import com.deepawasthi.InstaFire.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/saveUser")
    private UserEntity submitUser(@RequestBody UserEntity users) {
        return userService.createUser(users);
    }

    @GetMapping("/{userid}")
    private UserEntity getUserDetails(@PathVariable("userid") int userId) {
        return userService.getUserDetail(userId);
    }
}
