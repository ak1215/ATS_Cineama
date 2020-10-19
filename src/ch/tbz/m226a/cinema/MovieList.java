package ch.tbz.m226a.cinema;

import java.time.LocalDate;
import java.util.ArrayList;

public class MovieList {
    ArrayList<Movie> listOfMovie = new ArrayList<>();



    public void addMovie(){
        listOfMovie.add(new Movie("After Truth", "2020-07-06", "12:00", "German", "Zürich"));

    }
    public void showMovies(){

    }
}
