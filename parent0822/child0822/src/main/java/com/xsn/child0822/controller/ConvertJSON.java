package com.xsn.child0822.controller;

import com.xsn.child0822.model.Reader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class ConvertJSON {
    @RequestMapping("/reader")
    @ResponseBody
    public Object user(){
        Reader users = new Reader();
        users.setId(55);
        users.setName("汉字");
        users.setDate(new Date());
        return users;
    }
}
