import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		
		//Method 1
		System.out.println("VECTOR METHOD 1");
		Vector<String> vecOne=new Vector<String>();
		System.out.println("Initial Size");
		System.out.println( vecOne.size());
		System.out.println("Initial Capacity");
		System.out.println(vecOne.capacity());
		
		vecOne.add("11");
		vecOne.add("12");
		vecOne.add("13");
		vecOne.add("14");
		vecOne.add("15");
		vecOne.add("16");
		vecOne.add("17");
		vecOne.add("18");
		vecOne.add("19");
		vecOne.add("20");
		vecOne.add("21");
		vecOne.add("22");
		System.out.println("\nAdd in 12 elements");
		System.out.println("Size");
		System.out.println( vecOne.size());
		System.out.println("Capacity");
		System.out.println(vecOne.capacity());
		
		//Vector Method 2
		System.out.println("\nMethod Vector 2");
		Vector<String> vecTwo=new Vector<String>(3);
		vecTwo.add("Malaysia");
		vecTwo.add("Japan");
		vecTwo.add("Korea");
		vecTwo.add("USA");
		System.out.println("Size");
		System.out.println( vecTwo.size());
		System.out.println("Capacity");
		System.out.println(vecTwo.capacity());
		
		//Vector Method 3
		System.out.println("\nMethod Vector 3");
		Vector<String> vecThree=new Vector<String>(3,8);
		vecThree.add("Malaysia");
		vecThree.add("Japan");
		vecThree.add("Korea");
		vecThree.add("USA");
		System.out.println("Size");
		System.out.println( vecThree.size());
		System.out.println("Capacity");
		System.out.println(vecThree.capacity());
		
	}
}
