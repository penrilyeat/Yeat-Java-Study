package JavaStream;

import java.util.ArrayList;
import java.util.List;

public class FindStringsUsingStream {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Yeat");
		names.add("Phybee");
		names.add("Sylvia");
		names.add("Jaden");
		names.add("Jet");
		names.add("Shiro");
		
		//Using Stream and Lambda expression
		long count=names.stream().filter(str->str.length()<6).count();
		System.out.println("There are "+count+" strings with length less than 6");
	}
}
