import java.util.ArrayList;

public class JavaArrayList {
	public static void main(String[] args) {
		ArrayList<String> penrilPeople=new ArrayList<String>();
		penrilPeople.add("YNC");
		penrilPeople.add("CheePing");
		penrilPeople.add("Afifah");
		//Initial ArrayList
		System.out.println("INITIAL ARRAYLIST");
		System.out.println(penrilPeople);
		
		//Add new element in 2nd position
		System.out.println("\nADD NEW IN 2ND POSITION");
		penrilPeople.add(1,"PENRIL");
		System.out.println(penrilPeople);
		
		//Change 2nd element
		System.out.println("\nCHANGE 2ND ELEMENT OF THE ARRAY LIST");
		penrilPeople.set(1, "Zhen Loong");
		System.out.println(penrilPeople);
		
		//Add Same Element
		System.out.println("\nADD SAME ELEMENT");
		penrilPeople.add("CheePing");
		System.out.println(penrilPeople);
		
		//Remove element
		System.out.println("\nREMOVE ELEMENT 'CheePing'");
		penrilPeople.remove("CheePing");
		System.out.println(penrilPeople);
		System.out.println("RESULT SHOWN THAT THE FRONT ELEMENT WILL BE REMOVED");
		
		//Remove element
		System.out.println("\nREMOVE SAME ELEMENT AGAIN 'CheePing'");
		penrilPeople.remove("CheePing");
		System.out.println(penrilPeople);
		
		//Add new element for testing
		System.out.println("\nADD NEW ELEMENT");
		penrilPeople.add("CheePing");
		penrilPeople.add("Norlizawati Ahmad");
		penrilPeople.add("Tina Rahman");
		System.out.println(penrilPeople);
		
		//Different way of removing element
		System.out.println("\nINDEX REMOVE ELEMENT");
		penrilPeople.remove(1);
		System.out.println(penrilPeople);
		
		//Get the size of array
		System.out.println("\nARRAY SIZE");
		System.out.println(penrilPeople.size());
		
		//Check contains Tina Rahman
		System.out.println("\nCheck contains 'Tina Rahman'");
		System.out.println(penrilPeople.contains("Tina Rahman"));
		
		//Check index of CheePing
		System.out.println("\nCheck index of CheePing");
		System.out.println(penrilPeople.indexOf("CheePing"));
		
		//Get Object from index
		System.out.println("\nGet Object from index 3");
		System.out.println(penrilPeople.get(3));
		
		//Advanced For Loop Display Elements
		System.out.println("\nAdvanced For Loop Display Elements");
		for(String str:penrilPeople)
		{
			System.out.println(str);
		}
	}
}
