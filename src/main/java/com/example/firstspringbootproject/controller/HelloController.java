package com.example.firstspringbootproject.controller;

import com.example.firstspringbootproject.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello(){
        return "hello";
    }

    @GetMapping("/api/hello/dto")
    public HelloResponseDto helloDto(
            @RequestParam("name") String name,
            @RequestParam("amount") int amount){

        return new HelloResponseDto(name, amount);
    }
}
