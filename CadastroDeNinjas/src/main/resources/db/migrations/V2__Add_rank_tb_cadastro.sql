-- #P81 19 - Introdução a Migrations - Flyway

-- V2: Migrations para adicionar a coluna de RANK na tabela de cadastro (Ela é Imutável, depois de criada NÃO é possível adicionar ou alterar)
ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);