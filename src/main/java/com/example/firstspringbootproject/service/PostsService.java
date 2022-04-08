package com.example.firstspringbootproject.service;

import com.example.firstspringbootproject.domain.posts.PostsRepository;
import com.example.firstspringbootproject.web.dto.PostsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
//서비스는 트랜잭션과 도메인 간 순서만 보장해준다! 비즈니스 로직 X
public class PostsService {
    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsDto dto){

        return postsRepository.save(dto.toEntity()).getId();
    }
}
