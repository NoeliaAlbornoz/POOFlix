package app;

import java.util.ArrayList;
import java.util.List;

public class PooFlix {

    public List<Pelicula> peliculas = new ArrayList<>();
    public List<Serie> series = new ArrayList<>();

    public void inicializarCatalogo() {

        this.inicializarBreakingBad();
        this.inicializarLucifer();
        this.inicializarGoodDoctor();
    
    }

    public Serie buscarSerie(String titulo) {

        for (Serie s : this.series) {
            if (s.nombre.equals(titulo)) {
                return s;
            }
        }
        return null;

    }

    public void inicializarBreakingBad() {

        Serie serie1 = new Serie();
        serie1.nombre = "Breaking Bad";
        this.series.add(serie1);

        Temporada temp1 = new Temporada();
        temp1.numero = 1;
        serie1.temporadas.add(temp1);

        Episodio epi1 = new Episodio();
        epi1.numero = 1;
        epi1.nombre = "Pilot.";
        temp1.episodios.add(epi1);
        Episodio epi2 = new Episodio();
        epi2.numero = 2;
        epi2.nombre = "Cat's in the bag.";
        temp1.episodios.add(epi2);

        Temporada temp5 = new Temporada();
        temp5.numero = 5;
        serie1.temporadas.add(temp5);

        Episodio epi7 = new Episodio();
        epi7.numero = 7;
        epi7.nombre = "Say my name.";
        temp5.episodios.add(epi7);

    }

    public void inicializarLucifer() {

        Serie serie2 = new Serie();
        serie2.nombre = "Lucifer";
        this.series.add(serie2);

        Temporada temp1 = new Temporada();
        temp1.numero = 1;
        serie2.temporadas.add(temp1);

        Episodio epi1 = new Episodio();
        epi1.numero = 1;
        epi1.nombre = "Pilot.";
        temp1.episodios.add(epi1);
        Episodio epi2 = new Episodio();
        epi2.numero = 2;
        epi2.nombre = "Lucifer, Stay. Good Devil.";
        temp1.episodios.add(epi2);
        Episodio epi3 = new Episodio();
        epi3.numero = 3;
        epi3.nombre = "The Would-Be Prince of Darkness.";
        temp1.episodios.add(epi3);

    }

    public void inicializarGoodDoctor() {

        Serie serie3 = new Serie();
        serie3.nombre = "Good Doctor";
        this.series.add(serie3);

        Genero genero = new Genero();
        genero.nombre = "Drama";
        serie3.genero = genero;

        serie3.anio = 2017;

        serie3.calificacion = 8.00;

        serie3.descripcion = "Synopsis: In the pilot of this series, a hospital considers adding a young doctor named Shaun Murphy (Freddie Highmore), who happens to have autism and savant syndrome, to their surgical staff.";
        
        Clasificacion clasificacion = new Clasificacion();
        clasificacion.tipo = "PG- 13";
        clasificacion.edadMinima = 13;
        serie3.clasificacion = clasificacion;

        Temporada temp1 = new Temporada();
        temp1.numero = 1;
        serie3.temporadas.add(temp1);

        Episodio epi1 = new Episodio();
        epi1.numero = 1;
        epi1.nombre = "Burnt Food.";
        temp1.episodios.add(epi1);
        Episodio epi2 = new Episodio();
        epi2.numero = 2;
        epi2.nombre = "Mount Rushmore.";
        temp1.episodios.add(epi2);

        Temporada temp2 = new Temporada();
        temp2.numero = 2;
        serie3.temporadas.add(temp2);

        Episodio epi10 = new Episodio();
        epi10.numero = 10;
        epi10.nombre = "Quarantine.";
        temp2.episodios.add(epi10);

        Temporada temp3 = new Temporada();
        temp3.numero = 3;
        serie3.temporadas.add(temp3);

        Episodio epi8 = new Episodio();
        epi8.numero = 8;
        epi8.nombre = "Moonshot.";
        temp3.episodios.add(epi8);
        Episodio epi12 = new Episodio();
        epi12.numero = 12;
        epi12.nombre = "Mutations.";
        temp3.episodios.add(epi12);

        Actor actor1 = new Actor();
        actor1.nombre = "Freddie Highmore";
        serie3.elenco.add(actor1);

        Actor actor2 = new Actor();
        actor2.nombre = "Antonia Thomas";
        serie3.elenco.add(actor2);

    }

}