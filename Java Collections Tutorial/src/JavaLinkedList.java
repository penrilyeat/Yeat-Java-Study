import java.util.Iterator;
import java.util.LinkedList;

public class JavaLinkedList {
	public static void main(String[] args) {
		LinkedList<String> carList = new LinkedList<String>();
		carList.add("Honda");
		carList.add("Toyota");
		carList.add("Lexus");

		// Initial LinkedList
		System.out.println("Initial Linked List");
		System.out.println(carList);

		// Add element by .addFirst
		System.out.println("\nAdd element by .addFirst");
		carList.addFirst("BMW");
		System.out.println(carList);

		// Add element by .addLast
		System.out.println("\nAdd element by .addLast");
		carList.addLast("Mercedes");
		System.out.println(carList);

		// Add element by .add to 3rd position
		// If no mention the position by default will be add to the last
		System.out.println("\nAdd element by .add");
		carList.add(3, "Proton");
		System.out.println(carList);

		// Iterating LinkedList
		System.out.println("\nIterating Linked List");
		Iterator<String> iterator = carList.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		// Remove the element by .removeFirst
		System.out.println("\nRemove the element by .removeFirst");
		carList.removeFirst();
		System.out.println(carList);

		// Remove the element by .removeLast
		System.out.println("\nRemove the element by .removeLast");
		carList.removeLast();
		System.out.println(carList);

		// Remove the 3rd element by .remove
		System.out.println("\nRemove the 3rd element by .remove");
		carList.remove(2);
		System.out.println(carList);

		// Get the 2nd element by String
		System.out.println("\nGet the 2nd Element by String");
		String a = carList.get(1);
		System.out.println(a);

		// Get the 3rd element by String
		System.out.println("\nGet the 3rd Element by String");
		Object b = carList.get(2);
		System.out.println(b);

	}
}
