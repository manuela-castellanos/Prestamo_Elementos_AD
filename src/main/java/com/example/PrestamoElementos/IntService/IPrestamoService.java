package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Prestamo;

import java.util.List;
import java.util.Optional;

public interface IPrestamoService {
    public List<Prestamo> listarPrestamo();

    public void guardar(Prestamo pres);

    public Optional<Prestamo> editar(int id);

    public void eliminar(int id);
}
