package com.spring.boot.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.google.gson.Gson;
import com.spring.dubbo.model.User;
import com.spring.dubbo.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(application = "${dubbo.application.id}",
        registry = "${dubbo.registry.id}")
    public UserService userService;

    @RequestMapping("/user")
    public String searUser() {
        Gson gson = new Gson();
        User user = userService.searchUser(1);

        return gson.toJson(user);
    }
}
