
import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {

      HashSet<String> Hs = new HashSet<String>();
      Hs.add("A");
      Hs.add("B");
      Hs.add("C");
      Hs.add("D");
      Hs.add("C");
      
    System.out.println(Hs);
      //Hs.clear();
     // System.out.println("After "+Hs);                      //clear() removes all the elements
      
      String[] array = new String[Hs.size()];
      Hs.toArray();                                //---------toArray()
      System.out.println("After converting to array  ");
      for(String s:Hs) {
      
      System.out.println(s);
      }
      
      //HashSet to a List/ArrayList
      
      List<String> ls = new   ArrayList<String>(Hs);
      System.out.println("List to Arraylist "+ls);
	}
}
