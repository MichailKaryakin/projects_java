package tasksStreams;

import java.util.stream.Stream;

import model.Student;
import model.StudentData;

/**
 * Практика 1
 * используя методы стрима выведи только имена студентов группы java1
 */
public class Task00 {
	public static void main(String[] args) {
		Stream<Student> stream = StudentData.getPersons();
		stream.filter(s -> s.getGroup().getName().equals("java1"))
				.forEach(s -> System.out.println(s.getName()));
	}
}
