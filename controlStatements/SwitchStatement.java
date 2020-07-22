package controlStatements;

public class SwitchStatement {
	
	
	
	
	/*The Java switch statement executes one statement from multiple conditions.
	 * There can be one or N number of case values for a switch expression.
    *The case value must be of switch expression type only. The case value must be literal or constant. It doesn't allow variables.
    *The case values must be unique. In case of duplicate value, it renders compile-time error.
    *The Java switch expression must be of byte, short, int, long (with its Wrapper type), enums and string.
    *Each case statement can have a break statement which is optional. When control reaches to the break statement,
       it jumps the control after the switch expression. If a break statement is not found, it executes the next case.
    *The case value can have a default label which is optional.*/
	
	
	

	 public static void num (int number) {
	 //int number=50;
	  switch (number) {
	  case 10:
		  System.out.println("10");
		  break;
	  case 30:
		  System.out.println("30");
	  break;
	  case 50:
		  System.out.println("50");
	  break;
	  default:
			  System.out.println("numberis not present");
	  }
	 }
	  public static void main(String[] args) {
		   num(50);     // displays only that case
		  
		  
		  
		/*int number=20;  
	    //switch expression with int value  
	    switch(number){  
	    //switch cases without break statements  
	    case 10: System.out.println("10");  
	    case 20: System.out.println("20");  
	    case 30: System.out.println("30");  
	    default:System.out.println("Not in 10, 20 or 30");  
	    }  */
	}  
	}
//Java allows us to use four wrapper classes: Byte, Short, Integer and Long in switch statement.

	

	

