import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		LinkedHashMap<Integer,String> mapOne=new LinkedHashMap<Integer,String>();
		mapOne.put(29, "John");
		mapOne.put(1, "Yeat");
		mapOne.put(33, "Ping");
		mapOne.put(5, "Afifah");
		mapOne.put(89, "Mihara");
		mapOne.put(88, "Zen");
		
		Set set=mapOne.entrySet();
		
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Integer, String> me=(Map.Entry<Integer, String>)iterator.next();
			System.out.print("Key is: "+me.getKey()+" & Value is: ");
			System.out.println(me.getValue());
		}
	}
}
