package StringJoiner;

import java.util.StringJoiner;

public class OtherMethod {
	public static void main(String[] args) {
		//Comma(,) as delimiter
		StringJoiner mystring=new StringJoiner(",");
		System.out.println("Length: "+mystring.length());
		/*Using setEmptyValue() method, we can set the default value
		 * of a StringJoiner instance, so if the StringJoiner is empty
		 * and we print the value of it, this default value will be displayed
		 */
		mystring.setEmptyValue("This is a default String");
		/*We have not added any string to StringJoiner yet so 
		 * this should display the default value of StringJoiner
		 */
		
		
		System.out.println("Default String: "+mystring);
		System.out.println("Length: "+mystring.length());
		//Adding strings
		mystring.add("Apple");
		System.out.println("Length: "+mystring.length());
		mystring.add("Banana");
		mystring.add("Orange");
		mystring.add("Kiwi");
		mystring.add("Grapes");
		
		/*The length() method of StringJoiner class returns the
		 * length of the string (the number of characters in the
		 * StringJoiner instance)
		 */
		int length=mystring.length();
		System.out.println("Length of the StringJoiner: "+length);
		
		/*The toString() method is used for converting a StringJoiner
		 * instance of a String.
		 */
		String s=mystring.toString();
		System.out.println(s);
		
	}
	
}
