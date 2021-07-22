import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ComparatorInterfaceExample {
	public static void main(String[] args) {
		ArrayList<Author2> al = new ArrayList<Author2>();
		al.add(new Author2("Henry", "Tropic of Cancer", 45));
		al.add(new Author2("Nalo", "Brown Girl in the Ring", 56));
		al.add(new Author2("Frank", "300", 65));
		al.add(new Author2("Deborah", "Sky Boys", 51));
		al.add(new Author2("Georgw R. R.", "A Song of Ice and Fire", 62));
		//Initial Arrangement
		for (Author2 au : al) {
			System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " + au.getAuAge());
		}
		System.out.println();
		/*
		 * Sorting the list using Collections.sort() method, we can use this method
		 * because we have implemented the Comparable interface in our user defined
		 * class Author
		 */

		System.out.println("Sorting by Author First Name:");
		Collections.sort(al);
		for (Author2 au : al) {
			System.out.println(au.getFirstName() + ", " + au.getBookName() + ", " + au.getAuAge());
		}
		
		/*Sorting using AuthorAggeComparator*/
		System.out.println("\nSorting by Author Age: ");
		Collections.sort(al,new AuthorAgeComparator());;
		for(Author2 au:al) {
			System.out.println(au.getFirstName()+", "+au.getBookName()+", "+au.getAuAge());
		}
		
		/*Sorting using BookNameComparator**/
		System.out.println("\nSorting by Book Name");
		Collections.sort(al,new BookNameComparator());
		for(Author2 au:al) {
			System.out.println(au.getFirstName()+", "+au.getBookName()+", "+au.getAuAge());
		}
	}

}
