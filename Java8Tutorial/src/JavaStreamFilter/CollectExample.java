package JavaStreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Yeat", "Sharon", "Melisa", "Sylvia", "CheePing");
		List<String> longnames = names.stream()// converting the list to stream
				.filter(str -> str.length() > 6)// filter the stream to create a new stream
				.collect(Collectors.toList());// collect the final stream and convert it to a List
		longnames.forEach(System.out::println);
	}

}
