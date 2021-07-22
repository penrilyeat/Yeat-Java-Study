import java.util.Comparator;

public class BookNameComparator implements Comparator<Author2>{

	@Override
	public int compare(Author2 o1, Author2 o2) {
		// TODO Auto-generated method stub
		return o1.bookName.compareTo(o2.bookName);
	}

}
