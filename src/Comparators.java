import java.util.Comparator;

/**
 * Ordena la playlist, en este caso por duración o por fecha de las canciones
 * @author Ruben Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Comparators {
    /**
     * Ordena la playlist de manera ascendente por duración de la canción
     */
    public static Comparator<Song> orderByLengthAsc = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getLength().compareTo(o2.getLength());
        }
    };



    /**
     * Ordena la playlist de manera descendente por duración de la canción
     */
    public static Comparator<Song> orderByLengthDesc = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o2.getLength().compareTo(o1.getLength());
        }
    };
    /**
     * Ordena la playlist de manera ascendente por fecha de la canción
     */
    public static Comparator<Song> orderByDateAsc = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getDate().compareTo(o2.getDate());
        }
    };

    /**
     * Ordena la playlist de manera descendente por fecha de la canción
     */
    public static Comparator<Song> orderByDateDesc = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o2.getDate().compareTo(o1.getDate());
        }
    };

    /**
     * Ordena la playlist por id de la canción, es decir como estaba inicialmente
     */
    public static Comparator<Song> orderById = new Comparator<Song>() {
        @Override
        public int compare(Song o1, Song o2) {
            return o1.getId().compareTo(o2.getId());
        }
    };
}
