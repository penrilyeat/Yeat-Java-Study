package JavaStreamFilter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MultipleConditions {
	public static void main(String[] args) {
		List<String> names=Arrays.asList("Yeat","Sylvia","CheePing","MiharaKeigo","Melisa");
		List<String>longnames=names.stream()
				.filter(str->str.length()>6&&str.length()<10)//Multiple Condition
				.collect(Collectors.toList());
		longnames.forEach(System.out::println);
	}
}
