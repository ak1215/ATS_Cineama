package ch.tbz.m226a.cinema;

import java.util.Scanner;

public class Menu {
    private char chosenMenuOption;
    private char enumLocation;
    private char enumLanguage;
    private MovieList movieList = new MovieList();


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
    }

    public void showCurrentMovies() {
        int i = 1;
        movieList.addMovie();
        for (Movie nameOfMovie : movieList.listOfMovie) {
            String nameOfTheCurrentMovie = nameOfMovie.getMovieName();
            System.out.println(i++ +"." + nameOfTheCurrentMovie);
        }
    }

    public void showLocations() {
        System.out.println("Our Locations: " + java.util.Arrays.asList(Location.values()));
    }
    public void bookTicket() {
        showCurrentMovies();
        System.out.println("What is the number of the movie you want to watch?");

    }

}
