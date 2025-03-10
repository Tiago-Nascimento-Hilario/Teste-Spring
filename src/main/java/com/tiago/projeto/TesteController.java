package com.tiago.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {

    @RequestMapping(path = "/home")
    public String acao(Model model) {
        model.addAttribute("nome", "Tiago Nascimento Hilario");
        return "index";
    }

    @GetMapping("/formulario")
    public String exibiFormulario() {
        return "form";
    }

    @PostMapping("/formulario")
    public String enviaFormulario( Cliente cliente) {
        System.out.println(cliente);  
        return "form";
    }
}
