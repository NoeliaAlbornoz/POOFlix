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

    private String nombre;
    private int numero;
    private String descripcion;
    private int duracionEnMinutos;

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

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String getDescripcion(){
        return this.descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

    public int getDuracionEnMinutos(){
        return this.duracionEnMinutos;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos){
        this.duracionEnMinutos = duracionEnMinutos;
    }
    public void reproducir() {

        System.out.println("Reproduciendo Episodio " + this.numero + " " + this.nombre);

    }
}