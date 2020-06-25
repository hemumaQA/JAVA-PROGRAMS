import java.util.*;
public class LinkedHashSetEx {

	public static void main(String[] args) {
		
            LinkedHashSet<Integer>lhs = new LinkedHashSet<Integer>();
            lhs.add(1);
            lhs.add(2);
            lhs.add(3);
            lhs.add(4);
            lhs.add(5);
            lhs.add(5);         //-------ignores duplicate elements
            
            System.out.println(lhs);
            
            lhs.clone();
            System.out.println(lhs);
            
           for(Integer s:lhs) {
        	   System.out.println(s);
           }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
	}

}
