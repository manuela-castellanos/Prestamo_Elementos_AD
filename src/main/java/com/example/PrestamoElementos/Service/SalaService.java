package com.example.PrestamoElementos.Service;

import com.example.PrestamoElementos.IntService.ISalaService;
import com.example.PrestamoElementos.Interfaces.ISala;
import com.example.PrestamoElementos.Model.Sala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SalaService implements ISalaService {

    @Autowired
    private ISala data;

    @Override
    public List<Sala> listarSala() {
        return data.findAll();
    }

    @Override
    public void guardar(Sala sal) {
        data.save(sal);
    }

    @Override
    public Optional<Sala> editar(int id) {
        return data.findById(id);
    }

    @Override
    public void eliminar(int id) {
        data.deleteById(id);
    }
}
