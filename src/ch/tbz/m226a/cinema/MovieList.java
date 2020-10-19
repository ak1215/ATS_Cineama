package ch.tbz.m226a.cinema;

import java.util.ArrayList;

public class MovieList {
    ArrayList<Movie> afterTruth = new ArrayList<>();
    ArrayList<Movie> braveMaedchentunDasNicht = new ArrayList<>();
    ArrayList<Movie> dieSchoenstenJahreMeinesLebens = new ArrayList<>();
    ArrayList<Movie> iStillBelieve = new ArrayList<>();
    ArrayList<Movie> jeanSerbegAgainstAllEnemies = new ArrayList<>();
    ArrayList<Movie> justMercy = new ArrayList<>();


    public void addMovie(){
        afterTruth.add("AFTER TRUTH");
        braveMaedchentunDasNicht.add("BRAVE MÄDCHEN TUN DAS NICHT");
        dieSchoenstenJahreMeinesLebens.add("DIE SCHÖNSTEN JAHRE MEINES LEBENS");
        iStillBelieve.add("I STILL BELIEVE");
        jeanSerbegAgainstAllEnemies.add("JEAN SEBREG - AGAINST ALL ENEMIES");
        justMercy.add("JUST MERCY");
    }

    public void showMovies(){

    }
}
