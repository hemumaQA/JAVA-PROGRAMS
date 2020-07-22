package oopsConcepts;

public class StudentParameterisedConstructor {
	
	//A constructor which has a specific number of parameters is called a parameterized constructor.
	
	//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.
	
	//We can have any number of parameters in the constructor.
	
	int id;
	String name;
	
	StudentParameterisedConstructor(int d,String n){  //creating a parameterized constructor
		id = d;
		name = n;
		
		}
	
	void display() {       ////method to display the values  
		System.out.println(id +" "+name);
	}
	
	
	public static void main(String[] args) {      
		
		StudentParameterisedConstructor s1 = new StudentParameterisedConstructor(103,"Uma");  //creating objects and passing values  
		
		StudentParameterisedConstructor s2 = new StudentParameterisedConstructor(105,"Preethi");
		
		
		
		
		
		
		s1.display();        //calling method to display the values of object  
		s2.display();

	}

}
