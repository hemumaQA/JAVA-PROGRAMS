package oopsConcepts;

public class InitializationReference {
	
	//Initializing an object means storing data into the object
	
	// initialize the object through a reference variable.
	
	int id;
	String name;
	 

	public static void main(String[] args) {
		
		InitializationReference s=new InitializationReference();
		InitializationReference s1=new InitializationReference();
		
		s.id=103;
		s.name="Uma";
		
		s1.id=105;
		s1.name="Preethi";
		
		System.out.println(s.id+" "+s.name);
		System.out.println(s1.id+" "+s1.name);
		
	

	}

}
