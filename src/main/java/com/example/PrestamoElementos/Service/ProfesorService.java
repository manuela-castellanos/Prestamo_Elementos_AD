package com.example.PrestamoElementos.Service;

import com.example.PrestamoElementos.IntService.IProfesorService;
import com.example.PrestamoElementos.Interfaces.IProfesor;
import com.example.PrestamoElementos.Model.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService implements IProfesorService{

    @Autowired
    private IProfesor data;

    @Override
    public List<Profesor> listarProfesor() {
        return data.findAll();
    }

    @Override
    public void guardarProfesor(Profesor prof) {
        data.save(prof);
    }

    @Override
    public Optional<Profesor> editarProfesor(int id) {
        return data.findById(id);
    }

    @Override
    public void eliminarProfesor(int id) {
        data.deleteById(id);
    }
}
