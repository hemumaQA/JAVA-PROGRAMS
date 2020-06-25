import java.util.*;
public class LinkedlistEx {
	
	//LINKED LIST and methods-addFirst(),addLast(),removeFirst(),removeLast(),Clone()

	public static void main(String[] args) {
		
		LinkedList<String>llist= new LinkedList<String>();
		
		 llist.add("apple");
		 llist.add("orange");
		 llist.add("banana");
		 llist.add("peach");
		 llist.add("jackfruit");
		 llist.add(3,"Grapes");
		// llist.addFirst("Mango");
		// llist.addLast("Peaches");
		// llist.remove("Grapes");
		// -------------llist.clear();----------- exception
		 
		/* ArrayList<String> arraylist= new ArrayList<String>();
		 arraylist.add("String1");
		 arraylist.add("String2");*/
		 
		// llist.addAll(arraylist);
		 Object str= llist.clone();//--------//Clone()---copy of the linkedlist
		 System.out.println(str);
		 
		
		 
		 //llist.removeFirst();
		// llist.removeLast();
		// llist.set(4, "Strawberry");
		 
		 
		 Iterator<String>iterator=llist.iterator();
		 while(iterator.hasNext())
			 System.out.println(iterator.next());
		 
		 
		 
		 //for(String s:llist) {
		 
		// System.out.println(s);
		// }
	     

	}

}
