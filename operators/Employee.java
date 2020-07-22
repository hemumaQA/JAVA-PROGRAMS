package operators;


public class Employee {
	

	float salary = 40000;    // instance variable???

}

class programmer extends Employee{
	int bonus=10000;    

   public static void main(String[]args) {
	   programmer  e = new programmer ();             // sub class/child class/derived class
	   System.out.println("Salary of the employee"+e.salary );
	   System.out.println("Bonusof the employee"+e.bonus );
	   
	   
	   
	   
	   
	   
	   
   }

}
