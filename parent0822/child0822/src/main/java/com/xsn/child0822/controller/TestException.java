package com.xsn.child0822.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestException {
    @RequestMapping("/exception")
    @ResponseBody
    public String show(){
        int a = 5/0;
        return "exception";
    }
}
