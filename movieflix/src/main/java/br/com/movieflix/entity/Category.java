package br.com.movieflix.entity;

import jakarta.persistence.*;
import lombok.*;

/* #P101 02 Rotas de Categoria X Streaming X Filmes */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
}
