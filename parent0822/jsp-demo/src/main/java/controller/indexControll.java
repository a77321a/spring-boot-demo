package controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class indexControll {
    @RequestMapping("/index")
    public String indexString(Model model){
        model.addAttribute("name","张三");
        return "index";
    }
}
