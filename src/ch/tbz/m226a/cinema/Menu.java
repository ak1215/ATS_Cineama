package ch.tbz.m226a.cinema;

import java.util.Scanner;

public class Menu {
    private char chosenMenuOption;
    private char enumLocation;
    private char enumLanguage;
    private MovieList movieList = new MovieList();


    public void menuOption() {
        System.out.println("What do you wanna do? " +
                "1. Show a list of all movies" +
                "2. Show location of the cinema" +
                "3. Book tickets" +
                "4. Exit");

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
        for (Movie nameOfMovie : movieList.listOfMovie) {

        }
    }

    public void showLocations() {

    }

    public void bookTicket() {

    }

}
