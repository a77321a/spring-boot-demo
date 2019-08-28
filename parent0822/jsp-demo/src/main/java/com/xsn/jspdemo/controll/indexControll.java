package com.xsn.jspdemo.controll;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexControll {
    @RequestMapping("/index")
    public String indexString(Model model){
        model.addAttribute("name","张三");
//        index.jsp
//        return "index";
        return "show";
    }
}
