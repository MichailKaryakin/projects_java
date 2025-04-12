package tasksStreams;

import model.Phone;

import java.util.Comparator;

/**
 * Практика 11
 * выведи название моделей (без производителя) 5 самых дешевых
 * телефонов, отсортированных по возрастанию цены
 */
public class Task11 {
	public static void main(String[] args) {
		Phone.getPhones()
				.sorted(Comparator.comparing(Phone::getPrice)).limit(5)
				.forEach(phone -> System.out.println(phone.getModel()));
	}
}
