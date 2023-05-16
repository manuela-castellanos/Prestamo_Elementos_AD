package com.example.PrestamoElementos.Model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.*;

@Data
@Entity
@Table(name = "sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idsala;
    private String tiposala;

    @OneToMany(mappedBy = "sala", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Elemento> elementos;
}
