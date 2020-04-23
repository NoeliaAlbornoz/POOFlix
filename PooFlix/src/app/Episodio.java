package app;

public class Episodio {

    // Constructor de 3 parametros
    // Acceso: public
    // Nombre de la clase q se quiere instanciar
    // Parametro pueden tener cualquier orden y nombre
    public Episodio(int numero, String nombre, int duracion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracion;
    }

    public String nombre;
    public int numero;
    public String descripcion;
    public int duracionEnMinutos;

    // Constructor por defecto - vacio (viene por defecto - no se ve), pero si creo
    // uno, debo crear a mano el vacio si lo necesito
    //public Episodio() {}

    //NOOOO hacer constructor para inicializar todas las variables
    /*public Episodio(int numero, String nombre, int duracion, String descripcion) {
        this.numero = numero;
        this.nombre = nombre;
        this.duracionEnMinutos = duracion;
        this.descripcion = descripcion;
    }*/

    /*No vale la pena
    public Episodio(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    No vale la pena
    public Episodio(String descripcion, int numero) {
        this.descripcion = descripcion;
        this.numero = numero;
    }*/

    public void reproducir() {

        System.out.println("Reproduciendo Episodio " + this.numero + " " + this.nombre);

    }
}