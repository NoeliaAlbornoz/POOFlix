package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numero;
    public List<Episodio> episodios = new ArrayList<>();
    //public List<Websodio> websodios = new ArrayList<>();

    public Episodio getEpisodio(int numero) {

        for (Episodio epi : this.episodios) {
            if (epi.numero == numero) {
                return epi;
            }
        }
        return null;

    }

    /*public Websodio getWebsodio(int numero) {

        for (Websodio web : this.websodios) {
            if (web.numero == numero) {
                return web;
            }
        }
        return null;

    }*/

    /**
     * Obtiene un episodio en base a la posicion dentro del Arraylist. 
     * @param pos
     * @return
     */
    public Episodio getEpisodioAtPosicion(int pos){
        return this.episodios.get(pos);
    }

    public List<Websodio> obtenerWebsodios() {
        List<Websodio> lista = new ArrayList<>();
        for (Episodio epi : this.episodios) {
            if (epi instanceof Websodio)
                lista.add((Websodio) epi); // Casteo
        }
        return lista;
    }

    public int getCantidadEpisodios(){
        return this.episodios.size();
    }

}