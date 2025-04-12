package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Group {
	private String name;
	private List<Student> persons = new ArrayList<>();

	public Group(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public Group addPerson(Student person) {
		persons.add(person);
		return this;
	}

	public List<Student> getPersons() {
		return Collections.unmodifiableList(persons);
	}
}
