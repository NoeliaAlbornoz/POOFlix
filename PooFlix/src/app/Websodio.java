package app;

public class Websodio extends Episodio{

    @Override
    public void reproducir() {

        System.out.println("Reproduciendo Websodio " + this.numero + " " + this.nombre);

    }
    
}