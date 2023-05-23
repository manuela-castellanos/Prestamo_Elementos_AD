package com.example.PrestamoElementos.Controller;

import com.example.PrestamoElementos.IntService.ISalaService;
import com.example.PrestamoElementos.Model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ControladorSala {

    @Autowired
    private ISalaService service;

    @GetMapping("/")
    public String listarSala(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "Sala");

        List<Sala> sala = service.listarSala();

        model.addAttribute("datos", sala);

        return "";
    }
    @GetMapping("/")
    public String agregar(Model model){
        model.addAttribute("titulo","Nueva Sala");
        model.addAttribute("cuerpo", "Sala Nueva");
        model.addAttribute("persona", new Sala());
        return "";
    }
    @PostMapping("/")
    public String guardar(@ModelAttribute Sala sal){
        service.guardar(sal);
        return "redirect:/";
    }
    @GetMapping("/editar/{id}")
    public String editarElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("sala", service.editar(id));
        return "";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarElemento(@PathVariable("id") int id, Model model){
        service.eliminar(id);
        return "redirect:/";
    }

}
