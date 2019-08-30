package com.xsn.maildemo.service;

public interface EmailService {

//    发送简单的文本文件
    void sendEmail(String sendTo,String title,String content);
}
