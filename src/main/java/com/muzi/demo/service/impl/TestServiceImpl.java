package com.muzi.demo.service.impl;

import com.muzi.demo.service.ITestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements ITestService {
    @Override
    public String Test() {
        return "Holle World！";
    }
}
