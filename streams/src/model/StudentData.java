package model;

import static model.SexType.FEMALE;
import static model.SexType.MALE;

import java.util.stream.Stream;

public class StudentData {
	public static Stream<Student> getPersons() {
		
		Group group1 = new Group("java1");
		Group group2 = new Group("java2");
		PersonFactory<Student> factory = Student::new;
		return Stream.of(
				factory.create("Василий", 18, group1, MALE),
				factory.create("Петр", 25, group1, MALE),
				factory.create("Роман", 33, group2, MALE),
				factory.create("Дарья", 19, group2, FEMALE),
				factory.create("Анна", 24, group1, FEMALE),
				factory.create("Александр", 16, group2, MALE),
				factory.create("Федор", 52, group2, MALE),
				factory.create("Антонн", 41, group1, MALE),
				factory.create("Владимир", 49, group1, MALE),
				factory.create("Константин", 21, group1, MALE),
				factory.create("Татьяна", 56, group1, FEMALE),
				factory.create("Марьяна", 64, group2, FEMALE));
	}

	@FunctionalInterface
	interface PersonFactory<P extends Student> {
		P create(String name, int age, Group group, SexType sexType);
	}
}
