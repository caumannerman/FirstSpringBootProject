package com.example.firstspringbootproject.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor // final필드가 포함된 생성자를 만들어줌
public class HelloResponseDto {

    private final String name;
    private final int amount;
}
