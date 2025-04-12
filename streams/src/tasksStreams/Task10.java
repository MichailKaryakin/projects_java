package tasksStreams;

import model.Phone;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Практика 10
 * исправь пример, чтобы он выводил название трех фирм, у которых
 * самый большой модельный ряд. Фирмы должны быть отсортированы по
 * количеству моделей.
 */
public class Task10 {
	public static void main(String[] args) {
		Map<String, List<Phone>> byProducer = Phone.getPhones()
				.collect(Collectors.groupingBy(Phone::getProducer));

		byProducer.entrySet()
				.stream()
				.sorted(Comparator.comparingInt(e -> e.getValue().size()))
				.toList()
				.reversed()
				.stream()
				.limit(3)
				.map(Map.Entry::getKey)
				.forEach(System.out::println);
	}
}
