package LambdaExpression;
@FunctionalInterface
interface MyFunctionalInterface2 {
	// A method with single parameter
	public int incrementByFive(int a);
}

public class LambdaExpression2SingleParameter {
	public static void main(String[] args) {
		// lamda expression with single parameter num
		MyFunctionalInterface2 f = (num) -> num + 5;

		// without lamda expression
		MyFunctionalInterface2 f2 = (new MyFunctionalInterface2() {
			public int incrementByFive(int a) {
				return a + 5;
			}
		});

		System.out.println(f.incrementByFive(22));
		System.out.println(f2.incrementByFive(3));
	}
}
