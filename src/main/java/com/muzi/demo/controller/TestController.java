package com.muzi.demo.controller;

import com.muzi.demo.service.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/test")
public class TestController {
    @Autowired
    ITestService iTestService;
    @GetMapping("testservice")
    @ResponseBody
    public String Test(){
        return iTestService.Test();
    }
}
