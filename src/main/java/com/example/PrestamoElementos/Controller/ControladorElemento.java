package com.example.PrestamoElementos.Controller;

import com.example.PrestamoElementos.IntService.IElementoService;
import com.example.PrestamoElementos.Model.Elemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping
public class ControladorElemento {

    @Autowired
    private IElementoService serv;

    @GetMapping("/listarElemento")
    public String listarElemento(Model model) {


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "ELEMENTOS");

        List<Elemento> elements = serv.listarElemento();

        model.addAttribute("datosElemento", elements);

        return "indexElem";
    }

    @GetMapping("/nuevoElemento")
    public String agregarElemento(Model model) {
        model.addAttribute("titulo", "Nuevo Elemento");
        model.addAttribute("cuerpo", "Elemento Nuevo");
        model.addAttribute("elemento", new Elemento());
        return "Element";
    }

    @PostMapping("/guardarElemento")
    public String guardarElemento(@ModelAttribute Elemento elem) {
        serv.guardarElemento(elem);
        return "redirect:/listarElemento";
    }

    @GetMapping("/editarElemento/{id}")
    public String editarElemento(@PathVariable("id") int id, Model model) {
        model.addAttribute("elemento", serv.editarElemento(id));
        return "Element";
    }

    @GetMapping("/eliminarElemento/{id}")
    public String eliminarElemento(@PathVariable("id") int id, Model model) {
        serv.eliminarElemento(id);
        return "redirect:/listarElemento";
    }
}
