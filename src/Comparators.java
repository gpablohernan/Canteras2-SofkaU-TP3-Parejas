import java.util.Comparator;

/**
 * Ordena la playlist, en este caso por duración o por fecha de las canciones
 * @author Rubén Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Comparators {
    /**
     * Ordena la playlist por duración de la canción
     */
    public static Comparator<Song> orderByLength = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getLength().compareTo(o2.getLength());
        }
    };
    /**
     * Ordena la playlist por fecha de la canción
     */
    public static Comparator<Song> orderByDate = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    };
}
