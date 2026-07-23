package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;

/* #P74 12 - Missões Repository e #P75 13 - ORM - Mapeamento objeto-relacional */
public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
