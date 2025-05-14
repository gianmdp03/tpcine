package com.trabajo.cine.Trabajo_Cine.model;
import jakarta.persistence.*;
@Table(name="directores")
@Entity
public class Director {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable = false)
    private String nombre;
}
