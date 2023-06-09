package org.coteis.domain.category;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "languages")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "language_no", updatable = false)
    private Integer languageNo;

    @Column(name = "language_name", nullable = false)
    private String languageName;

    @Builder
    public Language(String languageName) { this.languageName = languageName; }

}
