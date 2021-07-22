import java.util.HashSet;

public class HashSetExample {
	public static void main(String[] args) {
		HashSet<String> hSet = new HashSet<String>();
		
		//Add elements to hashset
		hSet.add("Apple");
		hSet.add("Banana");
		hSet.add("Coffee");
		hSet.add("Zebra");
		hSet.add("Watermelon");
		hSet.add("IceCream");
		System.out.println("INITIAL");
		System.out.println(hSet);
		
		
		System.out.println("\nADD NEW");
		hSet.add("GoodApple");
		System.out.println(hSet);
		
		System.out.println("\nADD SAME");
		hSet.add("Apple");
		hSet.add("Coffee");
		System.out.println(hSet);
		
		System.out.println("\nADD NULL");
		hSet.add(null);
		hSet.add(null);
		hSet.add(null);
		System.out.println(hSet);
		
	}
}
