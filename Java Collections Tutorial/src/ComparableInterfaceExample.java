import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparableInterfaceExample {
	public static void main(String[] args) {
		/*
		 * Integer class implements Comparable
		 * Interface so we can use the sort method
		 */
		int [] arr= {23,59,10,0,33,9,-4,7};
		Arrays.sort(arr);
		System.out.println("Sorted Int Array: ");
		System.out.println(Arrays.toString(arr));
		
		/*
		 * String class implements Comparable
		 * Interface so we can use the sort method
		 */
		System.out.println("Sorted String Array: ");
		String [] names = {"Yeat", "John","Yugi","CheePing","Afifah"};
		Arrays.sort(names);
		System.out.println(Arrays.toString(names));
		
		/*
		 * String class implements Comparable
		 * Interface so we an use the sort method
		 */
		System.out.println("Sorted List: ");
		List<String> fruit=new ArrayList<String>();
		fruit.add("Orange");
		fruit.add("Apple");
		fruit.add("Banana");
		fruit.add("Grapes");
		Collections.sort(fruit);
		System.out.println(fruit);
		for(String s:fruit)
			System.out.print(s+", ");
		
		System.out.println();
		System.out.println();
		ArrayList<Author> al=new ArrayList<Author>();
		al.add(new Author("Henry","Miller","Tropic of Cancer"));
		al.add(new Author("Nalo","Hopkinson","Brown Girl in the Ring"));
		al.add(new Author("Frank","Miller","300"));
		al.add(new Author("Deborah","Hopkinson","Sky Boys"));
		al.add(new Author("George R. R.","Martin","Song of Ice and Fire"));
		
		/*
		 * Sorting the list using Collections.sort() method, wee
		 * can use this method because we have implemented the 
		 * Comparable interface in our user defined class Author
		 */
		Collections.sort(al);
		for(Author str:al) {
			System.out.println(str.firstName+" "+str.lastName+"Book: "+str.bookName);
		}
	}
}
