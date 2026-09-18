package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public class Libro implements ILibro {
    private String titulo;
    private String autor;
    private List<String> anotaciones;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.anotaciones = new ArrayList<>();
    }

    private Libro(Libro prototipo) {
        this.titulo = prototipo.titulo;
        this.autor = prototipo.autor;
        this.anotaciones = new ArrayList<>(prototipo.anotaciones);
    }

    @Override
    public ILibro clonar() {
        return new Libro(this);
    }

    @Override
    public void agregarAnotacion(String nota) {
        this.anotaciones.add(nota);
    }
}