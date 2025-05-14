package com.trabajo.cine.Trabajo_Cine.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Table(name = "resenias")
@Entity
public class Resenia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String comentario;

    @Min(1)
    @Max(5)
    private Integer puntuacion;

    @ManyToOne
    @JoinColumn(name = "pelicula_id")
    private Pelicula pelicula;

}
