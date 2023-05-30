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

    @GetMapping("/listarProfesor")
    public String listarProfesor(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "PROFESORES");

        List<Profesor> profesor = servi.listarProfesor();

        model.addAttribute("datosProfesor", profesor);

        return "indexProf";
    }
    @GetMapping("/nuevoProfesor")
    public String agregarProfesor(Model model){
        model.addAttribute("titulo","Nuevo Profesor");
        model.addAttribute("cuerpo", "Profesor Nuevo");
        model.addAttribute("profesor", new Profesor());
        return "Profe";
    }

    @PostMapping("/guardarProfesor")
    public String guardarProfesor(@ModelAttribute Profesor prof){
        servi.guardarProfesor(prof);
        return "redirect:/listarProfesor";
    }
    @GetMapping("/editarProfesor/{id}")
    public String editarProfesor(@PathVariable("id") int id, Model model){
        model.addAttribute("profesor", servi.editarProfesor(id));
        return "Profe";
    }
    @GetMapping("/eliminarProfesor/{id}")
    public String eliminarProfesor(@PathVariable("id") int id, Model model){
        servi.eliminarProfesor(id);
        return "redirect:/listarProfesor";
    }
}
