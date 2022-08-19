package org.example;

import java.util.ArrayList;
import java.util.Random;
import java.util.Set;
import java.util.function.Predicate;
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
        return listOfMovies.stream()
                .filter(movie -> (movie.getYear() > yearX && movie.getYear() < yearY))
                .collect(Collectors.toSet());
    }

    public void printMoviesName(Set<Movie> moviesToPrinting) {
        if (!moviesToPrinting.isEmpty()) {
            for (Movie movie : moviesToPrinting) {
                System.out.println(movie.getName());
            }
        } else {
            System.out.println("No movies to display");
        }
    }

    public Set<Movie> findMoviesWithActor(String firstName, String lastName) {
        Predicate<Actor> actorActInMovie = actor -> (actor.firstName().equals(firstName) && actor.lastName().equals(lastName));
        return listOfMovies.stream()
                .filter(movie -> movie.getActors().stream().anyMatch(actorActInMovie))
                .collect(Collectors.toSet());
    }
}
