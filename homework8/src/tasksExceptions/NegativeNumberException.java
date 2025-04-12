package tasksExceptions;

import java.io.IOException;

/**
 * Пробросить, если число отрицательное
 */
public class NegativeNumberException extends IOException {
	public NegativeNumberException(String message) {
		super(message);
	}
}
