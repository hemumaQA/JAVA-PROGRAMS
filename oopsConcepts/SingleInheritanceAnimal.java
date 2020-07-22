package oopsConcepts;
/*When a class inherits another class, it is known as a single inheritance.
 *  In the example given below, Dog class inherits the SingleInheritanceAnimal class, so there is the single inheritance.*/

public class SingleInheritanceAnimal {
	void eat() {
		System.out.println("eating..");
	}

	
public static void main(String args[]) {
	SingleInheritanceAnimal s = new SingleInheritanceAnimal ();
	s.eat();
}
}



