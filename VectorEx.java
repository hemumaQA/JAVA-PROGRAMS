import java.util.*;
public class VectorEx {
     //   size of vector doubles its size once it reaches it mentioned size,default capacity is 10,after 
	//it reaches this capacity it doubles up to 20
	public static void main(String[] args) {
		
		Vector<String>  vec = new Vector<String>();
		
		vec.add("apple");
		vec.add("orange");
		vec.add("banana");
		vec.add("peach");
		vec.add("jackfruit");
		
		//Collections.sort(vec);//------------sorting the elements
		//System.out.println(vec);
		
		/*//System.out.println("size of vector :"+ vec.size());//number of elements
		
		for(String s:vec)
			System.out.println(s);//-------lists elements vertically
		
		System.out.println(vec);//-------[lists elements horizontally]
		
		//System.out.println("capacity of vector "+vec.capacity()); 
		
		vec.add("a");
		vec.add("b");
		vec.add("c");
		vec.add("e");
		vec.add("f");
		vec.add("g");
		//System.out.println("size of vector :"+ vec.size());
		//System.out.println("capacity of vector "+vec.capacity()); 
		
		
	     
		//System.out.println(vec.firstElement());//--------firstElement()-----apple
		//System.out.println(vec.lastElement()); //--------last element()-----g
		
		//System.out.println(vec.isEmpty());*/
		
		Iterator<String> itr=vec.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
	}

}
}







