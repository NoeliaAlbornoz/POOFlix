package app;

import java.util.List;
import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);
    
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

        System.out.println("Empezando con Casteo");

        Episodio epiDemo;

        int posicion = 0;

        /// En base a un numero de posicion de episodio, obtenerlo de la lista
        System.out.println("Ingrese la posicion");

        posicion = Teclado.nextInt();

        epiDemo = laMejorTemporada.getEpisodioAtPosicion(posicion);

        epiDemo.reproducir();

        if(epiDemo instanceof Websodio){
            Websodio webi = (Websodio)epiDemo;
            webi.enviarAlertaDeQueEstaOnline();
        } else {
            System.out.println("No hay que hacer más nada");
        }


    }
}