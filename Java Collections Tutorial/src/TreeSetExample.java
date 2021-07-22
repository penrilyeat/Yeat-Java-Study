import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<String> tSet=new TreeSet<String>();
		
		tSet.add("ABC");
		tSet.add("Zebra");
		tSet.add("Boy");
		tSet.add("Girl");
		tSet.add("Cake");
		
		System.out.println(tSet);
		
		TreeSet<Integer>tSet2=new TreeSet<Integer>();
		tSet2.add(4);
		tSet2.add(8);
		tSet2.add(2);
		tSet2.add(49);
		tSet2.add(99);
		tSet2.add(56);
		
		System.out.println(tSet2);
	}
}
