package com.trabajo.cine.Trabajo_Cine.model;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name="actores")
@Entity
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;
    private String nacionalidad;

    @ManyToMany(mappedBy = "actores")
    private Set<Pelicula> peliculas = new HashSet<>();


}
