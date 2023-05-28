package com.example.PrestamoElementos.Service;

import com.example.PrestamoElementos.IntService.IPrestamoService;
import com.example.PrestamoElementos.Interfaces.IPrestamo;
import com.example.PrestamoElementos.Model.Prestamo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PrestamoService implements IPrestamoService{

    @Autowired
    private IPrestamo data;

    @Override
    public List<Prestamo> listarPrestamo() {
        return data.findAll();
    }

    @Override
    public void guardarPrestamo(Prestamo pres) {
        data.save(pres);
    }

    @Override
    public Optional<Prestamo> editarPrestamo(int id) {
        return data.findById(id);
    }

    @Override
    public void eliminarPrestamo(int id) {
        data.deleteById(id);
    }

}
