package oopsConcepts;

public class StudentCopyConstructor {
	
	int id;
	String name;
	
	StudentCopyConstructor(int d,String n){                     ////value of constructor (1)
		id=d;
		name=n;
		}
	StudentCopyConstructor(StudentCopyConstructor s){          //value of constructor (1)  is copied to constructor (2)
		id=s.id;
		name=s.name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	
	public static void main(String[] args) {
		StudentCopyConstructor sc1 = new StudentCopyConstructor(103,"Uma");       //value of constructor (1)
		StudentCopyConstructor sc2 =  new StudentCopyConstructor(sc1);            //value of constructor (1)  is copied to constructor (2)
		
		sc1.display(); 
		
		sc2.display();
		

}
	
}
