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
    int option = 0;

    while(exit.equals("yes")){
        System.out.println("---------- Music library ---------- \n"
                        + "---------------------------------------- \n"
                        + "1 - Create playlist \n" 
                        + "2 - Add song to playlist \n"
                        + "3 - Filter music by artist \n"
                        + "4 - Filter music by genre \n"
                        + "5 - Filter music by year \n"
                        + "6 - Sort by duration \n"
                        + "7 - Sort by year \n"
                        + "8 - Show playlist \n"
                        );
                        
        option = scanner.nextInt();
        String saltar = scanner.nextLine();
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
                saltar = scanner.nextLine();
                
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
                break;
            
            case 6:
                System.out.println("Sort by duration");
                break;

            case 7:
                System.out.println("Sort by year"); 
                break;

            case 8:
                System.out.println("show playlist");
                showPlaylist(playlist);

                break;
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
