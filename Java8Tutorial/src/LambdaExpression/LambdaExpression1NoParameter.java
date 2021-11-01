package LambdaExpression;
@FunctionalInterface
interface MyFunctionalInterface1 {
	// A method with no parameter
	public String sayHello();
}

public class LambdaExpression1NoParameter {
	public static void main(String[] args) {
		// lambda expression
		MyFunctionalInterface1 msg = () -> {
			return "Hello";
		};
		// without lambda expression
		MyFunctionalInterface1 msg2=(new MyFunctionalInterface1() {
			public String sayHello() {
				return "HAHA";
			}
		});
		
		
		System.out.println(msg.sayHello());
		System.out.println(msg2.sayHello());
	}

}
