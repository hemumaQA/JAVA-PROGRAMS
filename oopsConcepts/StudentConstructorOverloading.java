package oopsConcepts;

       /*In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

        *Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. 

         *They are arranged in a way that each constructor performs a different task.

          *They are differentiated by the compiler by the number of parameters in the list and their types.*/

public class StudentConstructorOverloading {
	
	int id;
	String name;
	int age;
	
	 StudentConstructorOverloading(int d,String n){
		 id=d;
		 name=n;
	 }
	 StudentConstructorOverloading(int d,String n,int a){
		 id=d;
		 name=n;
		 age=a;
	 }
	 
	void display(){
		 System.out.println(id+" "+name +" "+age);
	 }
	 
	public static void main(String[] args) {
		StudentConstructorOverloading s1 = new StudentConstructorOverloading(103,"Uma",21);
		StudentConstructorOverloading s2 = new StudentConstructorOverloading(105,"Preethi",14);
		
		s1.display();
		s2.display();
	

	}

}
