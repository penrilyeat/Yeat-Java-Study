import java.util.Comparator;

public class AuthorAgeComparator implements Comparator<Author2> {

	@Override
	public int compare(Author2 o1, Author2 o2) {
		// TODO Auto-generated method stub
		if (o1.auAge == o2.auAge)
			return 0;
		else if (o1.auAge > o2.auAge)
			return 1;
		else
			return -1;
	}

}
