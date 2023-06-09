package org.coteis.domain.category;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Difficulty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "difficulty_no", updatable = false)
    private Integer difficultyNo;

    @Column(name = "difficulty_name", nullable = false)  // 알고리즘 종류
    private String difficultyName;

    @Builder
    public Difficulty(String difficultyName) {
        this.difficultyName = difficultyName;
    }
}