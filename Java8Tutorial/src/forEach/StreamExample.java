package forEach;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String>names=new ArrayList<String>();
		names.add("Yeat");
		names.add("Phybee");
		names.add("Sylvia");
		names.add("Jaden");
		names.add("Shiro");
		names.add("Melisa");
		names.add("Sharon");
		names.stream()//create stream
		.filter(f->f.startsWith("S")) //filtering names that starts with M
		.forEach(System.out::println); //displaying the stream using forEach
	}
}
