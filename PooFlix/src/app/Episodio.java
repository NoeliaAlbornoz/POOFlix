package app;

public class Episodio {

    public String nombre;
    public int numero;
    public String descripcion;
    public int duracionEnMinutos;

    public void reproducir() {

        System.out.println("Reproduciendo Episodio " + this.numero + " " + this.nombre);

    }
}