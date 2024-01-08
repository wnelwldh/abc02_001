package com.example.codestates.coment.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class Coment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long comentid;
    @Column(length = 200)
    private String context;
    @Column(nullable = false, length = 20)
    private String nickname;

    private long bandId;

    private long userId;
    @Column(nullable = false)
    private LocalDateTime createdAt = LocalDateTime.now();
    @Column(nullable = false, name="LAST_MODIFIED_AT")
    private LocalDateTime modifiedAt = LocalDateTime.now();

}