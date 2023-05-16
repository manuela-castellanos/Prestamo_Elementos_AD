package com.example.PrestamoElementos.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "elemento")
public class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int idelemento;
    private String tipoelemento;
    private int numcantidad;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idsala")
    private Sala sala;

    @OneToMany(mappedBy = "elemento", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Prestamo> prestamos;

}
