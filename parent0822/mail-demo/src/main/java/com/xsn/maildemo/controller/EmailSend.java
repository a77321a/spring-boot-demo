package com.xsn.maildemo.controller;

import com.xsn.maildemo.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailSend {

    @Autowired
    private EmailService emailService;
    @RequestMapping("/mail")
     public String email(){

        emailService.sendEmail("1817169988@qq.com","这是邮件标题","这是邮件内容");
        return "success";
    }
}
