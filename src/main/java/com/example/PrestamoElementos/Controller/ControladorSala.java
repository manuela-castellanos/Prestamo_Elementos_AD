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

    @GetMapping("/listarSala")
    public String listarSala(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "SALA");

        List<Sala> sala = service.listarSala();

        model.addAttribute("datosSala", sala);

        return "indexSal";
    }
    @GetMapping("/nuevoSala")
    public String agregarSala(Model model){
        model.addAttribute("titulo","Nueva Sala");
        model.addAttribute("cuerpo", "Sala Nueva");
        model.addAttribute("sala", new Sala());
        return "Sal";
    }
    @PostMapping("/guardarSala")
    public String guardarSala(@ModelAttribute Sala sal){
        service.guardarSala(sal);
        return "redirect:/listarSala";
    }

    @GetMapping("/editarSala/{id}")
    public String editarSala(@PathVariable("id") int id, Model model){
        model.addAttribute("sala", service.editarSala(id));
        return "Sal";
    }
    @GetMapping("/eliminarSala/{id}")
    public String eliminarSala(@PathVariable("id") int id, Model model){
        service.eliminarSala(id);
        return "redirect:/listarSala";
    }
}
