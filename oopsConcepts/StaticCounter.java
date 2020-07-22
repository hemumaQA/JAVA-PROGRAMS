package oopsConcepts;

//Program of the counter without static variable



public class StaticCounter { //which get memory each time when we create an object of the class.  
	
	//int count=0;  //instance variable-----will get memory each time when the instance is created  
	
	static int count=0;  //will get memory only once and retain its value ------is shared with all objects. 
	
	StaticCounter(){
		count++;
		System.out.println(count);
	}

	public static void main(String[] args) {
		StaticCounter s1 = new StaticCounter();
		StaticCounter s2 = new StaticCounter();
		StaticCounter s3 = new StaticCounter();
		
       
	}

}
