package org.example;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        MovieLibrary movieLibrary = new MovieLibrary();
        Json json = new Json();
        json.readDataFromJSONFile();

        Scanner sc = new Scanner(System.in);
        System.out.println("---------------------------------- MOVIE LIBRARY ----------------------------------");
        System.out.println("1 - Enter two dates to display the names of movies released between these dates");
        System.out.println("2 - Display all information about a random movie");
        System.out.println("3 - Enter the full name of the actor to display the names of the movies he played");
        System.out.println("-----------------------------------------------------------------------------------");

        int option = sc.nextInt();


        switch (option) {
            case 1 -> {
                System.out.println("Enter dates:");
                int yearX = sc.nextInt();
                int yearY = sc.nextInt();
                movieLibrary.printMoviesTitle(movieLibrary.findMoviesReleasedBetweenXY(yearX, yearY));
            }
            case 2 -> movieLibrary.printRandomMovieInfo();
           //case 3 -> ;

        }

    }
}