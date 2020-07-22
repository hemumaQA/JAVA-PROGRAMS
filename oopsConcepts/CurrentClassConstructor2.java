package oopsConcepts;

//Calling parameterized constructor from default constructor

public class CurrentClassConstructor2 {
	
	CurrentClassConstructor2(){
		this(5);
		System.out.println("hello a");
	}
	
	CurrentClassConstructor2(int x){
		System.out.println(x);
	}

	public static void main(String[] args) {
		
		CurrentClassConstructor2 c = new CurrentClassConstructor2();
		
		
		

	}

}
