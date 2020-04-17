package app;

import java.util.ArrayList;
import java.util.List;

public class Contenido {

    public String nombre;
    public Clasificacion clasificacion;
    public Genero genero;
    public int anio;
    public String descripcion;
    public double calificacion;
    public List<Actor> elenco = new ArrayList<>(); // por defecto la lista esta vacia, no nula

}