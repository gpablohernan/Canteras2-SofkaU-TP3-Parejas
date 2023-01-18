import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
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
 
    String exit = "yes";
    String input;
    
    while(exit.equals("yes")){
        do{
            System.out.println("---------- Music library ---------- \n"
                            + "---------------------------------------- \n"
                            + "1 - Create playlist \n" 
                            + "2 - Add song to playlist \n"
                            + "3 - Filter music by artist \n"
                            + "4 - Filter music by genre \n"
                            + "5 - Filter music by year \n"
                            + "6 - Order by length ascending \n"
                            + "7 - Order by length descending \n"
                            + "8 - Order by year ascending \n"
                            + "9 - Order by year descending \n"
                            + "10 - Show playlist \n"
                            );
                            
            input = scanner.nextLine();

        }while(!Validators.isInteger(input));

        while(!Validators.optionRange(input)){
            System.out.println("Ingrese opciones del 1 - 10");
            input = scanner.nextLine();
        }

        int option = Integer.parseInt(input);

        Song song = new Song();
                
        switch(option){
            case 1:
                System.out.println("Create playlist");

                File file = new File("song.txt");

                try{
                Scanner read = new Scanner(file);
                    while(read.hasNextLine()){
                        String [] parseData = new String[6];
                        String data = read.nextLine();

                        parseData = data.split("::");
            
                        song = new Song(parseData[0],parseData[1],Integer.parseInt(parseData[2]),
                                    LocalDate.parse(parseData[3], DateTimeFormatter.ISO_LOCAL_DATE),
                                    Integer.parseInt(parseData[4]), parseData[5],parseData[6],
                                    parseData[7]);
            
                        playlist.add(song);
                    }

                    read.close();

                }catch(FileNotFoundException e){
                    System.out.println("File not found exception " + e);
                }

                break;

                
            case 2:
                System.out.println("---------- Enter song data ---------- \n"
                + "Artist" ); 
                String artist = scanner.nextLine();
                
                System.out.println("Title");
                String title = scanner.nextLine();
                
                System.out.println("id");
                int id = scanner.nextInt();
                
                System.out.println("Date");
                LocalDate date = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ISO_LOCAL_DATE);
                
                System.out.println("Duration");
                int length = scanner.nextInt();
                String skipLine = scanner.nextLine();
                
                System.out.println("Genre");
                String genre = scanner.nextLine();
                
                System.out.println("Cover");
                String cover = scanner.nextLine();
                
                System.out.println("shortDescription");
                String shortDescription = scanner.nextLine();
                
                Song AddSong = new Song(artist, title, id, date, length, genre, cover, shortDescription);
                
                playlist.add(AddSong);
                
                break;    
                
            case 3:
                System.out.println("Filter music by artist");
                song.filterByArtist(playlist);
                break;

            case 4:
                System.out.println("Filter music by genre");
                song.filterByGenre(playlist);
                break;

            case 5:
                System.out.println("Filter music by year");
                song.filterByYear(playlist);
                break;
            
            case 6:
                System.out.println("Order by length ascending");
                Collections.sort(playlist, Comparators.orderByLengthAsc);
                showPlaylist(playlist);
                Collections.sort(playlist, Comparators.orderById);
                
                break;
                
            case 7:
                System.out.println("Order by length descending");
                Collections.sort(playlist, Comparators.orderByLengthDesc);
                showPlaylist(playlist);
                Collections.sort(playlist, Comparators.orderById);
                break;

            case 8:
                System.out.println("Order by year ascending");
                Collections.sort(playlist, Comparators.orderByDateAsc);
                showPlaylist(playlist);
                Collections.sort(playlist, Comparators.orderById);
                break;

            case 9:
                System.out.println("Order by year descending");
                Collections.sort(playlist, Comparators.orderByDateDesc);
                showPlaylist(playlist);
                Collections.sort(playlist, Comparators.orderById);
                break;
            
            case 10:
                System.out.println("Show playlist");
                showPlaylist(playlist);
        }

        System.out.println("Do you want to continue in the application? [Yes/Not]");
        exit = scanner.next();
        exit = exit.toLowerCase();
    }
}
    public static void showPlaylist(ArrayList<Song> playlist){
        for (int i = 0; i < playlist.size(); i++){
            System.out.println("-------- Music library --------\n"
                        + "Artist :" + playlist.get(i).getArtist() + "\n"
                        + "Title :" + playlist.get(i).getTitle() + "\n" 
                        + "Id :" + playlist.get(i).getId() + "\n"
                        + "Date :" + playlist.get(i).getDate() + "\n"
                        + "Length :" + playlist.get(i).getLength() + "\n"
                        + "Genre :" + playlist.get(i).getGenre() + "\n"
                        + "Cover :" + playlist.get(i).getCover() + "\n"
                        + "shortDescription :" + playlist.get(i).getShortDescription() + "\n"
                        );
        }

    }
}
