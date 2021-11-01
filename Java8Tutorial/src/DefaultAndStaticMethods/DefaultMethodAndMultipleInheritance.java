package DefaultAndStaticMethods;

interface MI1 {
	default void newMethod() {
		System.out.println("Newly added default method 1");
	}

	void existingMethod(String str);
}

interface MI2 {
	default void newMethod() {
		System.out.println("Newly added default method 2");
	}

	void disp(String str);
}

public class DefaultMethodAndMultipleInheritance {
	
	//implementing abstract methods
	public void existingMethod(String str) {
		System.out.println("String is: "+str);
	}
	public void disp(String str) {
		System.out.println("String is: "+str);
	}
	//Implementation of duplicate default method
	public void newMethod() {
		System.out.println("Implementation of default method");
	}
	public static void main(String[] args) {
		DefaultMethodAndMultipleInheritance obj = new DefaultMethodAndMultipleInheritance();
		
		//calling the default method of interface
		obj.newMethod();
		
	}
}
