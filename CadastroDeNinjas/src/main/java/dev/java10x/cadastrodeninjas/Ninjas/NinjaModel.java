package dev.java10x.cadastrodeninjas.Ninjas;

import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

// JPA - Java Persistence API

@Entity // Transforma uma classe em uma entidade do Banco de dados
@Table(name = "tb_cadastro") // tb -> table
@NoArgsConstructor // Construtor Vazio
@AllArgsConstructor // Construtor com todos os parâmetros
@Data // Cria todos os Getters / Setters
public class NinjaModel {
    /* #P67 5 - Entidades e persistência de dados - Tabela de Ninjas */

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private int idade;

    @Column(unique = true)
    private String email;

    /* #P70 8 - @ManyToOne e @OneToMany - Relacionamento entre tabelas */

    @ManyToOne // Um ninja tem uma única missão
    @JoinColumn(name = "missoes_id") // Lado proprietário do relacionamento: cria a Chave Estrangeira (FK) 'missoes_id' na tabela tb_cadastro, apontando para a PK de tb_missoes.
    private MissoesModel missoes;
}
