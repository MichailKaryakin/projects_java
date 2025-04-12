package tasksStreams;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import model.SexType;
import model.Student;
import model.StudentData;

/**
 * Практика 3
 * с помошью stream APi найди средний возраст всех мужчин группы java 2
 */
public class Task03 {
	public static void main(String[] args) {
		Stream<Student> stream = StudentData.getPersons();
		OptionalDouble average = stream.filter(s -> s.getGroup().getName().equals("java2"))
				.filter(s -> s.getSexType().equals(SexType.MALE))
				.flatMapToInt(s -> IntStream.of(s.getAge()))
				.average();
		average.ifPresent(System.out::println);
	}
}
