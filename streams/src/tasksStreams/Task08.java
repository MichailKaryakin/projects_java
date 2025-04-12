package tasksStreams;

import model.Phone;

import java.util.Comparator;

/**
 * Практика 8
 * исправь пример, чтобы телефоны выводились отсортироваными по
 * цене и стоимость телефонов не привышала 10 тыс гр.
 */
public class Task08 {
	public static void main(String[] args) {
		Phone.getPhones()
				.sorted(Comparator.comparing(Phone::getPrice))
				.forEach(phone -> {
					if (phone.getPrice() <= 10000) {
						System.out.println(phone);
					}
				});
	}
}
