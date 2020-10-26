package ch.tbz.m226a.cinema;

import java.time.LocalDate;
import java.util.Date;

public class Movie {
    private String movieName = "";
    private String movieDate = null;
    private String movieTime = null;
    private String movieAudio = "";
    private String movieLocation = "";
    LocalDate localDate = LocalDate.parse(movieDate);

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

    public String getMovieLocation() {
        return movieLocation;
    }

    public void setMovieLocation(String movieLocation) {
        this.movieLocation = movieLocation;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Movie(String movieName, String movieDate, String movieTime, String movieAudio, String movieLocation) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieAudio = movieAudio;
        this.movieLocation = movieLocation;
    }
}