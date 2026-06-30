package com.example.calendar.dto;

import lombok.Getter;

@Getter
public class ResponseDto {

    private final Long id;
    private final String writer;
    private final String title;
    private final String message;

    public ResponseDto(Long id, String writer, String title, String message) {
        this.id = id;
        this.writer = writer;
        this.title = title;
        this.message = message;
    }
}
