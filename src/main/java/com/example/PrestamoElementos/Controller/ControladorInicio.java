package com.example.PrestamoElementos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class ControladorInicio {

    @GetMapping("/inicio")
    public String listarElemento(Model model) {


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "PRESTAMO DE ELEMENTOS");

        return "index";
    }
}
