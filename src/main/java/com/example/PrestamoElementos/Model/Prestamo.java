package com.example.PrestamoElementos.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "prestamo")
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprestamo;
    private Date fechahoraprestamo;
    private Date fechahoradevolucion;

    @ManyToOne
    @JoinColumn(name = "idprofesor")
    private Profesor profesor;

    @ManyToOne
    @JoinColumn(name = "idelemento")
    private Elemento elemento;

}
