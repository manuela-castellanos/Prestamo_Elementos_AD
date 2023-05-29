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

    @GetMapping("/listarPrestamo")
    public String listarPrestamo(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "Prestamo");

        List<Prestamo> prestamo = ser.listarPrestamo();

        model.addAttribute("datosPrestamo", prestamo);

        return "indexPres";
    }
    @GetMapping("/nuevoPrestamo")
    public String agregarPrestamo(Model model){
        model.addAttribute("titulo","Nuevo Elemento");
        model.addAttribute("cuerpo", "Prestamo Nuevo");
        model.addAttribute("prestamo", new Prestamo());
        return "Prest";
    }
    @PostMapping("/guardarPrestamo")
    public String guardarPrestamo(@ModelAttribute Prestamo pres){
        ser.guardarPrestamo(pres);
        return "redirect:/listarPrestamo";
    }

    @GetMapping("/editarPrestamo/{id}")
    public String editarPrestamo(@PathVariable("id") int id, Model model){
        model.addAttribute("prestamo", ser.editarPrestamo(id));
        return "Prest";
    }
    @GetMapping("/eliminarPrestamo/{id}")
    public String eliminarPrestamo(@PathVariable("id") int id, Model model){
        ser.eliminarPrestamo(id);
        return "redirect:/listarPrestamo";
    }
}
