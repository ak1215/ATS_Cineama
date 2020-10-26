package ch.tbz.m226a.cinema;

import java.time.LocalDate;

public class Movie {
    private String movieName = "";
    private String movieDate = "";
    private String movieTime = "";
    private String movieAudio = "";
    private Location movieLocation = null;
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



    public Movie(String movieName, String movieDate, String movieTime, String movieAudio, Location movieLocation) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieAudio = movieAudio;
        this.movieLocation = movieLocation;
        LocalDate.parse(movieDate);
    }
}