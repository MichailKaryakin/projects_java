package tasksExceptions;

import java.io.IOException;
import java.util.Random;

/**
 * Данный к пятому заданию класс
 */
public class Runner {
    private static final Random rnd = new Random();

    public void halt() throws IOException {
        if (rnd.nextBoolean()) {
            throw new RuntimeException();
        } else {
            throw new IOException();
        }
    }
}
