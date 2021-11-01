package StreamCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student {
	int id;
	String name;
	int age;

	public Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}

public class FetchDataAsList {
	public static void main(String[] args) {
		List<Student> studentlist = new ArrayList<Student>();
		System.out.println(studentlist.getClass());
		// Adding Student
		studentlist.add(new Student(11, "Jon", 22));
		studentlist.add(new Student(22, "Steve", 18));
		studentlist.add(new Student(33, "Lucy", 22));
		studentlist.add(new Student(44, "Sansa", 23));
		studentlist.add(new Student(55, "Maggie", 18));
		// Fetching student names as List
		List<String> names = studentlist.stream()
										.map(n -> n.name)
										.collect(Collectors.toList());
		System.out.println(names);
	}
}
