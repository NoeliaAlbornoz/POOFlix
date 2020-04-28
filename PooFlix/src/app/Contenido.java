package app;

import java.util.ArrayList;
import java.util.List;

import app.personas.Actor;

public abstract class Contenido {

    private String nombre;
    private String descripcion;
    private int anio;
    private double calificacion;
    private Clasificacion clasificacion;
    private Genero genero;
    private List<Actor> elenco = new ArrayList<>(); // por defecto la lista esta vacia, no nula

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public Clasificacion getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Clasificacion clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Actor> getElenco() {
        return elenco;
    }

    public void setElenco(List<Actor> elenco) {
        this.elenco = elenco;
    }

}