package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Elemento;

import java.util.List;
import java.util.Optional;

public interface IElementoService {

    public List<Elemento> listarElemento();

    public void guardarElemento(Elemento elem);

    public Optional<Elemento> editarElemento(int id);

    public void eliminarElemento(int id);
}
