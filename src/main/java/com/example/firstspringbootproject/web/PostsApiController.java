package com.example.firstspringbootproject.web;

import com.example.firstspringbootproject.service.PostsService;
import com.example.firstspringbootproject.web.dto.PostsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PostsApiController {


    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsDto dto){
        return postsService.save(dto);
    }
}
