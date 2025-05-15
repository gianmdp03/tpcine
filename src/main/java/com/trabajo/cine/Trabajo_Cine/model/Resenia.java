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

    public Resenia(String comentario, Pelicula pelicula, Integer puntuacion) {
        this.comentario = comentario;
        this.pelicula = pelicula;
        this.puntuacion = puntuacion;
    }

    public Resenia() {
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Integer getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(Integer puntuacion) {
        this.puntuacion = puntuacion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
