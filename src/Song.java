import java.time.LocalDate;
import java.util.ArrayList;

/**
 * Representa la clase canción que luego generará un playlist de canciones
 * @author Rubén Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Song {

    /**
     * Título de la canción
     */
    private String title;
    /**
     * Id de la canción
     */
    private  int id;
    /**
     * Fecha de la canción
     */
    private LocalDate date;
    /**
     * Duración de la canción expresada en segundos. En Integer para trabajar con el Comparator
     */
    private Integer length; // in seconds
    /**
     * Género de la canción
     */
    private String genre;
    /**
     * Carátula de la canción, por ejemplp carátula.jpg o .png
     */
    private String cover; // ex: cover1.jpg or .png
    /**
     * Descripción corta de la canción
     */
    private String shortDescription;

    /**
     * Genera una instancia de la clase Song sin parámetros
     */

    public Song() {
    }

    /**
     * Genera una instancia de la clase Song con parámetros
     */
    public Song(String title, int id, LocalDate date, int length, String genre, String cover, String shortDescription) {
        this.title = title;
        this.id = id;
        this.date = date;
        this.length = length;
        this.genre = genre;
        this.cover = cover;
        this.shortDescription = shortDescription;
    }

    /**
     * Getter, devuelve el título de la canción
     * @return el título de la canción
     */
    public String getTitle() {
        return title;
    }

    /**
     * Setter, setea el título de la canción del objeto Song con el título pasado por parámetro
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Getter, devuelve el id de la canción
     * @return el id de la canción
     */
    public int getId() {
        return id;
    }

    /**
     * Setter, setea el id de la canción del objeto Song con el id pasado por parámetro
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Getter, devuelve la fecha de la canción
     * @return la fecha de la canción
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * Setter, setea la fecha de la canción del objeto Song con la fecha pasada por parámetro
     * @param date
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * Getter, devuelve la duración de la canción
     * @return la duración de la canción
     */
    public int getLength() {
        return length;
    }

    /**
     * Setter, setea la duración de la canción del objeto Song con la duración pasada por parámetro
     * @param length
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * Getter, devuelve el género de la canción
     * @return el género de la canción
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Setter, setea el género de la canción del objeto Song con el género pasado por parámetro
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * Getter, devuelve la carátula de la canción
     * @return la carátula de la canción
     */
    public String getCover() {
        return cover;
    }

    /**
     * Setter, setea la carátula de la canción del objeto Song con la carátula pasada por parámetro
     * @param cover
     */
    public void setCover(String cover) {
        this.cover = cover;
    }

    /**
     * Getter, devuelve la descripción corta de la canción
     * @return la descripción corta de la canción
     */
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Setter, setea la descripción corta de la canción del objeto Song con la descripción corta pasada por parámetro
     * @param shortDescription
     */
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * ToStrig, devuelve los atributos de la canción cuando tengan que mostrarse
     * @return los atributos seleccionados de la canción
     */
    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", date=" + date +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                ", cover='" + cover + '\'' +
                ", shortDescription='" + shortDescription + '\'' +
                '}';
    }

    /**
     * Filtra las canciones de la playlist por género
     * @param playlist
     */
    public void filterByGenre(ArrayList<Song> playlist){
        // CUALQUIER COSA ME AVISAS
    }

    /**
     * Filtra las canciones de la playlist por año
     * @param playlist
     */
    public void filterByYear(ArrayList<Song> playlist){
        // CUALQUIER COSA ME AVISAS
    }
}