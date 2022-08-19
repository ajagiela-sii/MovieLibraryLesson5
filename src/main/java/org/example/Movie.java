package org.example;

import java.util.ArrayList;

public class Movie {
    private String name;
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

    public void setName() {
        this.name = this.title + " " + this.year;
    }

    public String getName() {
        return name;
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
        return "tittle: " + title + '\n' +
                "genre: " + genre + '\n' +
                "year: " + year + '\n' +
                "director: " + director + '\n' +
                "actors: " + actors;
    }
}
