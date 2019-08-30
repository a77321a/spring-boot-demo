package com.xsn.maildemo.service;

import java.io.File;

public interface EmailService {

//    发送简单的文本文件
    void sendEmail(String sendTo,String title,String content);
    void sendAttachEmail(String sendTo, String title, String content, File file);
}
