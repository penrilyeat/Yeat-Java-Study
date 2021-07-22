import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		LinkedHashSet<String> tSet = new LinkedHashSet<String>();

		tSet.add("ABC");
		tSet.add("Zebra");
		tSet.add("Boy");
		tSet.add("Girl");
		tSet.add("Cake");

		System.out.println(tSet);

		LinkedHashSet<Integer> tSet2 = new LinkedHashSet<Integer>();
		tSet2.add(4);
		tSet2.add(8);
		tSet2.add(2);
		tSet2.add(49);
		tSet2.add(99);
		tSet2.add(56);

		System.out.println(tSet2);
	}
}
