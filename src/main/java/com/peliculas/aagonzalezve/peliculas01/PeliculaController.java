package com.peliculas.aagonzalezve.peliculas01;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1,  "Pulp Fiction",1994, "Quentin Tarantino", "Crimen", "Las vidas de varios criminales se entrelazan en una serie de incidentes macabros."));
        peliculas.add(new Pelicula(2, "The Matrix",1999,  "Lana y Lilly Wachowski", "Ciencia Ficción", "Un programador descubre que la realidad es una simulación y debe liberar la humanidad."));
        peliculas.add(new Pelicula(3, "Interstellar",2014,  "Christopher Nolan", "Drama / Ciencia Ficción", "Un grupo de exploradores viaja a través de un agujero de gusano para encontrar un nuevo hogar para la humanidad."));
        peliculas.add(new Pelicula(4, "El Viaje de Chihiro",2001,  "Hayao Miyazaki", "Animación / Fantasía", "Una niña queda atrapada en mundo mágico de dioses y espíritus, luchando por salvar a sus padres."));
        peliculas.add(new Pelicula(5, "El Padrino",1972,  "Francis Ford Coppola", "Drama / Mafia", "El patriarca de una poderosa dinastía del crimen transfiere el control de su imperio a su hijo renuente."));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }

    @GetMapping("/peliculas/{id}") 
    public Pelicula getPeliculaById(@PathVariable int id) {
        for (Pelicula pelicula : peliculas ) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
}
