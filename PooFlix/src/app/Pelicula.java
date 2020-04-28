package app;

import java.util.List;

import app.personas.*; //Importa todo lo de ese paquete
//import app.personas.Actor;
//import app.personas.Director;

public class Pelicula extends Contenido implements INominable {

    public Pelicula(String nombre, int duracionEnMinutos) {
        this.setNombre(nombre);
        this.duracionEnMinutos = duracionEnMinutos;
    }

    private Director director;
    private int duracionEnMinutos;

    public Director getDirector() {
        return this.director;
    }

    public void setDirector() {
        this.director = director;
    }

    public int getDuracionEnMinutos() {
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    @Override
    public boolean ganoPreviamente() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public void reproducirTrailerNominacion() {
        // TODO Auto-generated method stub´

        System.out.println("Reproduciendo el trailer de película " + this.getNombre());

    }

    @Override
    public void sacarSelfie(List<Actor> elenco) {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

}