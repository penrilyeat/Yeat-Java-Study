import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



public class TreeMapExample {
	public static void main(String[] args) {
		TreeMap<Integer,String> tMap=new TreeMap<Integer,String>();
		tMap.put(2, "Data1");
		tMap.put(1, "Data2");
		tMap.put(0, "Data3");
		tMap.put(30, "Data4");
		tMap.put(66, "Data5");
		tMap.put(27, "Data6");
		System.out.println(tMap);
		Set set=tMap.entrySet();
		Iterator iterator=set.iterator();
		while(iterator.hasNext())
		{
		
			Map.Entry mentry = (Map.Entry)iterator.next();
			System.out.print("Key is: " + mentry.getKey() + "& Value is: ");
			System.out.println(mentry.getValue());
		}
		//String key version
		System.out.println("\n String Key Version");
		TreeMap<String,String> tMapTwo=new TreeMap<String,String>();
		tMapTwo.put("2", "Data1");
		tMapTwo.put("1", "Data2");
		tMapTwo.put("0", "Data3");
		tMapTwo.put("30", "Data4");
		tMapTwo.put("66", "Data5");
		tMapTwo.put("27", "Data6");
		System.out.println(tMapTwo);
		Set set2=tMap.entrySet();
		Iterator iterator2=set2.iterator();
		while(iterator2.hasNext())
		{
		
			Map.Entry mentry2 = (Map.Entry)iterator2.next();
			System.out.print("Key is: " + mentry2.getKey() + "& Value is: ");
			System.out.println(mentry2.getValue());
		}
		
	}
}
