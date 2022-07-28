package com.project.controller;

import com.project.client.UserClient;
import com.project.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients(basePackages = {"com.project.client"})
public class UserController {

    @Autowired
    private UserClient client;

    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUser() {
        return client.getUsers();
    }

}