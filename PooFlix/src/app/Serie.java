package app;

import java.util.ArrayList;
import java.util.List;

public class Serie extends Contenido {

    public Serie(String nombre, int anio, double calificacion){
        this.setNombre(nombre);
        this.setAnio(anio);
        this.setCalificacion(calificacion);
    }

    //Constructor que reutiliza el constructor de arriba (similar a como lo hace super)
    public Serie(String nombre, int anio, double calificacion, Genero genero){
        this(nombre, anio, calificacion); //Reutilizacion
        this.setGenero(genero);
    }

    private List<Temporada> temporadas = new ArrayList<>();

    public List<Temporada> getTemporadas(){
        return this.temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas){
        this.temporadas = temporadas;
    }

    public Temporada getTemporada(int numero) {
        // Recorrer cada temporada
        // Si el nro de temporada del ciclo es igual a nro
        // Devolver temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumero() == numero) {
                return tempo;

            }
        }
        return null;

    }

}