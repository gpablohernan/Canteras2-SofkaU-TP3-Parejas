import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Rubén Campos Reymundis - Pablo Hernán Gatti
 *
 */

public class Menu {

    ArrayList<Song> playlist = new ArrayList<>();

    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

/* EJEMPLO PARA QUE EL USUARIO INGRESE LA FECHA
    String day;
    String  month;
    String  year;
    String completeDate;
    LocalDate date;

    System.out.println("Indique la fecha de :\n(primero el día, ej: 05, luego el mes, ej: 09 y luego el año, ej: 2022)");
    day = scanner.next();
    month = scanner.next();
    anio = scanner.next();
    // EL ORDEN DE COMO EL USUARIO PONE LOS DATOS ES INDISTINTO, LO IMPORTANTE ES EL ORDEN EN "completeDate o el nombre que le quieras poner"
    completeDate = year + "-" + month + "-" + day;
    date = LocalDate.parse(completeDate, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);

*/
}
