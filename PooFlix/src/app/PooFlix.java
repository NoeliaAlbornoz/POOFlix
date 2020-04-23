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
            if (s.getNombre().equals(titulo)) {
                return s;
            }
        }
        return null;

    }

    public void inicializarBreakingBad() {

        Serie serie = new Serie("Breaking Bad", 2008, 8.00);
        //serie.setNombre("Breaking Bad");
        //serie.setAnio(2008); 
        //serie.setCalificacion(8.00); 

        this.series.add(serie);

        serie.setDescripcion("Sinopsis: ¿Qué harías si te enteraras de que te quedan pocos meses de vida, estuvieras a punto de tener un hijo y tuvieras deudas sin solventar? Ante esta situación, Walter White, un profesor de química, decide ponerse a fabricar metanfetamina en secreto para conseguir el máximo dinero posible en poco tiempo para dejárselo a su familia antes de morir.");

        Clasificacion clasificacion = new Clasificacion("PG- 13", 13, "Mayores de 13 años");
        //clasificacion.tipo = "PG- 13";
        //clasificacion.edadMinima = 13;
        //clasificacion.descripcion = "Mayores de 13 años";
        serie.setClasificacion(clasificacion); 

        Genero genero = new Genero("Drama", null);
        //genero.nombre = "Drama";
        serie.setGenero(genero);

        Actor actor = new Actor("Bryan Cranston", 64);
        //actor.setNombre("Bryan Cranston"); 
        //actor.setEdad(64); 
        serie.getElenco().add(actor);

        actor = new Actor("Aaron Paul", 40);
        //actor.setNombre("Aaron Paul"); 
        //actor.setEdad(40); 
        serie.getElenco().add(actor);

        Temporada temp = new Temporada(1);
        //temp.setNumero(1);
        serie.getTemporadas().add(temp);

        Episodio epi = new Episodio(1, "Pilot.", 58);
        // epi.numero = 1;
        // epi.nombre = "Pilot.";
        // epi.duracionEnMinutos = 58;
        epi.setDescripcion("Walter White, profesor de química en un instituto, descubre que tiene cáncer de pulmón y decide trabajar junto con un ex-alumno elaborando metanfetamina de alta calidad para poder ganar dinero para que su familia se mantenga."); 
        temp.getEpisodios().add(epi);

        epi = new Episodio(2, "Cat's in the bag.", 57);
        // epi.numero = 2;
        // epi.nombre = "Cat's in the bag.";
        // epi.duracionEnMinutos = 57;
        epi.setDescripcion("Walt y Jesse intentan deshacerse de los dos cuerpos en la caravana lo que se vuelve cada vez más complicado cuando uno de ellos, Krazy-8, se despierta.");
        temp.getEpisodios().add(epi);

        temp = new Temporada(5);
        //temp.setNumero(5);
        serie.getTemporadas().add(temp);

        epi = new Episodio(7, "Say my name.", 54);
        // epi.numero = 7;
        // epi.nombre = "Say my name.";
        // epi.duracionEnMinutos = 54;
        epi.setDescripcion("Walter asume un nuevo nivel de superioridad en su proyecto de negocios. Mike tiene que tratar con las consecuencias de sus actos.");
        temp.getEpisodios().add(epi);

    }

    public void inicializarLucifer() {

        Serie serie = new Serie("Lucifer", 2016, 7.00);
        //serie.nombre = "Lucifer";
        //serie.setNombre("Lucifer");
        //serie.setAnio(2016); 
        //serie.anio = 2016;
        //serie.setCalificacion(7.00); 
        //serie.calificacion = 7.00;

        this.series.add(serie);

        Clasificacion clasificacion = new Clasificacion("PG- 13", 13, "Mayores de 13 años");
        //clasificacion.tipo = "PG- 13";
        //clasificacion.edadMinima = 13;
        //clasificacion.descripcion = "Mayores de 13 años";
        //serie.clasificacion = clasificacion;
        serie.setClasificacion(clasificacion);

        Genero genero = new Genero("Misterio", null);
        //genero.nombre = "Misterio";
        serie.setGenero(genero);
        //serie.genero = genero;

        serie.setDescripcion("Sinopsis: Harto del infierno, Lucifer abandona su trono en el averno y se marcha a Los Ángeles, donde empieza a trabajar como detective de homicidios.");
        //serie.descripcion = "Sinopsis: Harto del infierno, Lucifer abandona su trono en el averno y se marcha a Los Ángeles, donde empieza a trabajar como detective de homicidios.";

        Actor actor = new Actor("Tom Ellis", 41);
        //actor.nombre = "Tom Ellis";
        //actor.edad = 41;
        serie.getElenco().add(actor);

        actor = new Actor("Lauren German", 41);
        //actor.nombre = "Lauren German";
        //actor.edad = 41;
        serie.getElenco().add(actor);

        Temporada temp = new Temporada(1);
        //temp.numero = 1;
        serie.getTemporadas().add(temp);

        Episodio epi = new Episodio(1, "Pilot.", 58);
        // epi.numero = 1;
        // epi.nombre = "Pilot.";
        // epi.duracionEnMinutos = 58;
        epi.setDescripcion("Lucifer Morningstar, el gobernante retirado del infierno, utiliza sus poderes de persuasión para ayudar a la detective Chloe Decker a detener al verdadero culpable de un asesinato.");
        temp.getEpisodios().add(epi);

        epi = new Episodio(2, "Lucifer, Stay. Good Devil.", 56);
        // epi.numero = 2;
        // epi.nombre = "Lucifer, Stay. Good Devil.";
        // epi.duracionEnMinutos = 56;
        epi.setDescripcion("Lucifer y Chloe vuelven a trabajar juntos para resolver un homicidio, esta vez el del hijo de una estrella de cine que fue asesinado por un paparazzi​ excesivo que frecuentemente creaba situaciones volátiles para obtener la «primera primicia» de la historia.");
        temp.getEpisodios().add(epi);

        epi = new Episodio(3, "The Would-Be Prince of Darkness.", 62);
        // epi.numero = 3;
        // epi.nombre = "The Would-Be Prince of Darkness.";
        // epi.duracionEnMinutos = 62;
        epi.setDescripcion("Cuando una estrella de fútbol a quien Lucifer convenció de perder su virginidad es arrestada por el asesinato de la chica con la que tuvo relaciones sexuales, Lucifer trabaja para demostrar su inocencia."); 
        temp.getEpisodios().add(epi);

    }

    public void inicializarGoodDoctor() {

        Serie serie = new Serie("Good Doctor", 2017, 9.00);
        this.series.add(serie);

        Clasificacion clasificacion = new Clasificacion("PG- 13", 13, "Mayores de 13 años");
        serie.setClasificacion(clasificacion); 

        Genero genero = new Genero("Drama médico", null);
        serie.setGenero(genero);

        serie.setDescripcion("Sinopsis: Un cirujano joven y autista que padece el síndrome del sabio empieza a trabajar en un hospital prestigioso. Allá tendrá que vencer el escepticismo con el que sus colegas lo reciben."); 

        Actor actor = new Actor("Freddie Highmore", 28);
        serie.getElenco().add(actor);

        actor = new Actor("Antonia Thomas", 33);
        serie.getElenco().add(actor);

        Temporada temp = new Temporada(1);
        serie.getTemporadas().add(temp);

        Episodio epi = new Episodio(1, "Burnt Food.", 42);
        epi.setDescripcion("La junta de directores del Hospital San José St. Bonaventure debe decidir si permite la contratación de un joven médico con síndrome de Savant y autismo entre su personal quirúrgico."); 
        temp.getEpisodios().add(epi);

        epi = new Episodio(2, "Mount Rushmore.", 45);
        epi.setDescripcion("La atención a los detalles del doctor Murphy complica su primer día en el Hospital St. Bonaventure. Mientras tanto, Claire aprende una valiosa lección sobre la honestidad.");
        temp.getEpisodios().add(epi);

        Websodio websodio = new Websodio(20, "Chilhood", 15, "http://websodio.com");
        // websodio.numero = 20;
        // websodio.nombre = "Chilhood";
        // websodio.duracionEnMinutos = 15;
        // websodio.url = "http://websodio.com";
        websodio.setDescripcion("Precuela. Shaun atraviesa una penosa niñez y sólo encuentra paz en la compañía de su hermano.");
        // temp.websodios.add(websodio);
        temp.getEpisodios().add(websodio);

        temp = new Temporada(2);
        serie.getTemporadas().add(temp);

        epi = new Episodio(10, "Quarantine.", 42);
        epi.setDescripcion("Cuando dos pacientes procedentes del mismo vuelo llegan al hospital con síntomas que empeoran rápidamente, el equipo médico tiene que poner en cuarentena la zona de urgencias antes de que el virus se extienda.");
        temp.getEpisodios().add(epi);

        temp = new Temporada(3);
        serie.getTemporadas().add(temp);

        epi = new Episodio(8, "Moonshot.", 40);
        epi.setDescripcion("La continua vacilación de Neil para correr riesgos lo hace enfrentarse con Audrey por el tratamiento de Wren, una joven que planea viajar a la luna y por lo tanto necesita ambos pulmones intactos; trabajando juntos, Audrey y Neil realizan con éxito la cirugía.");
        temp.getEpisodios().add(epi);

        epi = new Episodio(12, "Mutations.", 45);
        epi.setDescripcion("La Dra. Audrey Lim, el Dr. Shaun Murphy y la Dra. Morgan Reznick tratan a un corredor de 25 años que sufre de una severa hinchazón; pero cuando las cosas empeoran, el Dr. Shaun Murphy solicita la ayuda de la Dra. Carly Lever.");
        temp.getEpisodios().add(epi);

        websodio = new Websodio(4, "Claire's vocation", 12, "http://websodio.com");
        websodio.setDescripcion("Precuela. Una joven Claire descubre un libro de anatomía en la biblioteca de su abuelo, materia que le estaba prohibida estudiar.");
        temp.getEpisodios().add(websodio);
    }

}