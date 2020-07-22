package oopsConcepts;

/*The this keyword can be used to refer current class instance variable. 
 * If there is ambiguity between the instance variables and parameters,
 *  this keyword resolves the problem of ambiguity.
 **  It is better approach to use meaningful names for variables. 
 **  So we use same name for instance variables and parameters in real time, and always use this keyword.
 */

/*Real usage of this() constructor call
The this() constructor call should be used to reuse the constructor from the constructor. 
It maintains the chain between the constructors i.e. it is used for constructor chaining.
 Let's see the example given below that displays the actual use of this keyword.*/

public class ThisKeyword {
	
	int id;
	String name;
	float salary;
	
	
	ThisKeyword(int id,String name){    // 2 parametrs
    this.id=id;
    this.name=name;
   
	}
	
	ThisKeyword(int id,String name,float salary){   // 2+1 parameter
    this(id,name);	
    this.salary=salary;
    }
	
	
	 void display() {
		 System.out.println( id+" "+name+" "+salary);
	 }
	

	public static void main(String[] args) {
		ThisKeyword t= new ThisKeyword(105,"Uma");
		ThisKeyword t1= new ThisKeyword(103,"Preethi",250000f);
		 t.display();
		 t1.display();
		
	

	}

}
