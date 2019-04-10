package com.controller;

import com.entity.User;
import com.service.UserJpaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/u")
public class UserController {

    @Autowired //注入
    private UserJpaService userJpaService ; //调用服务

    @GetMapping("/findById/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userJpaService.findById(id);
    }
    @GetMapping("/findUserAll")
    public List<User> findUserAll(){
        return this.userJpaService.findAll();
    }
}
