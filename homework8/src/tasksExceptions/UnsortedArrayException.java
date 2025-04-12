package tasksExceptions;

import java.io.IOException;

/**
 * Пробросить, если массив не отсортирован
 */
public class UnsortedArrayException extends IOException {
    public UnsortedArrayException(String message) {
        super(message);
    }
}
