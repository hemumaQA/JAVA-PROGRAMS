package oopsConcepts;

public class InitializationMethod {        //Objects-HEAP MEMEORY--------reference -STACK MEMEORY
	
	int id;
	String name;
	
	public void Student(int d,String n ) {      //---------method 1 -initialising the variables
		id = d;
		name=n;
	}
	void display() {                         //-----------method 2 - to display 
		System.out.println(id+" "+name);
	}
		

	public static void main(String[] args) {
		
		InitializationMethod s1=new InitializationMethod();     //----------creating object 1
		InitializationMethod s2=new InitializationMethod();     //----------creating object 2
		
		
		s1.Student(105,"Uma");           //object with method name(1)
		s2.Student(106,"Preethi");
		s1.display();                    //object with method name(2)
		s2.display();       
	
	

	}

}
