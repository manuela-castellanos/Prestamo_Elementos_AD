package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Sala;

import java.util.List;
import java.util.Optional;

public interface ISalaService {
    public List<Sala> listarSala();

    public void guardarSala(Sala sal);

    public Optional<Sala> editarSala(int id);

    public void eliminarSala(int id);
}
