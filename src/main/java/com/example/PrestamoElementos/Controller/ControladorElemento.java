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

    @GetMapping("/listar")
    public String listarElemeto(Model model){


        model.addAttribute("titulo", "Prestamo Elementos");
        model.addAttribute("cuerpo", "Elementos");

        List<Elemento> elements = serv.listarElemento();

        model.addAttribute("datos", elements);

        return "index";
    }
    @GetMapping("/nuevo")
    public String agregar(Model model){
        model.addAttribute("titulo","Nuevo Elemento");
        model.addAttribute("cuerpo", "Elemento Nuevo");
        model.addAttribute("persona", new Elemento());
        return "elemento";
    }
    @PostMapping("/guardar")
    public String guardar(@ModelAttribute Elemento elem){
        serv.guardar(elem);
        return "redirect:/listar";
    }
    @GetMapping("/editar/{id}")
    public String editarElemento(@PathVariable("id") int id, Model model){
        model.addAttribute("elemento", serv.editar(id));
        return "elemento";
    }
    @GetMapping("/eliminar/{id}")
    public String eliminarElemento(@PathVariable("id") int id, Model model){
        serv.eliminar(id);
        return "redirect:/listar";
    }
}
