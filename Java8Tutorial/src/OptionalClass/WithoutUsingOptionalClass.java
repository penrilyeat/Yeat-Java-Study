package OptionalClass;

public class WithoutUsingOptionalClass {
	public static void main(String[] args) {
		String[] str=new String[10];
		//Getting the substring
		String str2=str[9].substring(2,5);
		//Displaying substring
		System.out.println(str2);
	}
}
