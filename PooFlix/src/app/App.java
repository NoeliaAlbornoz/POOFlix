package app;

public class App {
    public static void main(String[] args) throws Exception {

        PooFlix miPooflix = new PooFlix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Good Doctor");

        Temporada laMejorTemporada = bb.getTemporada(2);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(10);

        elTop.reproducir();

        laMejorTemporada = bb.getTemporada(1);

        elTop = laMejorTemporada.getWebsodio(1); //WEBSODIO

        elTop.reproducir();

        bb = miPooflix.buscarSerie("Lucifer");

        laMejorTemporada = bb.getTemporada(1);

        elTop = laMejorTemporada.getEpisodio(2);

        elTop.reproducir();

        bb = miPooflix.buscarSerie("Breaking Bad");

        laMejorTemporada = bb.getTemporada(5);

        elTop = laMejorTemporada.getEpisodio(7);

        elTop.reproducir();

    }
}