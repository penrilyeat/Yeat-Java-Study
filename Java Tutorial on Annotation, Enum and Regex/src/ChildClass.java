
public class ChildClass extends ParentClass{

	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Child Class");
	}
	/**
	 * @deprecated
	 * This method was being deprecated due to some unknown reason
	 */
	@Deprecated
	public void anyMethodHere(){
	    // Do something
		System.out.println("This is the deprecated Method");
	}
}
