package com.example.firstspringbootproject.service;

import com.example.firstspringbootproject.domain.posts.Posts;
import com.example.firstspringbootproject.domain.posts.PostsRepository;
import com.example.firstspringbootproject.web.dto.PostsDto;
import com.example.firstspringbootproject.web.dto.PostsResponseDto;
import com.example.firstspringbootproject.web.dto.PostsUpdateRequestDto;
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

    @Transactional
    public Long update(Long id, PostsUpdateRequestDto requestDto){
        Posts posts = postsRepository.findById(id).orElseThrow( () -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));
        //
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById (Long id) {
        Posts entity = postsRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id=" + id));

        return new PostsResponseDto(entity);
    }
}
