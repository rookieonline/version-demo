package com.hefeng.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rookie
 * @date 2021/05/28 22:44
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/list")
    public String getUsers() {
        return "users.....";
    }
}
