package com.example.firstspringbootproject.domain;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class BaseTimeEntity {

    @CreatedDate // Entity가 생성되어 저장된 시간이 자동 저장됨
    private LocalDateTime createdDate;

    @LastModifiedDate // 조회 후 값 변경시, 시간 자동 저장
    private LocalDateTime modifiedDate;
}
