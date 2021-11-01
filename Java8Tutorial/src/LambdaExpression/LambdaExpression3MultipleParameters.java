package LambdaExpression;
interface MyFunctionalInterface3 {
	public String sCombine(String a, String b);
}

public class LambdaExpression3MultipleParameters {
	public static void main(String[] args) {
		// lambda expression with multiple arguments
		MyFunctionalInterface3 s = (str1, str2) ->str1 + str2;
		

		// without lambda expression
		MyFunctionalInterface3 s2 = (new MyFunctionalInterface3() {
			public String sCombine(String st1, String st2) {
				return st1 + st2;
			}
		});

		System.out.println("Result: " + s.sCombine("Hello ", "World"));
		System.out.println("Result: " + s2.sCombine("HEYHEY ", "ALMIGHT"));
	}
}
