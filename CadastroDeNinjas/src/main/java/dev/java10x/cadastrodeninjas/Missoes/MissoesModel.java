package dev.java10x.cadastrodeninjas.Missoes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.cadastrodeninjas.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
public class MissoesModel {
    /* #P69 7 - Modelando o banco de dados - Tabela de Missões */
    // Estamos usando arquitetura em camadas

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    /* #P70 8 - @ManyToOne e @OneToMany - Relacionamento entre tabelas */

    @OneToMany(mappedBy = "missoes") // Uma missão tem vários Ninjas - mappedBy = "missoes": Indica que o lado proprietário (onde fica a Foreign Key) é o atributo 'missoes' na classe NinjaModel
    @JsonIgnore
    private List<NinjaModel> ninja;
}
