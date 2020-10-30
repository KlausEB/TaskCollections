package epam.student.task;

import GenreEnumTypes.*;
import Music.*;

import java.util.Arrays;
import java.util.List;

public class Runner
{
    static List<? extends Music> musicDisc = Arrays.asList(
            new OperaMusic("Rigoletto", "Giuseppe Verdi", "Orchestra del Teatro San Carlo di Napoli", 135, 1851, "F-moll", AccompanimentType.ORCHESTRA, OperaMusicTypes.LYRICAL_TRAGEDY, "Dmitri Hvorostovsky", "Desirée Rancatore", "Celso Albelo"),
            new ChoirMusic("Requiem, K.626", "Wolfgang Amadeus Mozart", "Orchestre national de France", 60, 1800, "D-moll", AccompanimentType.ORCHESTRA, ChoirMusicType.MESSA, ChoirCompositionType.MIXED, "James Gaffigan", SingingVoiceTypes.BARITONE),
            new OperaMusic("Barber of Seville", "Gioacchino Antonio Rossini", "The collective of the Moscow Academic Musical Theater", 185, 1816, "F-dur", AccompanimentType.ORCHESTRA, OperaMusicTypes.OPERA_BUFFA, "Dmitri Hvorostovsky"),
            new InstrumentalClassicalMusic("Beethoven's Symphony No. 9", "Ludwig van Beethoven", "Oslo Philharmonic", 74, 1824, "D-moll", InstrumentalClassicalMusicTypes.SYMPHONY),
            new JazzMusic("That's life", "Dean Key", "Frank Sinatra", 25, 1963, JazzMusicTypes.SWING),
            new RockMusic("One", "Metallica", "Metallica", 8, 1988, RockMusicTypes.TRASH_METAL, "James Hetfield", "…And Justice for All"),
            new SoloVocalClassicalMusic("to Molly", "Mikhail Ivanovich Glinka", "Dmitri Hvorostovsky", 4, 1833, "As-dur", AccompanimentType.PIANO, "Dmitri Hvorostovsky", SingingVoiceTypes.BARITONE, SoloVocalClassicalMusicType.ROMANSE),
            new InstrumentalClassicalMusic("Piano Sonata No. 32", "Ludwig van Beethoven", "Denis Matsuev", 27, 1822, "C-moll", InstrumentalClassicalMusicTypes.SONATA)
    );
    public static void main( String[] args ) {
        Disc disc = new Disc(musicDisc);
        System.out.println("Print original disc compositions: " + disc);
        System.out.println("Print the total duration of the compositions: " + disc.getTotalDurationInMinutes());
        disc.SortByMusicStyle();
        System.out.println("Print compositions by style sort: " + disc);
        System.out.println("Print compositions over a specified duration range: " + disc.getCompositionsInRangeOfDuration(100, 185));
    }
}
