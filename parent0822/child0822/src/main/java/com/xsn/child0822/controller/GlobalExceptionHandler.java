package com.xsn.child0822.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

//全局异常处理器 aop思想
@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Map<String,Object> handleException(Exception exception){
        Map<String,Object> map = new HashMap<>();
        map.put("errcode",500);
        map.put("errInfo",exception.toString());
        return map;
    }
}
