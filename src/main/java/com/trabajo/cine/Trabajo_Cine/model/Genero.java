package com.trabajo.cine.Trabajo_Cine.model;

import jakarta.persistence.*;
@Table(name = "generos")
@Entity
public class Genero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String nombre;
}
