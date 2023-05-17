package com.example.PrestamoElementos.Controller;

import com.example.PrestamoElementos.IntService.IPrestamoService;
import com.example.PrestamoElementos.Model.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ControladorPrestamo {

    @Autowired
    private IPrestamoService ser;

    @GetMapping("/mostrar")
    public String listarPrestamo(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "Prestamo");

        List<Prestamo> prestamo = ser.listarPrestamo();

        model.addAttribute("datos", prestamo);

        return "lis";
    }
    @GetMapping("/nv")
    public String agregar(Model model){
        model.addAttribute("titulo","Nuevo Elemento");
        model.addAttribute("cuerpo", "Elemento Nuevo");
        model.addAttribute("persona", new Prestamo());
        return "";
    }
    @PostMapping("/gd")
    public String guardar(@ModelAttribute Prestamo pres){
        ser.guardar(pres);
        return "redirect:/lis";
    }
    @GetMapping("/editar/{id}")
    public String editarElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("prestamo", ser.editar(id));
        return "";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarElemento(@PathVariable("id") int id, Model model){
        ser.eliminar(id);
        return "redirect:/lis";
    }
}
