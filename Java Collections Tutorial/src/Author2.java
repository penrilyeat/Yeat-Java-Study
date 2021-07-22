
public class Author2 implements Comparable<Author2> {

	String firstName;
	String bookName;
	int auAge;

	Author2(String first, String book, int age) {
		this.firstName = first;
		this.bookName = book;
		this.auAge = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getAuAge() {
		return auAge;
	}

	public void setAuAge(int auAge) {
		this.auAge = auAge;
	}

	@Override
	public int compareTo(Author2 o) {
		// TODO Auto-generated method stub
		return this.firstName.compareTo(o.firstName);
	}

}
