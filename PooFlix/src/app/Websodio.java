package app;

public class Websodio extends Episodio {

    public String url;

    @Override // Anotacion que indica que el metodo se sobreescribe (redefinicion)
    public void reproducir() {

        System.out.println("Reproduciendo Websodio " + this.numero + " " + this.nombre + " url: " + this.url);

    }

    /**
     * "envia" un mail de alerta cuando la serie este online. Este metodo NO esta en
     * EPISODIO.
     */
    public void enviarAlertaDeQueEstaOnline() {
        // mandaria un mail a los usuarios avisando que ya esta disponible para ver.
        System.out.println("Enviando mail con url " + this.url);
    }

}