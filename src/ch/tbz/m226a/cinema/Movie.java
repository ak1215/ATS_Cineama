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

    public Movie(String movieName, String movieDate, String movieTime, String movieAudio, String movieLocation) {
        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.movieAudio = movieAudio;
        this.movieLocation = movieLocation;
    }
}
