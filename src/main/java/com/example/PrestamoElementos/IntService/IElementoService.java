package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Elemento;

import java.util.List;
import java.util.Optional;

public interface IElementoService {

    public List<Elemento> listarElemento();

    public void guardar(Elemento elem);

    public Optional<Elemento> editar(int id);

    public void eliminar(int id);
}
