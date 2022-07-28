package com.project.feign;

import java.util.List;

import com.project.dto.UserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url="https://jsonplaceholder.typicode.com", name="USER-CLIENT")
public interface UserFeignClient {

    @GetMapping("/users")
    public List<UserResponse> getUsers();

}