package com.grepp.ashspring.app.domain.member;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Data
@Entity
@DynamicInsert
@DynamicUpdate
public class Member {

    @Id
    private String userId;
    private String password;
    private String email;
    private String role = "ROLE_USER";
    private String tel;
    private Boolean activated = true;
    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime rentableDate = LocalDateTime.now().plus(7, ChronoUnit.DAYS);

    public void modifyPassword(String password) {
        if(password.length() > 10) return;
        this.password = password;
    }
}
