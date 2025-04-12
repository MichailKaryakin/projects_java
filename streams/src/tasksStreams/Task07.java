package tasksStreams;

import java.util.stream.IntStream;

/**
 * Практика 7
 * Вывести таблицу умножения используя только stream API.
 */
public class Task07 {
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 10).forEach(n1 -> IntStream.rangeClosed(1, 10).forEach(n2 -> {
			System.out.println(n1 + " X " + n2 + " = " + (n1 * n2));
		}));
	}
}
