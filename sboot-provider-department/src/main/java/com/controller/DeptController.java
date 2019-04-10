package com.controller;

import com.service.DeparmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeparmentService deparmentService; //部门服务

    @GetMapping("/getDeptList")
    public List getDeptList(){
        return deparmentService.findAll();
    }
}
