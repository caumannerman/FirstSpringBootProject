package com.example.firstspringbootproject.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostsRepository extends JpaRepository<Posts, Long> {

    //SpringDataJpa에서 기본제공하는 메서드로 가능하나, 그렇지 않은 쿼리는 아래와 같이 @Query 어노테이션을 사용해 가능하다.
    @Query("SELECT p FROM Posts p ORDER BY p.id DESC")
    List<Posts> findAllDesc();

}
