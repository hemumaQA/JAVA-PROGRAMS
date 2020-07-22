package oopsConcepts;

/*If you apply static keyword with any method, it is known as static method.

   A static method belongs to the class rather than the object of a class.
   
   A static method can be invoked without the need for creating an instance of a class.
   
   A static method can access static data member and can change the value of it.

    There are two main restrictions for the static method. They are:

    ** ----The static method can not use non static data member or call non-static method directly.
    ** ---- 'this' and' super' cannot be used in static context.*/

public class StudentStaticMethod {
	
	int id;
	String name;
	static String college="Loyola";
	
	static void StudentMethodChange() {    //  //static method to change the value of static variable  
		college="MOP";
		
	}
	StudentStaticMethod(int d,String n){   //  //constructor to initialize the variable 
		id=d;
		name=n;
	
	}
	
	
	void dispaly(){      //    //method to display values  
		System.out.println(id+" "+name+" "+college);
	}
	

	public static void main(String[] args) {
		 StudentStaticMethod s = new  StudentStaticMethod(101,"esh");
		
		
		StudentMethodChange();
		
		
		StudentStaticMethod s1= new StudentStaticMethod(103,"Uma");
		StudentStaticMethod s2 = new StudentStaticMethod(104,"Preethi");
		StudentStaticMethod s3 = new StudentStaticMethod(105,"Maheswari");
		
		 s1.dispaly();
		 s2.dispaly();
		 s3.dispaly();
		 s.dispaly();
		 
		

	}

}
