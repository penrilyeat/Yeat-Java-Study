package FunctionalInterface;

@FunctionalInterface
interface MyFunctionalInterface {
	public int addMethod(int a, int b);
}

public class CreateOwnFunctionalInterface {
	public static void main(String[] args) {
		//lambda expression
		MyFunctionalInterface sum=(a,b)->a+b;
		System.out.println("Result: "+sum.addMethod(23, 55));
	}
}
