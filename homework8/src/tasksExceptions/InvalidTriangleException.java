package tasksExceptions;

import java.io.IOException;

/**
 * Пробросить, если треугольник с указанными сторонами не существует
 */
public class InvalidTriangleException extends IOException {
    public InvalidTriangleException(String message) {
        super(message);
    }
}
