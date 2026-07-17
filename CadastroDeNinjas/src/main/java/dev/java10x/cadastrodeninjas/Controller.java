package dev.java10x.cadastrodeninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    /* #P65 3 Primeira rota @GetMapping - E finalizando primeira Issue */

    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Essa é minha primeira mensagem nessa rota";
    }

}
