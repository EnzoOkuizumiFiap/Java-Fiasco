package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/* #P83 22 - Ninja Service - JPA */
@Service
public class NinjaService {

    @Autowired // Injeção de Dependência: o Spring cria e injeta o NinjaRepository nesta classe
    private NinjaRepository ninjaRepository;
    @Autowired
    private NinjaMapper ninjaMapper;

    // Listar todos os meus Ninjas / #P83 22 - Ninja Service - JPA
    public List<NinjaDTO> listarNinjas() {
        List<NinjaModel> ninjas = ninjaRepository.findAll();

        return ninjas.stream()
                .map(ninjaMapper::map)
                .collect(Collectors.toList());
    }

    // Listar o meu ninja por ID / #P84 23 - Ninja Service - Listar Ninja + Serialização
    public NinjaDTO listarNinjaPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);

        return ninjaPorId.map(ninjaMapper::map).orElse(null);
    }

    // Criar um novo ninja / #P85 24 - Ninja Service - Criando ninjas
    public NinjaDTO criarNinja(NinjaDTO ninjaDTO) {
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        ninjaModel = ninjaRepository.save(ninjaModel);
        return ninjaMapper.map(ninjaModel);
    }

    // Deletar o ninja (Tem que ser um metodo VOID) / #P87 26 - Ninja Service - Deletar ninja
    public void deletarNinjaPorId(Long id) {
        ninjaRepository.deleteById(id);
    }

    // Atualizar Ninja / #P88 27 - Ninja Service - Atualizar Ninja
    public NinjaDTO atualizarNinja(Long id, NinjaDTO ninjaDTO) {
        Optional<NinjaModel> ninjaExistente = ninjaRepository.findById(id);
        if (ninjaExistente.isPresent()) {
            NinjaModel ninjaAtualizado = ninjaMapper.map(ninjaDTO);
            ninjaAtualizado.setId(id);
            NinjaModel ninjaSalvo = ninjaRepository.save(ninjaAtualizado);

            return ninjaMapper.map(ninjaSalvo);
        }
        return null;
    }
}
