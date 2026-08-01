package dev.java10x.cadastrodeninjas.Ninjas;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
@Tag(name = "Ninjas", description = "Operações para o cadastro de ninjas")
public class NinjaController {
    /* #P65 3 Primeira rota @GetMapping - E finalizando primeira Issue */

    @Autowired
    private NinjaService ninjaService;

    // Adicionar Ninja (CREATE)
    @PostMapping("/criar")
    @Operation(summary = "Cria um novo ninja", description = "Rota cria um novo ninja e insere no banco de dados") /* #P97 36 - Introdução ao Swagger [Aula Extra] - @Operation e @ApiResponse */
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Ninja criado com sucesso"),
            @ApiResponse(responseCode = "400", description = "Erro na criação do ninja")
    })
    public ResponseEntity<String> criarNinja(@RequestBody NinjaDTO ninja) {
        /* #P93 32 - ResponseEntity */
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Ninja criado com sucesso: " + novoNinja.getNome() + " (ID): " + novoNinja.getId());
    }

    // Procurar Todos os Ninjas (READ)
    @GetMapping("/listar")
    @Operation(summary = "Lista todos os ninjas", description = "Retorna todos os ninjas cadastrados no banco de dados")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninjas listados com sucesso")
    })
    public ResponseEntity<List<NinjaDTO>> listarNinjas() {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        return ResponseEntity.ok(ninjas);
    }

    // Procurar Ninja por id (READ)
    @GetMapping("/listar/{id}")
    @Operation(summary = "Busca um ninja pelo ID", description = "Retorna os dados de um ninja específico")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja encontrado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado")
    })
    public ResponseEntity<?> listarNinjasPorId(@PathVariable Long id) {
        NinjaDTO ninjaPorId = ninjaService.listarNinjaPorId(id);

        if (ninjaPorId != null) {
            return ResponseEntity.ok(ninjaPorId);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o ID " + id + " não existe nos nossos registros!");
        }
    }

    // Alterar dados do Ninja (UPDATE)
    @PutMapping("/alterar/{id}")
    @Operation(summary = "Altera um ninja", description = "Atualiza os dados do ninja informado pelo ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja atualizado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado, não foi possível alterar")
    })
    public ResponseEntity<?> alterarNinjaPorId(
            @Parameter(description = "Usuário manda o Id no caminho da requisição")
            @PathVariable Long id,
            @RequestBody NinjaDTO ninjaAtualizado) {
        NinjaDTO ninjaAtualizar = ninjaService.atualizarNinja(id, ninjaAtualizado);

        if (ninjaAtualizar != null) {
            return ResponseEntity.ok(ninjaAtualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("Ninja com o ID " + id + " não existe nos nossos registros!");
        }
    }

    // Deletar Ninja (DELETE)
    @DeleteMapping("/deletar/{id}")
    @Operation(summary = "Deleta um ninja", description = "Remove do banco o ninja informado pelo ID")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ninja deletado com sucesso"),
            @ApiResponse(responseCode = "404", description = "Ninja não encontrado")
    })
    public ResponseEntity<String> deletarNinja(@PathVariable Long id) {
        if(ninjaService.listarNinjaPorId(id) != null){
            ninjaService.deletarNinjaPorId(id);
            return ResponseEntity.ok("Ninja com o ID " + id + " deletado com sucesso!");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("O ninja com o ID " + id + " não foi encontrado!");
        }
    }
}
