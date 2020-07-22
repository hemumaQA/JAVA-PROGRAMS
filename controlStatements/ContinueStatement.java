package controlStatements;

public class ContinueStatement {
	/*The continue statement is used in loop control structure when you need to jump to the next iteration of the loop immediately.
	 
	  * It can be used with for loop or while loop.
	 
      *The Java continue statement is used to continue the loop. It continues the current flow of the program and skips the
       remaining code at the specified condition. In case of an inner loop, it continues the inner loop only.

      *We can use Java continue statement in all types of loops such as for loop, while loop and do-while loop.*/
	
	
	public static void loop(int n) {
		//int i=1;
		for(int i=1;i<=n;i++) {
			if(i==5) {
				continue;     //continue is used to continue the loop at the given condition
				//break;      //break is used to break the loop at the given condition
			}
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
                 loop(10);
	}

}
