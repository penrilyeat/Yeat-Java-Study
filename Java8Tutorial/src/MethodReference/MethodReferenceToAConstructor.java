package MethodReference;

@FunctionalInterface
interface MyInterface {
	Hello display(String say);
}

class Hello {
	public Hello(String say) {
		System.out.println(say);
	}
}

public class MethodReferenceToAConstructor {
	public static void main(String[] args) {
		// Method reference to a constructor
		MyInterface ref = Hello::new;
		ref.display("Hello World!");
	}
}
