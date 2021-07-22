import java.util.Arrays;

public class Author implements Comparable<Author> {
	String firstName;
	String lastName;
	String bookName;

	Author(String first, String last, String book) {
		this.firstName = first;
		this.lastName = last;
		this.bookName = book;
	}

	@Override
	/*
	 * This is where we write the logic to sort. This method sort automatically by
	 * the first name in case that the last name is the same.
	 */
	public int compareTo(Author o) {
		/*
		 * Sorting by last name. compareTo should return <0 if this (keyword) is
		 * supposed to be less than o, >0 if this is supposed to be greater than object
		 * o and 0 if they are supposed to be equal.
		 */
		int last = this.lastName.compareTo(o.lastName);
		
	    // Sorting by first name if last name is same d
		return last == 0 ? this.firstName.compareTo(o.firstName) : last;
	}

}
