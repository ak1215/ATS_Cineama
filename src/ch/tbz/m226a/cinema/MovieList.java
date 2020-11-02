package ch.tbz.m226a.cinema;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * This class is for a list of all the movie. We can add movies in a list of Movies.
 */
public class MovieList {
    ArrayList<Movie> listOfMovie = new ArrayList<>();

    public void addMovie() {
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "12:00", "German", Location.STADELHOFEN));
        listOfMovie.add(new Movie("BRAVE MÄDCHEN TUN DAS NICHT", "2020-07-12", "14:00", "Englisch", Location.WINTERTHUR));
        listOfMovie.add(new Movie("DIE SCHÖNSTEN JAHRE MEINES LEBENS", "2020-11-11", "18:00", "Englisch", Location.DIETIKON));
        listOfMovie.add(new Movie("I STILL BELIEVE", "2020-09-20", "16:00", "Englisch", Location.WINTERTHUR));
        listOfMovie.add(new Movie("JEAN SEBREG - AGAINST ALL ENEMIES", "2020-01-01", "22:00", "Englisch", Location.STADELHOFEN));
        listOfMovie.add(new Movie("JUST MERCY", "2020-03-09", "12:00", "Englisch", Location.DIETIKON));
        listOfMovie.add(new Movie("I STILL BELIEVE", "2020-06-16", "18:00", "Englisch", Location.STADELHOFEN));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "16:00", "German", Location.STADELHOFEN));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "20:00", "German", Location.STADELHOFEN));
        listOfMovie.add(new Movie("AFTER TRUTH", "2020-04-06", "17:00", "German", Location.STADELHOFEN));

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

    public void showMovies() {

    }
}
