package app.personas;

import java.util.List;

import app.INominable;

public class Actor extends Persona implements INominable {
 
    public Actor(String nombre, int edad){
        this.setNombre(nombre);
        this.setEdad(edad);
    }

    public boolean ganoPreviamente(){
        //Logica del metodo
        return true;

    }

    public void reproducirTrailerNominacion(){
        //Logica del metodo

        System.out.println("Reproduciendo el trailer de escenas de " + this.getNombre());
    }

    public void sacarSelfie(List<Actor> elenco){
        //Logica del metodo
    }

    @Override
    public boolean estaNominada() {
        // TODO Auto-generated method stub
        return false;
    }

    public void decirDiscurso() {

        System.out.println("Quiero agradecer a ....");

    }

}