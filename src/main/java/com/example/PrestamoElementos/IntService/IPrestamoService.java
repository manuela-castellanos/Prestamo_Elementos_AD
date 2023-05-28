package com.example.PrestamoElementos.IntService;

import com.example.PrestamoElementos.Model.Prestamo;

import java.util.List;
import java.util.Optional;

public interface IPrestamoService {
    public List<Prestamo> listarPrestamo();

    public void guardarPrestamo(Prestamo pres);

    public Optional<Prestamo> editarPrestamo(int id);

    public void eliminarPrestamo(int id);
}
