package LambdaExpression;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpression4IteratingCollections {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Yeat");
		list.add("Afifah");
		list.add("Almight");
		list.add("Sylvia");
		list.add("Jaden");
		list.forEach(
				// lambda expression
				(names) -> System.out.println(names));
	}
}
