package app;

public class App {
    public static void main(String[] args) throws Exception {

        PooFlix miPooflix = new PooFlix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Good Doctor");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

        elTop = laMejorTemporada.getEpisodio(20); //WEBSODIO

        elTop.reproducir();

        //Websodio web;
        //web = laMejorTemporada.getWebsodio(20);
        //web.reproducir();

        //Ejecucion en linea
        //laMejorTemporada.getWebsodio(1).reproducir();
        //System.out.println("Url: " + laMejorTemporada.getWebsodio(1).url);

    }
}