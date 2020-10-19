package ch.tbz.m226a.cinema;

public class Menu {
    private char chosenMenuOption;
    private char enumLocation;
    private char enumLanguage;
    private MovieList movieList = new MovieList();


    public void menuOption(){
        System.out.println("What do you wanna do? " +
                "1. Show a list of all movies" +
                "2. Show location of the theater" +
                "3. Book tickets" +
                "4. Exit");


    }
    public void showCurrentMovies(){
        for (String nameOfMovie: movieList.listOfMovies
             ) {


        }
    }
    public void showLocations(){

    }
    public void bookTicket(){

    }

}
