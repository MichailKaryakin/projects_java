package model;

public class Student {
	private String name;
	private int age;
	private Group group;
	private SexType sexType;

	public Student(String name, int age, Group group, SexType sexType) {
		this.name = name;
		this.age = age;
		this.group = group;
		this.sexType = sexType;
		group.addPerson(this);
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Group getGroup() {
		return group;
	}

	public SexType getSexType() {
		return sexType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Группа:").append(group.getName());
		builder.append(" ");
		builder.append("Имя:").append(name);
		builder.append(" ");
		builder.append("Возраст:").append(age);
		return builder.toString();
	}
}
