package dev.java10x.java10xdocker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    /* #P146 02 Dockerfile - O primeiro passo para dockerizar qualquer coisa */
    @GetMapping("/docker")
    public String mensagem() {
        return "Essa é uma aplicação Docker";
    }
}
