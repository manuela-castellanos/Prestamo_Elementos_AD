package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    public List<Profesor> listarProfesor();

    public void guardar(Profesor prof);

    public Optional<Profesor> editar(int id);

    public void eliminar(int id);
}
