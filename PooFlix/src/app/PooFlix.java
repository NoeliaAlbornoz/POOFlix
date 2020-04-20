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

        Serie serie = new Serie();

        this.series.add(serie);

        serie.nombre = "Breaking Bad";

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.tipo = "PG- 13";
        clasificacion.edadMinima = 13;
        clasificacion.descripcion = "Mayores de 13 años";
        serie.clasificacion = clasificacion;

        Genero genero = new Genero();
        genero.nombre = "Drama";
        serie.genero = genero;

        serie.anio = 2008;

        serie.descripcion = "Sinopsis: ¿Qué harías si te enteraras de que te quedan pocos meses de vida, estuvieras a punto de tener un hijo y tuvieras deudas sin solventar? Ante esta situación, Walter White, un profesor de química, decide ponerse a fabricar metanfetamina en secreto para conseguir el máximo dinero posible en poco tiempo para dejárselo a su familia antes de morir.";

        serie.calificacion = 8.00;

        Actor actor = new Actor();
        actor.nombre = "Bryan Cranston";
        actor.edad = 64;
        serie.elenco.add(actor);

        actor = new Actor();
        actor.nombre = "Aaron Paul";
        actor.edad = 40;
        serie.elenco.add(actor);
        
        Temporada temp = new Temporada();
        temp.numero = 1;
        serie.temporadas.add(temp);

        Episodio epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Pilot.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Cat's in the bag.";
        temp.episodios.add(epi);

        temp = new Temporada();
        temp.numero = 5;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 7;
        epi.nombre = "Say my name.";
        temp.episodios.add(epi);

    }

    public void inicializarLucifer() {

        Serie serie = new Serie();

        this.series.add(serie);

        serie.nombre = "Lucifer";

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.tipo = "PG- 13";
        clasificacion.edadMinima = 13;
        clasificacion.descripcion = "Mayores de 13 años";
        serie.clasificacion = clasificacion;

        Genero genero = new Genero();
        genero.nombre = "Misterio";
        serie.genero = genero;

        serie.anio = 2016;

        serie.descripcion = "Sinopsis: Harto del infierno, Lucifer abandona su trono en el averno y se marcha a Los Ángeles, donde empieza a trabajar como detective de homicidios.";

        serie.calificacion = 7.00;

        Actor actor = new Actor();
        actor.nombre = "Tom Ellis";
        actor.edad = 41;
        serie.elenco.add(actor);

        actor = new Actor();
        actor.nombre = "Lauren German";
        actor.edad = 41;
        serie.elenco.add(actor);
        
        Temporada temp = new Temporada();
        temp.numero = 1;
        serie.temporadas.add(temp);

        Episodio epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Pilot.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Lucifer, Stay. Good Devil.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 3;
        epi.nombre = "The Would-Be Prince of Darkness.";
        temp.episodios.add(epi);

    }

    public void inicializarGoodDoctor() {

        Serie serie = new Serie();

        this.series.add(serie);

        serie.nombre = "Good Doctor";

        Clasificacion clasificacion = new Clasificacion();
        clasificacion.tipo = "PG- 13";
        clasificacion.edadMinima = 13;
        clasificacion.descripcion = "Mayores de 13 años";
        serie.clasificacion = clasificacion;

        Genero genero = new Genero();
        genero.nombre = "Drama médico";
        serie.genero = genero;

        serie.anio = 2017;

        serie.descripcion = "Sinopsis: Un cirujano joven y autista que padece el síndrome del sabio empieza a trabajar en un hospital prestigioso. Allá tendrá que vencer el escepticismo con el que sus colegas lo reciben.";

        serie.calificacion = 9.00;

        Actor actor = new Actor();
        actor.nombre = "Freddie Highmore";
        actor.edad = 28;
        serie.elenco.add(actor);

        actor = new Actor();
        actor.nombre = "Antonia Thomas";
        actor.edad = 33;
        serie.elenco.add(actor);

        Temporada temp = new Temporada();
        temp.numero = 1;
        serie.temporadas.add(temp);

        Episodio epi = new Episodio();
        epi.numero = 1;
        epi.nombre = "Burnt Food.";
        temp.episodios.add(epi);

        epi = new Episodio(); 
        epi.numero = 2;
        epi.nombre = "Mount Rushmore.";
        temp.episodios.add(epi);

        temp = new Temporada();
        temp.numero = 2;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 10;
        epi.nombre = "Quarantine.";
        temp.episodios.add(epi);

        temp = new Temporada();
        temp.numero = 3;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 8;
        epi.nombre = "Moonshot.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 12;
        epi.nombre = "Mutations.";
        temp.episodios.add(epi);

    }

}