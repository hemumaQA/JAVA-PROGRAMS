package ifStatements;

public class IfElseIfStatement {
	
	//The if-else-if ladder statement executes one condition from multiple statements.
	
	/*syntax
	 * if(condition1){  
   //code to be executed if condition1 is true  
   }else if(condition2){  
   //code to be executed if condition2 is true  
    }  
    else if(condition3){  
    //code to be executed if condition3 is true  
    }  
     ...  
    else{  
    //code to be executed if all the conditions are false  
    }  
	 */

	public static void status(int number) {
	  
	   if(number>0) {
		   System.out.println("Positive");
	   }
	   else if(number<0){
		   System.out.println("Negative");   
		   }
	   else {
		   System.out.println("Zero");
	   
	   
	   }
	}
	   
	   public static void main(String[] args) {
		   status(5);
	}

}
