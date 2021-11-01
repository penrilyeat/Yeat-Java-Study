import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
	public static void main(String[] args) {
		String content="Hi how are you? "+ "I am fine. Do you need some juice? juice";
		String pattern = ".*juice.*";
		System.out.println("CASE SENSITIVE SEARCH");
		boolean isMatch=Pattern.matches(pattern,content);
		System.out.println(content);
		System.out.println("The text contains '"+pattern+ "' ? "+isMatch);
		pattern=".*Juice.*";
		isMatch=Pattern.matches(pattern, content);
		System.out.println("The text contains '"+pattern+ "' ? "+isMatch);
		
		
		System.out.println();
		
		System.out.println("PATTERN COMPILE AND MATCHER");
		String content2="Apple is the best product!";
		String patternString=".*pRoDucT.*";
		Pattern pa=Pattern.compile(patternString,Pattern.CASE_INSENSITIVE);
		Matcher matcher=pa.matcher(content2);
		boolean match=matcher.matches();
		
		System.out.println(content2);
		System.out.println("The text contains '"+pa+ "' ? "+match);
		
		System.out.println();
		
		String text="ThisIsAlknight.ItIsAWebsite.";
		String separate="is";
		Pattern pa2=Pattern.compile(separate,Pattern.CASE_INSENSITIVE);
		String[] myStrings=pa2.split(text);
		for(String temp:myStrings) {
			System.out.println(temp);
		}
		System.out.println("Number of split strings: "+myStrings.length);
	}
}
