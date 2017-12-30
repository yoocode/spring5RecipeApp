package yoo.springframework5.spring5recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})//for multiple endpoints, use {}
    public String getIndexPage(){
        System.out.println("this is devtool");
        return "index";
    }
}
