package com.example.firstspringbootproject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
        //mustache starter로 인해, 앞의 경로, 뒤의 확장자(.mustache)는 알아서 지정된다. 즉,templates안의  index.mustache가 반환된다!
        return "index";
    }

    @GetMapping("/posts/save")
    public String postsSave(){
        return "posts-save";
    }
}


