package MethodReference;
@FunctionalInterface
interface MyInterface1 {
	void display();
}
public class MethodReferenceToAnInstanceMethodOfAnObject {
	public void myMethod() {
		System.out.println("Instance Method");
	}
	public static void main(String[] args) {
		MethodReferenceToAnInstanceMethodOfAnObject obj=new MethodReferenceToAnInstanceMethodOfAnObject();
		//Method reference using the object of the class
		MyInterface1 ref=obj::myMethod;
		ref.display();
	}
}
