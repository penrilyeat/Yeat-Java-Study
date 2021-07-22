import java.util.Comparator;

public class MyComparator implements Comparator<String>{
	public int compare(String x, String y)
	{
		return x.length()-y.length();
	}
}
