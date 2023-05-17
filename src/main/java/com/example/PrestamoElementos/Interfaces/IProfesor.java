package com.example.PrestamoElementos.Interfaces;

import com.example.PrestamoElementos.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProfesor extends JpaRepository<Profesor, Integer> {
}
