package oopsConcepts;

/*The static keyword in Java is used for memory management mainly.
We can apply static keyword with variables, methods, blocks and nested classes.
The static keyword belongs to the class than an instance of the class.*/

//It makes your program memory efficient (i.e., it saves memory).

public class StudentStaticKeyword {         /*The static variable can be used to refer to the common property of all objects
	                                                     (which is not unique for each object), 
	                                         for example, the company name of employees, college name of students, etc.*/
	
	int id;
	String name;
	static String college="MOP";       
	
	StudentStaticKeyword(int d,String n){
		id=d;
		name=n;
	}
	
	void display() {
		System.out.println(id+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		StudentStaticKeyword  s1= new StudentStaticKeyword(104,"uma");
		StudentStaticKeyword  s2= new StudentStaticKeyword(105,"Preethi");
		
		s1.display();
		s2.display();
		
		

	}

}
