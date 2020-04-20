package app;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    public int numero;
    public List<Episodio> episodios = new ArrayList<>();

    public Episodio getEpisodio(int numero) {

        for (Episodio epi : this.episodios) {
            if (epi.numero == numero) {
                return epi;
            }
        }
        return null;

    }

}