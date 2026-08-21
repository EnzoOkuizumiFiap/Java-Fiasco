package br.com.movieflix.controller;

import br.com.movieflix.controller.request.MovieRequest;
import br.com.movieflix.controller.response.MovieResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;

import java.util.List;

/* #P112 12 Swagger - Documentando a aplicação */
@Tag(name = "Movie", description = "Recurso responsável pelo gerenciamento dos filmes.")
public interface MovieController {

    @Operation(summary = "Listar filmes", description = "Método responsável por buscar todos os filmes.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filmes encontrados com sucesso", content = @Content(schema = @Schema(implementation = MovieResponse.class))),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content())
    })
    ResponseEntity<List<MovieResponse>> findAll();

    @Operation(summary = "Buscar filme por id", description = "Método responsável por buscar um filme pelo id.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filme encontrado com sucesso", content = @Content(schema = @Schema(implementation = MovieResponse.class))),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Filme não encontrado", content = @Content())
    })
    ResponseEntity<MovieResponse> findById(Long id);

    @Operation(summary = "Buscar filmes por categoria", description = "Método responsável por buscar filmes associados ao código de uma categoria.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Busca realizada com sucesso", content = @Content(schema = @Schema(implementation = MovieResponse.class))),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content())
    })
    ResponseEntity<List<MovieResponse>> findByCategory(Long category);

    @Operation(summary = "Salvar filme", description = "Método responsável por realizar o salvamento de um novo filme.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filme salvo com sucesso", content = @Content(schema = @Schema(implementation = MovieResponse.class))),
            @ApiResponse(responseCode = "400", description = "Dados inválidos", content = @Content()),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content())
    })
    ResponseEntity<MovieResponse> save(MovieRequest request);

    @Operation(summary = "Atualizar filme", description = "Método responsável por atualizar os dados de um filme existente.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Filme atualizado com sucesso", content = @Content(schema = @Schema(implementation = MovieResponse.class))),
            @ApiResponse(responseCode = "400", description = "Dados inválidos", content = @Content()),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Filme não encontrado", content = @Content())
    })
    ResponseEntity<MovieResponse> update(Long id, MovieRequest request);

    @Operation(summary = "Excluir filme", description = "Método responsável por excluir um filme pelo id.", security = @SecurityRequirement(name = "bearerAuth"))
    @ApiResponses({
            @ApiResponse(responseCode = "204", description = "Filme excluído com sucesso", content = @Content()),
            @ApiResponse(responseCode = "403", description = "Acesso negado: autenticação obrigatória", content = @Content()),
            @ApiResponse(responseCode = "404", description = "Filme não encontrado", content = @Content())
    })
    ResponseEntity<Void> delete(Long id);
}
