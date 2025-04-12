package tasksStreams;

import model.Student;
import model.StudentData;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * Практика 5
 * с помошью stream APi отсортировать студентов сначал по полу, а
 * потом по возрасту
 */
public class Task05 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getPersons();
        stream.sorted(Comparator.comparing(Student::getSexType).thenComparing(Student::getAge))
                .forEach(System.out::println);
    }
}
