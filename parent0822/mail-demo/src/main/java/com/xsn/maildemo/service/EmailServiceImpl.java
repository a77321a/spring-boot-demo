package com.xsn.maildemo.service;

import com.xsn.maildemo.email.EmailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {
    @Autowired
    private EmailConfig emailConfig;
    @Autowired
    private JavaMailSender javaMailSender;
    @Override
    public void sendEmail(String sendTo, String title, String content) {
        emailConfig.getEmailFrom();
        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(emailConfig.getEmailFrom());
        simpleMailMessage.setTo(sendTo);
        simpleMailMessage.setSubject(title);
        simpleMailMessage.setText(content);

        javaMailSender.send(simpleMailMessage);
    }
}
