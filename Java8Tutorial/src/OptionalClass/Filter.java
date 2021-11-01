package OptionalClass;

import java.util.Optional;

public class Filter {
	public static void main(String[] args) {
		//Creating Optional object from a String
		Optional<String> GOT=Optional.of("game of Thrones");
		/*Filter returns an empty Optional Instance if the output doesn't
		 * contain any value, else it returns the Optional object of the given value..
		 */
		System.out.println(GOT.filter(s->s.equals("GAME OF THRONES")));
		System.out.println(GOT.filter(s->s.equalsIgnoreCase("GAME OF THRONES")));
	}
}
