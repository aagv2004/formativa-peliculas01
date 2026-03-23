package com.peliculas.aagonzalezve.peliculas01;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
public class PeliculaController {
    private List<Pelicula> peliculas = new ArrayList<>();

    public PeliculaController() {
        peliculas.add(new Pelicula(1, 1994, "Pulp Fiction", "Quentin Tarantino", "Crimen", "Las vidas de varios criminales se entrelazan en una serie de incidentes macabros."));
        peliculas.add(new Pelicula(2, 1999, "The Matrix", "Lana y Lilly Wachowski", "Ciencia Ficción", "Un programador descubre que la realidad es una simulación y debe liberar la humanidad."));
        peliculas.add(new Pelicula(3, 2014, "Interstellar", "Christopher Nolan", "Drama / Ciencia Ficción", "Un grupo de exploradores viaja a través de un agujero de gusano para encontrar un nuevo hogar para la humanidad."));
        peliculas.add(new Pelicula(4, 2001, "El Viaje de Chihiro", "Hayao Miyazaki", "Animación / Fantasía", "Una niña queda atrapada en mundo mágico de dioses y espíritus, luchando por salvar a sus padres."));
        peliculas.add(new Pelicula(5, 1972, "El Padrino", "Francis Ford Coppola", "Drama / Mafia", "El patriarca de una poderosa dinastía del crimen transfiere el control de su imperio a su hijo renuente."));
    }

    @GetMapping("/peliculas")
    public List<Pelicula> getPeliculas() {
        return peliculas;
    }
}
