package tasksStreams;

import java.util.stream.Stream;

import model.SexType;
import model.Student;
import model.StudentData;

/**
 * Практика 2
 * с помошью stream APi выведи имена мужчин которые подлежат
 * призыву в армию для несения срочной службы (от 20 до 27 лет)
 * в алфавитном порядке
 */
public class Task01 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getPersons();
        stream.filter(s -> s.getAge() >= 20 && s.getAge() <= 27 && s.getSexType().equals(SexType.MALE))
                .map(Student::getName)
                .sorted()
                .forEach(System.out::println);
    }
}
