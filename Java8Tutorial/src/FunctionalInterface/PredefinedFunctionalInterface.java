package FunctionalInterface;

import java.util.function.IntBinaryOperator;

public class PredefinedFunctionalInterface {
	public static void main(String[] args) {
		//lambda expression
		IntBinaryOperator sum=(a,b)->a+b;
		System.out.println("Result: "+sum.applyAsInt(13, 44));
	}
}
