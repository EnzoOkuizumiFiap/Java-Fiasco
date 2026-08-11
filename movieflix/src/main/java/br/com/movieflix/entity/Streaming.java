package br.com.movieflix.entity;

import jakarta.persistence.*;
import lombok.*;

/* #102 03 Cadastro de Streaming */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "streaming")
public class Streaming {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
}
