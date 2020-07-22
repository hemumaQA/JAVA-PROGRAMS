package oopsConcepts;

           //We can copy the values of one object into another by assigning the objects values to another object.
             //In this case, there is no need to create the constructor.

public class StudentCopyvalueswithoutconstructor {
	int id;
	String name;
	
	StudentCopyvalueswithoutconstructor(int i,String n){        //constructor(1) with parameters(parameterized)
		
		id=i;
		name=n;
	 }
	
	StudentCopyvalueswithoutconstructor(){                   //constructor(1) without parameters(default)
		
	}
	
	void display() {
		System.out.println(id+" "+name);
	}
	
	
	public static void main(String[] args) {
		
		 StudentCopyvalueswithoutconstructor s1 = new  StudentCopyvalueswithoutconstructor(103,"Uma");
		 StudentCopyvalueswithoutconstructor s2 = new  StudentCopyvalueswithoutconstructor();
		 
		 s2.id=s1.id;                //assigning value of constructor(1) id to constructor(2)
		 s2.name=s1.name;             //assigning value of constructor(1) name to constructor(2)
		 
		 s1.display();
		 s2.display();
		 
		 
		 
		 
		
		
	

	}

}
