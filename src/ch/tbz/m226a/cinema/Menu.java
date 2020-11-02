package ch.tbz.m226a.cinema;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This is the menu of this program. We have a user friendly menu with a list of option u could do/choose.
 */
public class Menu {
    private char chosenMenuOption;
    private char enumLocation;
    private char enumLanguage;
    private MovieList movieList = new MovieList();

    /**
     * This Method prints out the menu and you have the chance to choose what you wanna do.
     */
    public void menuOption() {
        System.out.println("What do you wanna do? \n" +
                "1. Show a list of all movies\n" +
                "2. Show location of the cinema\n" +
                "3. Book tickets\n" +
                "4. Exit\n");

        Scanner scan = new Scanner(System.in);
        int menuOption = scan.nextInt();

        switch (menuOption) {
            case 1:
                showCurrentMovies();
                break;
            case 2:
                showLocations();
                break;
            case 3:
                bookTicket();
                break;
            case 4:
                ;
        }
        scan.close();
    }

    /**
     * This Method prints out all of the current movies.
     */
    public void showCurrentMovies() {
        ArrayList<String> listWithDuplicateValues = new ArrayList<>();

        //add names of movies to separate list
        for (Movie nameOfMovie : movieList.listOfMovie) {
            listWithDuplicateValues.add(nameOfMovie.getMovieName());
        }

        //print out of distinct list:
        ArrayList<String> uniqueList = (ArrayList) listWithDuplicateValues.stream().distinct().collect(Collectors.toList());
        for (String s : uniqueList) {
            System.out.println(s);
        }

    }

    /**
     * This Method shows all of the location of ATS Cinema.
     */
    public void showLocations() {
        System.out.println("Our Locations: " + java.util.Arrays.asList(Location.values()));
    }

    /**
     * This Method is to book the Ticket for the Cinema. First  of all you have to choose the movie and than the date and you can book the movie theater.
     */
    public void bookTicket() {
        showCurrentMovies();
        System.out.println("Which Movie you wanna watch?");

        Scanner scanner = new Scanner(System.in);
        String selectedMovieName = scanner.nextLine();

        for (Movie selectedMovies:
             ) {

        }

    }

}
