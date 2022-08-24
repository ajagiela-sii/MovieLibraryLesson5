package org.example;

import java.util.List;
import java.util.Random;

public class RandomHelper {
    private static final Random random = new Random();

    public static <T> Object getRandomObject(List<T> objectList) {
        return objectList.get(random.nextInt(0, objectList.size()));
    }
}
