package com.example.PrestamoElementos.Interfaces;

import com.example.PrestamoElementos.Model.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IElemento extends JpaRepository<Elemento, Integer> {
}
