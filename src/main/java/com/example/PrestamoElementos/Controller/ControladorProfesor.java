package com.example.PrestamoElementos.Controller;

import com.example.PrestamoElementos.IntService.IProfesorService;
import com.example.PrestamoElementos.Model.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ControladorProfesor {

    @Autowired
    private IProfesorService servi;

    @GetMapping("/")
    public String listarProfesor(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "Profesores");

        List<Profesor> profesor = servi.listarProfesor();

        model.addAttribute("datos", profesor);

        return "";
    }
    @GetMapping("/")
    public String agregar(Model model){
        model.addAttribute("titulo","Nuevo Profesor");
        model.addAttribute("cuerpo", "Profesor Nuevo");
        model.addAttribute("persona", new Profesor());
        return "";
    }
    @PostMapping("/")
    public String guardar(@ModelAttribute Profesor prof){
        servi.guardar(prof);
        return "redirect:/";
    }
    @GetMapping("/editar/{id}")
    public String editarElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("profesor", servi.editar(id));
        return "";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarElemento(@PathVariable("id") int id, Model model){
        servi.eliminar(id);
        return "redirect:/";
    }
}
