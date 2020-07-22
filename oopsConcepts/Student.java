package oopsConcepts;

public class Student {
	/*we have created a Student class which has two data members id and name.
	 *  We are creating the object of the Student class by new keyword and printing the object's value.

      *Here, we are creating a main() method inside the class.*/
	
	//defining fields
	int id;      //instance variable(inside class outside method
	String name;

	public static void main(String[] args) {  //main methos for student class
		
		Student s1 = new Student();       //creating an object of student
		
		System.out.println(s1.id);       //accessing member thru reference variable
		System.out.println(s1.name);    //accessing member thru reference variable
		
	

	}

}
