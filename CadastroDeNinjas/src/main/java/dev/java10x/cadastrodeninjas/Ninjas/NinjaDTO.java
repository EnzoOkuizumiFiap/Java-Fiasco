package dev.java10x.cadastrodeninjas.Ninjas;

import dev.java10x.cadastrodeninjas.Missoes.MissoesModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* #P90 29 DTO X MAPPER - Parte 1 */
// DTO - Data Transfer Object

/*O DTO serve para tirar responsabilidade do Model, e passar para a API sem expor o seu Model / Banco de dados */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private int idade;
    private String email;
    private String imgUrl;
    private String rank;
    private MissoesModel missoes;

}
