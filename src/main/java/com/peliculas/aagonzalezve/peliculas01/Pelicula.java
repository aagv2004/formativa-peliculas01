package com.peliculas.aagonzalezve.peliculas01;

public class Pelicula {
    // Para ser literal con la vista objetivo lo dejaré como año
    // pero debería ser anio, o algo sin ñ creo, no?

    private int id;
    private String titulo;
    private int año; // El dudoso...
    private String director;
    private String genero;
    private String sinopsis;

    public Pelicula(int id, int año, String titulo, String director, String genero, String sinopsis) {
        this.id = id;
        this.año = año;
        this.titulo = titulo;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public int getId() {
        return id;
    }

    public int getAnio() {
        return año;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getdir() {
        return director;
    }

    public String getGen() {
        return genero;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
