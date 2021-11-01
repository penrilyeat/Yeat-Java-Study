package StreamCollectors;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectingDataAsSet {
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
		Set<Student> students = studentlist.stream().filter(n -> n.id > 22).collect(Collectors.toSet());
		// Iterating Set
		for (Student stu : students) {
			System.out.println(stu.id + " " + stu.name + " " + stu.age);
		}

	}
}
