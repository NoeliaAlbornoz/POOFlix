package app;

public class Websodio extends Episodio {

    public String url;

    @Override // Anotacion que indica que el metodo se sobreescribe (redefinicion)
    public void reproducir() {

        System.out.println("Reproduciendo Websodio " + this.numero + " " + this.nombre + " url: " + this.url);

    }

}