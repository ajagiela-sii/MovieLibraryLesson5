package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class MovieLibrary {
    private static ArrayList<Movie> listOfMovies = new ArrayList<>();
    private final Random random = new Random();

    public static void addMovieToLibrary(Movie movie) {
        listOfMovies.add(movie);
    }

    public void printRandomMovieInfo() {
        System.out.println(listOfMovies.get(random.nextInt(0, listOfMovies.size())));
    }

    public Set<Movie> findMoviesReleasedBetweenXY(int yearX, int yearY) {

        Set<Movie> movies = listOfMovies.stream()
                .filter(movie -> (movie.getDate() > yearX && movie.getDate() < yearY))
                .collect(Collectors.toSet());
        return movies;
    }

    public void printMoviesTitle(Set<Movie> moviesToPrinting) {
        for (Movie movie : moviesToPrinting) {
            System.out.println(movie.getTitle());
        }
    }
}
