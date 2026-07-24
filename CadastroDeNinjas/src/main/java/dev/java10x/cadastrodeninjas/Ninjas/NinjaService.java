package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* #P83 22 - Ninja Service - JPA */
@Service
public class NinjaService {

    @Autowired // Injeção de Dependência: o Spring cria e injeta o NinjaRepository nesta classe
    private NinjaRepository ninjaRepository;

    // Listar todos os meus Ninjas / #P83 22 - Ninja Service - JPA
    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    // Listar o meu ninja por ID / #P84 23 - Ninja Service - Listar Ninja + Serialização
    public NinjaModel listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    // Criar um novo ninja / #P85 24 - Ninja Service - Criando ninjas
    public NinjaModel criarNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Deletar o ninja (Tem que ser um metodo VOID) / #P87 26 - Ninja Service - Deletar ninja
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar Ninja / #P88 27 - Ninja Service - Atualizar Ninja
    public NinjaModel atualizarNinja(Long id, NinjaModel ninjaAtualizado) {
        if (ninjaRepository.existsById(id)) {
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }
}
