package dev.java10x.cadastrodeninjas.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/ninjas/ui")
public class NinjaControllerUi {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/listar")
    public String listarNinjas(Model model) {
        List<NinjaDTO> ninjas = ninjaService.listarNinjas();
        model.addAttribute("ninjas", ninjas);
        return "listarNinjas"; // Precisa retornar o nome da página que renderiza
    }

    @GetMapping("/detalhes/{id}")
    public String detalhesNinja(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        NinjaDTO ninja = ninjaService.listarNinjaPorId(id);

        if (ninja != null) {
            model.addAttribute("ninja", ninja);
            return "detalhesNinja";
        }

        redirectAttributes.addFlashAttribute("mensagem", "Ninja não encontrado.");
        return "redirect:/ninjas/ui/listar";
    }

    @GetMapping("/adicionar")
    public String exibirFormularioAdicionar(Model model) {
        model.addAttribute("ninja", new NinjaDTO());
        model.addAttribute("modoEdicao", false);
        return "formNinja";
    }

    @PostMapping("/adicionar")
    public String adicionarNinja(@ModelAttribute NinjaDTO ninja, RedirectAttributes redirectAttributes) {
        NinjaDTO novoNinja = ninjaService.criarNinja(ninja);
        redirectAttributes.addFlashAttribute("mensagem", "Ninja " + novoNinja.getNome() + " adicionado com sucesso.");
        return "redirect:/ninjas/ui/listar";
    }

    @GetMapping("/alterar/{id}")
    public String exibirFormularioAlterar(@PathVariable Long id, Model model, RedirectAttributes redirectAttributes) {
        NinjaDTO ninja = ninjaService.listarNinjaPorId(id);

        if (ninja == null) {
            redirectAttributes.addFlashAttribute("mensagem", "Ninja não encontrado.");
            return "redirect:/ninjas/ui/listar";
        }

        model.addAttribute("ninja", ninja);
        model.addAttribute("modoEdicao", true);
        return "formNinja";
    }

    @PostMapping("/alterar/{id}")
    public String alterarNinja(@PathVariable Long id, @ModelAttribute NinjaDTO ninja, RedirectAttributes redirectAttributes) {
        NinjaDTO ninjaExistente = ninjaService.listarNinjaPorId(id);

        if (ninjaExistente == null) {
            redirectAttributes.addFlashAttribute("mensagem", "Ninja não encontrado.");
            return "redirect:/ninjas/ui/listar";
        }

        ninja.setMissoes(ninjaExistente.getMissoes());
        NinjaDTO ninjaAtualizado = ninjaService.atualizarNinja(id, ninja);
        redirectAttributes.addFlashAttribute("mensagem", "Dados de " + ninjaAtualizado.getNome() + " atualizados com sucesso.");
        return "redirect:/ninjas/ui/detalhes/" + id;
    }

    @GetMapping("/deletar/{id}")
    public String deletarNinja(@PathVariable Long id) {
        ninjaService.deletarNinjaPorId(id);
        return "redirect:/ninjas/ui/listar";
    }

}
