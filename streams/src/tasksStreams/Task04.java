package tasksStreams;

import java.util.stream.Stream;

import model.SexType;
import model.Student;
import model.StudentData;

/**
 * Практика 4
 * с помошью stream APi Найти кол-во потенциально работоспособных
 * людей в выборке (т.е. от 18 лет и учитывая что женщины выходят на
 * пенсию в 55 лет, а мужчина в 60)
 */
public class Task04 {
    public static void main(String[] args) {
        Stream<Student> stream = StudentData.getPersons();
        long count = stream.filter(s -> s.getAge() >= 18)
                .filter(s -> {
                    if (s.getSexType().equals(SexType.FEMALE)) {
                        return s.getAge() < 55;
                    } else {
                        return s.getAge() < 60;
                    }
                }).count();
        System.out.println(count + 1);
    }
}
