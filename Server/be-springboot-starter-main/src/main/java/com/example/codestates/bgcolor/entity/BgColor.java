package com.example.codestates.bgcolor.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BgColor { //BackgroundColor 줄인 단어

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bgColorId; // 기본키

    private String colorName; // 색상의 이름을 저장하는 필드

    private String hexCode; // 색상의 Hex 코드를 저장하는 필드
}