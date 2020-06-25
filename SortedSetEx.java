import java.util.*;
public class SortedSetEx {
	//SORTEDSET IS INTERFACE...tREE SET IA A CLASS THAT IMPLEMENTS IT-----does not allow duplicates

	public static void main(String[] args) {
		
		SortedSet<Integer> Sl= new TreeSet<Integer>();
		
		Sl.add(5);
		Sl.add(2);
		Sl.add(4);
		Sl.add(3);
		Sl.add(3);
		Sl.add(1);
		
		
		//iterating using FOR loop
		for(Integer s:Sl) {
		
		System.out.println(s);
		}
		System.out.println("Size "+Sl.size());    //------to get size
		System.out.println("First "+Sl.first());   //------gets the first element
		System.out.println("Last "+Sl.last());     //------gets d last element
		System.out.println("contains 3 "+Sl.contains(3));   //-----checks if the element is in the set
		System.out.println("contains 3 "+Sl.contains(0));    //----gives a boolean value TRUE-iff element is present n false if not present
		Sl.remove(2);
		System.out.println("remove method "+Sl);             //------removes the particular element
		
		
		
		
	          
		
		
		
		
		
		
		

	}

}
