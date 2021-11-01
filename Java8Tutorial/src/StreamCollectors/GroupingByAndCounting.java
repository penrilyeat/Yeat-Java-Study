package StreamCollectors;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingByAndCounting {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Jon", "Ajeet", "Steve", "Ajeet", "Jon", "Ajeet", "Phybee");
		System.out.println(names.getClass());
		Map<String, Long> map = names.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		
		map.forEach((key,value)->System.out.println(key+value));
	}
}
