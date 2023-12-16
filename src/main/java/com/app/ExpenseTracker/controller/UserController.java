package com.app.ExpenseTracker.controller;

import java.util.List;

import jakarta.annotation.Resource;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.ExpenseTracker.bean.User;
import com.app.ExpenseTracker.criteria.UserSearchCriteria;
import com.app.ExpenseTracker.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userService.create(user);
    }

    @PostMapping("/search")
    public List<User> search(@RequestBody final UserSearchCriteria criteria){
        return userService.search(criteria);
    }
}
