package ch.tbz.m226a.cinema;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * This class is for a list of all the movie. We can add movies in a list of Movies.
 */
public class MovieList {
    ArrayList<Movie> listOfMovie = new ArrayList<>();

    /**
     * A Method to add all the movies in out cinema
     */
    public void addMovie() {
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "12:00", "German", Location.STADELHOFEN, 16.0));
        listOfMovie.add(new Movie("BRAVE MÄDCHEN TUN DAS NICHT", "2020-07-12", "14:00", "Englisch", Location.WINTERTHUR, 18.0));
        listOfMovie.add(new Movie("DIE SCHÖNSTEN JAHRE MEINES LEBENS", "2020-11-11", "18:00", "Englisch", Location.DIETIKON, 18.00));
        listOfMovie.add(new Movie("I STILL BELIEVE", "2020-09-20", "16:00", "Englisch", Location.WINTERTHUR, 15.90));
        listOfMovie.add(new Movie("JEAN SEBREG - AGAINST ALL ENEMIES", "2020-01-01", "22:00", "Englisch", Location.STADELHOFEN, 17.50));
        listOfMovie.add(new Movie("JUST MERCY", "2020-03-09", "12:00", "Englisch", Location.DIETIKON, 15.90));
        listOfMovie.add(new Movie("I STILL BELIEVE", "2020-06-16", "18:00", "Englisch", Location.STADELHOFEN, 15.90));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "16:00", "German", Location.STADELHOFEN,16.0));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "20:00", "German", Location.STADELHOFEN, 16.0));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "17:00", "German", Location.STADELHOFEN,16.0));

    }

    /**
     * This is the getter and Setter of ListofMovies
     * @return
     */
    public ArrayList<Movie> getListOfMovie() {
        return listOfMovie;
    }

    public void setListOfMovie(ArrayList<Movie> listOfMovie) {
        this.listOfMovie = listOfMovie;
    }

}
