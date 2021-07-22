import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;


public class HashMapExample {
	public static void main(String[] args) {
		HashMap<String, String> hMapPosition = new HashMap<String, String>();

		hMapPosition.put("Senior Engineer", "Chee Ping");
		hMapPosition.put("Software Engineer", "Yeat Nai Cheng");
		hMapPosition.put("Web Software Engineer", "Kok Zhen Loong");
		hMapPosition.put("HR", "Afifah");
		System.out.println(hMapPosition);

		Set set = hMapPosition.entrySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("Key is: " + mentry.getKey() + " & Value is: ");
			System.out.println(mentry.getValue());
		}
		
		//Get values based on key
		System.out.println("\nGet value based on key");
		System.out.println(hMapPosition.get("HR"));
		
		//Remove values based on the key
		System.out.println("\nRemove values based on the key");
		hMapPosition.remove("Web Software Engineer");
		
		Set set2 = hMapPosition.entrySet();
		Iterator iterator2 = set2.iterator();
		while (iterator2.hasNext()) {
			Map.Entry mentry2 = (Map.Entry) iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + " & Value is: ");
			System.out.println(mentry2.getValue());
		}

	}
}
