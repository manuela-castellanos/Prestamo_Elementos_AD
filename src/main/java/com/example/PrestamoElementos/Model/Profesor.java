package com.example.PrestamoElementos.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idprofesor;
    private String nomprofesor;
    private String area;
    private String especializacion;

    @OneToMany(mappedBy = "profesor", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Prestamo> prestamos;

}
