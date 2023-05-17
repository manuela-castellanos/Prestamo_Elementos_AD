package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Sala;

import java.util.List;
import java.util.Optional;

public interface ISalaService {
    public List<Sala> listarSala();

    public void guardar(Sala sal);

    public Optional<Sala> editar(int id);

    public void eliminar(int id);
}
