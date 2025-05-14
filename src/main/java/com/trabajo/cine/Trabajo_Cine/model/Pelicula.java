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
}
