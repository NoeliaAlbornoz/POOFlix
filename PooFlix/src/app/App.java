package app;

public class App {
    public static void main(String[] args) throws Exception {

        PooFlix miPooflix = new PooFlix();

        System.out.println("Iniciando Catalogo");

        miPooflix.inicializarCatalogo();

        Serie bb = miPooflix.buscarSerie("Good Doctor");

        Temporada laMejorTemporada = bb.getTemporada(1);

        Episodio elTop;

        elTop = laMejorTemporada.getEpisodio(1);

        elTop.reproducir();

    }
}