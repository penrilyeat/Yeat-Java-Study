package StringJoiner;

import java.util.StringJoiner;

public class JoinStringByDelimiter {
	public static void main(String[] args) {
		//Passing Hyphen(-) as delimiter
		StringJoiner mystring=new StringJoiner("-");
		
		//Joining multiple strings by using add() method
		mystring.add("Logan");
		mystring.add("Magneto");
		mystring.add("Rogue");
		mystring.add("Storm");
		System.out.println(mystring);
	}
}
