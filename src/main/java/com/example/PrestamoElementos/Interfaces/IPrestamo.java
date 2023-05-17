package com.example.PrestamoElementos.Interfaces;

import com.example.PrestamoElementos.Model.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPrestamo extends JpaRepository<Prestamo, Integer> {
}
