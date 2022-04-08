package com.example.firstspringbootproject.domain.posts;

import org.aspectj.lang.annotation.After;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {

    @Autowired
    PostsRepository postsRepository;


    @Test
    public void 게시글저장_불러오기(){
        //given
        String  title = "테스트 게시글";
        String content = "테스트 본문";

        //id값이 없으면 insert, 있으면 update가 실행된다
        postsRepository.save(Posts.builder()
        .title(title)
        .content(content)
        .author("yang@naver.com")
        .build());

        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        assertEquals(posts.getTitle(), title);
        assertEquals(posts.getContent(), content);
    }

}