package tasksStreams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

import model.Student;
import model.StudentData;

/**
 * Практика 6
 * с помошью stream APi выведи имя самого старого студента
 */
public class Task06 {
	public static void main(String[] args) {
		Stream<Student> stream = StudentData.getPersons();
		Optional<Student> elderly = stream.sorted(Comparator.comparingInt(Student::getAge))
				.reduce((first, second) -> second);
		elderly.ifPresent(student -> System.out.println(student.getName()));
	}
}
