package com.example.calendar.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class Schedule extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String writer;

    @Column(nullable = false, length = 1000)
    private String message;

    @Column(nullable = false, length = 50)
    private String title;

    @Column(nullable = false, length = 10)
    private String password;


    public Schedule(String writer, String message, String title, String password) {
        this.writer = writer;
        this.message = message;
        this.title = title;
        this.password = password;
    }

    public void update(String writer, String message, String title, String password) {
        this.writer = writer;
        this.message = message;
        this.title = title;
        this.password = password;
    }

}