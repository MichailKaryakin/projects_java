package tasksStreams;

import java.util.stream.Stream;

import model.Student;
import model.StudentData;

/**
 * Практика
 * с помошью stream APi для каждой группы выведи число студентов
 * младше 33 лет
 */
public class Task02 {
	public static void main(String[] args) {
		Stream<Student> stream = StudentData.getPersons();
		System.out.println(stream.filter(s -> s.getAge() < 33)
				.filter(s -> s.getGroup().getName().equals("java1"))
				.count() + 1);

		stream = StudentData.getPersons();

		System.out.println(stream.filter(s -> s.getAge() < 33)
				.filter(s -> s.getGroup().getName().equals("java2"))
				.count() + 1);
	}
}
