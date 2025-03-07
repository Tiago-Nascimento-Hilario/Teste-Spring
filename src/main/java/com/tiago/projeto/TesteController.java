package com.tiago.projeto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TesteController {
    @RequestMapping(path = "/home")
    public String acao(Model model){
        model.addAttribute("nome", "Tiago Nascimento Hilario");
        return "index";
    }
}
