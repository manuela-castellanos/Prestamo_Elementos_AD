package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {
    public List<Profesor> listarProfesor();

    public void guardarProfesor(Profesor prof);

    public Optional<Profesor> editarProfesor(int id);

    public void eliminarProfesor(int id);
}
