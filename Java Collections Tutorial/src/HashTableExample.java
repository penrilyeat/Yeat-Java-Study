import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableExample {
	public static void main(String[] args) {
		Hashtable<String,String> hashTable=new Hashtable<String,String>();
		
		Enumeration names;
		String key;
		
		hashTable.put("Key1", "Hello");
		hashTable.put("Key2", "Apple");
		hashTable.put("Key3", "Peace");
		hashTable.put("Key4", "One");
		hashTable.put("Key5", "Two");
		
		names=hashTable.keys();
		while(names.hasMoreElements()) {
			key=(String)names.nextElement();
			System.out.println("Key: "+key+" & Value: "+hashTable.get(key));
		}
	}
}
