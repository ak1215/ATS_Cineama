package ch.tbz.m226a.cinema;

import ch.tbz.m226a.payment.Payment;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * This is the menu of this program. We have a user friendly menu with a list of option u could do/choose.
 */
public class Menu {

    private MovieList movieList = new MovieList();
    private Payment payment = new Payment();

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

        int menuOption = 0;
        try {
            menuOption = scan.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Not an integer, please try again");
        }

        switch (menuOption) {
            case 1:
                showCurrentMovies();
                menuOption();
                break;
            case 2:
                showLocations();
                menuOption();
                break;
            case 3:
                bookTicket();
                break;
            case 4:
                return;
        }
        scan.close();
    }

    /**
     * This Method prints out all of the current movies.
     */
    public void showCurrentMovies() {
        movieList.addMovie();
        ArrayList<String> listWithDuplicateValues = new ArrayList<>();

        //add names of movies to separate list
        for (Movie nameOfMovie : movieList.getListOfMovie()) {
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

        for (Movie selectedMovies : movieList.listOfMovie) {
            if (selectedMovies.getMovieName().equals(selectedMovieName)) {
                System.out.println(selectedMovies.getMovieName() + "|" + selectedMovies.getMovieDate() +
                        "|" + selectedMovies.getMovieTime() + "|" + selectedMovies.getMovieAudio() + "|" +
                        selectedMovies.getMovieLocation() + "|" + selectedMovies.getMoviePrice());
            }

        }
        System.out.println("Which date you wanna choose?");
        String bookedMovieDate = scanner.nextLine();

        System.out.println("Which time you wanna choose?");
        String bookedMovieTime = scanner.nextLine();

        for (Movie bookedMovieToPay : movieList.listOfMovie) {
            if (bookedMovieToPay.getMovieTime().equals(bookedMovieTime)&&bookedMovieToPay.getMovieName().equals(selectedMovieName)&&bookedMovieToPay.getMovieDate().equals(bookedMovieDate)) {
                System.out.println("You have booked the movie " + bookedMovieToPay.getMovieName() + " it costs " + bookedMovieToPay.getMoviePrice());
            }
        }
        payment.chosePaymentMethod();
    }

}
