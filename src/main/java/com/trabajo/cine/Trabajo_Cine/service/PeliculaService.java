package com.trabajo.cine.Trabajo_Cine.service;

import com.trabajo.cine.Trabajo_Cine.model.Pelicula;
import com.trabajo.cine.Trabajo_Cine.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService {
    @Autowired
    private PeliculaRepository peliculaRepository;

    public Pelicula crearPelicula(Pelicula pelicula) {
        return peliculaRepository.save(pelicula);
    }

    public Pelicula modificarPelicula(Long id, Pelicula pelicula)
    {
        return peliculaRepository.findById(id).map(existing -> {
            existing.setTitulo(pelicula.getTitulo());
            existing.setAnioEstreno(pelicula.getAnioEstreno());
            existing.setGenero(pelicula.getGenero());
            existing.setDuracion(pelicula.getDuracion());
            existing.
        })
    }

    public void eliminarPelicula(Long id)
    {
        peliculaRepository.deleteById(id);
    }
}
