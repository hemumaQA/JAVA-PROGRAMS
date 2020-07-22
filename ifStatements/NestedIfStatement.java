package ifStatements;

public class NestedIfStatement {
  /*
   The nested if statement represents the if block within another if block. 
   Here, the inner if block condition executes only when outer if block condition is true.
   Syntax
   if(condition){    
     //code to be executed    
          if(condition){  
             //code to be executed    
    }    
    }  
   */

  public static void vote(int age,int weight) {
		 //int age = 25;
		// int weight = 45;
		 if(age>18)
			 if(weight>=30){
			 System.out.println("You are eligible");
			 }
			 else {
				 System.out.println("You are not eligible");
				 }
		     else {
		    	 System.out.println("Age must be greater than 18");
		 }
		

	}
            public static void main(String[] args) {
            	vote(25,45);
            }
            
            }


