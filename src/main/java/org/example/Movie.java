package org.example;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int year;
    private String genre;
    private Director director;
    private ArrayList<Actor> actors;

    public Movie() {
    }

    public Movie(String title, int date, String genre, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.year = date;
        this.director = director;
        this.genre = genre;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public Director getDirector() {
        return director;
    }

    public ArrayList<Actor> getActors() {
        return actors;
    }

    @Override
    public String toString() {
        return "Tittle: " + title + '\n' +
                "Genre: " + genre + '\n' +
                "Year: " + year + '\n' +
                "Director: " + director + '\n' +
                "Actors: " + actors.toString().replace("[", "").replace("]", "");
    }
}