package OptionalClass;

import java.util.Optional;

public class OrElseMethod {
	public static void main(String[] args) {
		//Creating Optional object from a String
		Optional<String>GOT=Optional.of("Game of Thrones");
		//Optional.empty() creates an empty Optional object
		Optional<String>nothingOptional=Optional.empty();
		
		//orElse() method
		System.out.println(GOT.orElse("Default Value"));
		System.out.println(nothingOptional.orElse("Default Value"));
		
		//orElseGet() method
		System.out.println(GOT.orElseGet(()->"Default Value"));
		System.out.println(nothingOptional.orElseGet(()->"Default Value"));
	}
}
