import java.util.*;
import java.util.Map.Entry;

public class HashMapEx {

	public static void main(String[] args) {
			HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(10, "A");
		hmap.put(5, "B");
		hmap.put(1, "C");
		hmap.put(3, "D");
		hmap.put(6, "E");
		
		
		System.out.println("Keys:"+hmap.keySet());           //to get key
		
		System.out.println("Value:"+hmap.values());         // to get value
		
		System.out.println("key value pair :"+hmap.entrySet());   //to get key value pair
		
		System.out.println("remove an element "+hmap.remove(1));   //-------remove() to remove element
		
		for(Entry<Integer, String> m:hmap.entrySet()) {
			System.out.println(m.getKey()+" " +m.getValue());
		}
		
		hmap.remove(1); 
		System.out.println("after removing an element "+hmap);
		
		hmap.replace(6, "G");
		System.out.println("after replacing an element "+hmap);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
