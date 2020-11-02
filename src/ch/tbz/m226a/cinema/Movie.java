package ch.tbz.m226a.cinema;

import java.time.LocalDate;

/**
 * In this class you can lout in some information of the movie in.
 */
public class Movie {
    private String movieName = "";
    private String movieDate = "";
    private String movieTime = "";
    private String movieAudio = "";
    private Location movieLocation = null;
    private double moviePrice = 0.0;
    private LocalDate localDate;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(String movieDate) {
        this.movieDate = movieDate;
    }

    public String getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(String movieTime) {
        this.movieTime = movieTime;
    }

    public String getMovieAudio() {
        return movieAudio;
    }

    public void setMovieAudio(String movieAudio) {
        this.movieAudio = movieAudio;
    }

    public Location getMovieLocation() {
        return movieLocation;
    }

    public double getMoviePrice() {
        return moviePrice;
    }

    /**
     * This is the Constructor of the  class Movie with all the information in it.
     * @param movieName
     * @param movieDate
     * @param movieTime
     * @param movieAudio
     * @param movieLocation
     */
    public Movie(String movieName, String movieDate, String movieTime, String movieAudio, Location movieLocation, double moviePrice) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieAudio = movieAudio;
        this.movieLocation = movieLocation;
        this.moviePrice = moviePrice;
        LocalDate.parse(movieDate);
    }
}