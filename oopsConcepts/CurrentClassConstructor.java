package oopsConcepts;

/*The this() constructor call can be used to invoke the current class constructor.
It is used to reuse the constructor. In other words, it is used for constructor chaining.*/

public class CurrentClassConstructor {
	
	//Calling default constructor from parameterized constructor
	
	 CurrentClassConstructor(){     //Default constructor
		System.out.println("hello a");
	}
	 
	 CurrentClassConstructor(int x){     //Parameterized constructor
		this();
		System.out.println(x);
	 }

	public static void main(String[] args) {
		
		CurrentClassConstructor c = new CurrentClassConstructor(10) ;
		
	}

}
