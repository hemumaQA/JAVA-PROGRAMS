import java.util.ArrayList;

public class collectionex {

	// ARRAY LIST and the methods-add(),set(),remove(),size()
	

	public static void main(String[] args) {
		
		ArrayList<String>alist = new ArrayList<String>();
		 alist.add("God");
		 alist.add("Bless");
		 alist.add("of Us");
		 
		 
		 System.out.println(alist);
		 alist.add(2,"All");         //adding one more element to the array list ----- add()
		 alist.set(0,"God Always");   //sets the given string in the index value mentioned-----set()
		 alist.remove(" of Us");       //remove the string from the list----------------------remove()
		 alist.remove(2);               // remove element with index value
		 
		System.out.println(alist);
		 
		 for(String a:alist)          //displaying elements using for each or advanced for loop
			 System.out.println(a);
			 
	     System.out.println("The size of alist array:" + alist.size());// to give to size of the array---size()
			 
		 }

	}

	

