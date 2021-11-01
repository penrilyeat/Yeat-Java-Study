package MethodReference;

import java.util.function.BiFunction;

class Multiplication{
	public static int multiply(int a, int b) {
		return a*b;
	}
}
public class MethodReferenceToAStaticMethodOfAClass {
	public static void main(String[] args) {
		BiFunction<Integer,Integer,Integer> product=Multiplication::multiply;
		int pr=product.apply(2, 7);
		System.out.println("Product off given number is: "+pr);
	}
	
}
