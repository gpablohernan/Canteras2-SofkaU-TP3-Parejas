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
    public static void menu(){

    ArrayList<Song> playlist = new ArrayList<>();


    
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    String exit = "not";
    int option = 0;


    if(true){
        System.out.println("Hola");
    }

    while(exit.equals("not")){
        System.out.println("---------- Music library ---------- \n"
                        + "---------------------------------------- \n"
                        + "1 - Create playlist \n" 
                        + "2 - Filter music by genre \n"
                        + "3 - Filter music by year \n"
                        + "4 - Sort by duration \n"
                        + "5 - Sort by year \n"
                        );
                        
        option = scanner.nextInt();

        switch(option){
            case 1:
                System.out.println("Create playlist");
                break;

            case 2:
                System.out.println("Filter music by genre");
                break;

            case 3:
                System.out.println("Filter music by year");
                break;
            
            case 4:
                System.out.println("Sort by duration");
                break;

            case 5:
                System.out.println("Sort by year");
                break;

            case 6:
                System.out.println("Order music");
                break;
        }

        System.out.println("Do you want to continue in the application? [Yes/Not]");
        exit = scanner.next();
        exit = exit.toLowerCase();
    }


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
}
