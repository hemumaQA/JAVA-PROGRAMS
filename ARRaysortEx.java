import java.util.*;
import java.util.Collections;
public class ARRaysortEx {
	
	//sorting the array elements using the sort() method----alphabetically
	
	public static void main(String[] args) {
		
		ArrayList<String>blist= new ArrayList<String>();
		blist.add("apple");
		 blist.add("orange");
		 blist.add("banana");
		 blist.add("peach");
		 blist.add("jackfruit");
		// ArrayList list = Collections.synchronizedList(new ArrayList());
		 
		 //Collections.sort(blist,Collections.reverseOrder());//-----Sorting in decreasing order using collections.reverse ()
		//blist.clear();//  shows exception???
		 
		 
		// blist.get(0);
		// System.out.println("Index of object:" +blist.get(4));
		 
		//for(String c:blist)
		// System.out.println(c);
		
		 
		/* Enumeration<String> e = Collections.enumeration(blist);//getting object thru enumeration
		 System.out.println("Enumeration: ");
		 while(e.hasMoreElements())
		 System.out.println(e.nextElement());*/
		 
			blist.stream().forEach(System.out::println); // gives output
		 
		 
		 
		 
		 
}     
	
}
