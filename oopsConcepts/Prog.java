package oopsConcepts;

public class Prog extends  InheritanceEmployee{
	
	/* The relationship between the two classes is Programmer IS-A Employee.
	 * Prog object can access the field of own class as well as of InheritanceEmployee class i.e. code reusability.*/
	
	int bonus=10000;
	public static void main(String[]args) {
		Prog p = new Prog();
		System.out.println("salary: "+p.salary);     // salary from parent class"InheritanceEmployee"
		System.out.println("bonus: "+p.bonus);       //bonus from child class" Prog "
	}
	

}
