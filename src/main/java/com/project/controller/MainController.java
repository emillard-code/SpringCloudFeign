package com.project.controller;

import com.project.feign.UserFeignClient;
import com.project.dto.UserResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@EnableFeignClients(basePackages = {"com.project.feign"})
public class MainController {

    @Autowired
    private UserFeignClient client;

    @GetMapping("/findAllUser")
    public List<UserResponse> getAllUser() {
        return client.getUsers();
    }

}