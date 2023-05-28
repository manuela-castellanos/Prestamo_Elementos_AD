package com.example.PrestamoElementos.Service;

import com.example.PrestamoElementos.IntService.IElementoService;
import com.example.PrestamoElementos.Interfaces.IElemento;
import com.example.PrestamoElementos.Model.Elemento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElementoService implements IElementoService {

    @Autowired
    private IElemento data;

    @Override
    public List<Elemento> listarElemento() {
        return data.findAll();
    }

    @Override
    public void guardarElemento(Elemento elem) {
        data.save(elem);
    }

    @Override
    public Optional<Elemento> editarElemento(int id) {
        return data.findById(id);
    }

    @Override
    public void eliminarElemento(int id) {
        data.deleteById(id);
    }
}
