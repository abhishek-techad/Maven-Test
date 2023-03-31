package com.maven.firstproject.service.impl;

import com.maven.firstproject.service.FirstService;
import org.springframework.stereotype.Service;

@Service
public class FirstServiceImpl implements FirstService {
    @Override
    public String returnString() {
        return "Great try me using jenkins deployement";
    }
}
