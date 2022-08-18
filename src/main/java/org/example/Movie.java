package org.example;

import java.util.ArrayList;

public class Movie {
    private String title;
    private int date;
    private String genre;
    private Director director;
    private ArrayList<Actor> actors;

    public Movie() {
    }

    public Movie(String title, int date, String genre, Director director, ArrayList<Actor> actors) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.genre = genre;
        this.actors = actors;
    }

    public String getTitle() {
        return title;
    }

    public int getDate() {
        return date;
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
        return "tittle: " + title + '\n' +
                "director: " + director + '\n' +
                "genre: " + genre + '\n' +
                "date: " + date + '\n' +
                "actors: " + actors;
    }
}
