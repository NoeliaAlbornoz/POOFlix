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
        epi.duracionEnMinutos = 58;
        epi.descripcion = "Walter White, profesor de química en un instituto, descubre que tiene cáncer de pulmón y decide trabajar junto con un ex-alumno elaborando metanfetamina de alta calidad para poder ganar dinero para que su familia se mantenga.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Cat's in the bag.";
        epi.duracionEnMinutos = 57;
        epi.descripcion = "Walt y Jesse intentan deshacerse de los dos cuerpos en la caravana lo que se vuelve cada vez más complicado cuando uno de ellos, Krazy-8, se despierta.";
        temp.episodios.add(epi);

        temp = new Temporada();
        temp.numero = 5;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 7;
        epi.nombre = "Say my name.";
        epi.duracionEnMinutos = 54;
        epi.descripcion = "Walter asume un nuevo nivel de superioridad en su proyecto de negocios. Mike tiene que tratar con las consecuencias de sus actos.";
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
        epi.duracionEnMinutos = 58;
        epi.descripcion = "Lucifer Morningstar, el gobernante retirado del infierno, utiliza sus poderes de persuasión para ayudar a la detective Chloe Decker a detener al verdadero culpable de un asesinato.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 2;
        epi.nombre = "Lucifer, Stay. Good Devil.";
        epi.duracionEnMinutos = 56;
        epi.descripcion = "Lucifer y Chloe vuelven a trabajar juntos para resolver un homicidio, esta vez el del hijo de una estrella de cine que fue asesinado por un paparazzi​ excesivo que frecuentemente creaba situaciones volátiles para obtener la «primera primicia» de la historia.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 3;
        epi.nombre = "The Would-Be Prince of Darkness.";
        epi.duracionEnMinutos = 62;
        epi.descripcion = "Cuando una estrella de fútbol a quien Lucifer convenció de perder su virginidad es arrestada por el asesinato de la chica con la que tuvo relaciones sexuales, Lucifer trabaja para demostrar su inocencia.";
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
        epi.duracionEnMinutos = 42;
        epi.descripcion = "La junta de directores del Hospital San José St. Bonaventure debe decidir si permite la contratación de un joven médico con síndrome de Savant y autismo entre su personal quirúrgico.";
        temp.episodios.add(epi);

        epi = new Episodio(); 
        epi.numero = 2;
        epi.nombre = "Mount Rushmore.";
        epi.duracionEnMinutos = 45;
        epi.descripcion = "La atención a los detalles del doctor Murphy complica su primer día en el Hospital St. Bonaventure. Mientras tanto, Claire aprende una valiosa lección sobre la honestidad.";
        temp.episodios.add(epi);

        Websodio websodio = new Websodio();
        websodio.numero = 1;
        websodio.nombre = "Chilhood";
        websodio.duracionEnMinutos = 15;
        websodio.descripcion = "Precuela. Shaun atraviesa una penosa niñez y sólo encuentra paz en la compañía de su hermano.";
        temp.websodios.add(websodio);

        temp = new Temporada();
        temp.numero = 2;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 10;
        epi.nombre = "Quarantine.";
        epi.duracionEnMinutos = 42;
        epi.descripcion = "Cuando dos pacientes procedentes del mismo vuelo llegan al hospital con síntomas que empeoran rápidamente, el equipo médico tiene que poner en cuarentena la zona de urgencias antes de que el virus se extienda.";
        temp.episodios.add(epi);

        temp = new Temporada();
        temp.numero = 3;
        serie.temporadas.add(temp);

        epi = new Episodio();
        epi.numero = 8;
        epi.nombre = "Moonshot.";
        epi.duracionEnMinutos = 40;
        epi.descripcion = "La continua vacilación de Neil para correr riesgos lo hace enfrentarse con Audrey por el tratamiento de Wren, una joven que planea viajar a la luna y por lo tanto necesita ambos pulmones intactos; trabajando juntos, Audrey y Neil realizan con éxito la cirugía.";
        temp.episodios.add(epi);

        epi = new Episodio();
        epi.numero = 12;
        epi.nombre = "Mutations.";
        epi.duracionEnMinutos = 45;
        epi.descripcion = "La Dra. Audrey Lim, el Dr. Shaun Murphy y la Dra. Morgan Reznick tratan a un corredor de 25 años que sufre de una severa hinchazón; pero cuando las cosas empeoran, el Dr. Shaun Murphy solicita la ayuda de la Dra. Carly Lever.";
        temp.episodios.add(epi);

        websodio = new Websodio();
        websodio.numero = 4;
        websodio.nombre = "Claire's vocation";
        websodio.duracionEnMinutos = 12;
        websodio.descripcion = "Precuela. Una joven Claire descubre un libro de anatomía en la biblioteca de su abuelo, materia que le estaba prohibida estudiar.";
        temp.websodios.add(websodio);

    }

}