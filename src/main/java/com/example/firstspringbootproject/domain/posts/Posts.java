package com.example.firstspringbootproject.domain.posts;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // 해당 클래스로 테이블을 만들어준다!! JPA의 annotation임  // JPA를 사용하면 실제 쿼리를 날리기보다, 이 Entity 클래스의 수저을 통해 작업함
@Getter // lombok
@NoArgsConstructor //lombok
public class Posts {

    @Id //해당 테이블의 PK필드를 의미함
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 자동생성 annotation
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder // 생성자와 비슷하나, 어떤 필드에 어떤 값을 채워야하는지 명확하게 인지할 수 있다.
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author = author;
    }
}
