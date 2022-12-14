package org.example;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonHelper {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    public MovieLibrary readMoviesFromJSONFile(String fileName) throws URISyntaxException, IOException {
        MovieLibrary movieLibrary = new MovieLibrary();
        URL resource = Main.class.getClassLoader().getResource(fileName);
        assert resource != null;
        byte[] bytes = Files.readAllBytes(Paths.get(resource.toURI()));
        String json = new String(bytes);

        JsonNode node = objectMapper.readTree(json);

        if (node.isArray()) {
            for (JsonNode jsonNode : node) {
                Movie movie = objectMapper.treeToValue(jsonNode, Movie.class);
                movieLibrary.addMovieToLibrary(movie);
            }
        }
        return movieLibrary;
    }
}