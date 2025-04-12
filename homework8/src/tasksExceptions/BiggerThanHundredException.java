package tasksExceptions;

/**
 * Пробросить, если число больше ста
 */
public class BiggerThanHundredException extends RuntimeException {
    public BiggerThanHundredException(String message) {
        super(message);
    }
}
