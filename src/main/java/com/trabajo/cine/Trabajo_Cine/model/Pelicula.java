package com.trabajo.cine.Trabajo_Cine.model;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Table(name="peliculas")
@Entity
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String titulo;

    @Column(nullable = false)
    private Integer anioEstreno;

    @Column(nullable = false)
    private Integer duracion;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @ManyToMany
    @JoinTable(
            name = "pelicula_actor",
            joinColumns = @JoinColumn(name = "pelicula_id"),
            inverseJoinColumns = @JoinColumn(name = "actor_id")
    )
    private Set<Actor> actores = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "director_id")
    private Director director;

    @OneToMany(mappedBy = "pelicula", cascade = CascadeType.ALL)
    private Set<Resenia> resenias = new HashSet<>();

    public Pelicula(Set<Actor> actores, Integer anioEstreno, Director director, Integer duracion, Genero genero, Set<Resenia> resenias, String titulo) {
        this.actores = actores;
        this.anioEstreno = anioEstreno;
        this.director = director;
        this.duracion = duracion;
        this.genero = genero;
        this.resenias = resenias;
        this.titulo = titulo;
    }

    public Pelicula() {
    }

    public Set<Actor> getActores() {
        return actores;
    }

    public void setActores(Set<Actor> actores) {
        this.actores = actores;
    }

    public Integer getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(Integer anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Set<Resenia> getResenias() {
        return resenias;
    }

    public void setResenias(Set<Resenia> resenias) {
        this.resenias = resenias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
