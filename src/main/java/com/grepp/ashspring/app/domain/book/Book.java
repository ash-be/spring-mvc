package com.grepp.ashspring.app.domain.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;

import java.time.LocalDateTime;

@Data
@Entity
@DynamicInsert
public class Book {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String author;
    private String category;
    private String info;
    private Integer amount;
    @Column(columnDefinition = "timestamp default now()")
    private LocalDateTime createdAt;
    private Integer rentCnt;
    private Boolean activated;
}
