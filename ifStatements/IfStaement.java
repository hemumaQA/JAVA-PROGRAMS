package ifStatements;

public class IfStaement {
         // if statement tests the condition. It executes the if block if condition is true.

	public static void vote(int age) {
		//int age=20;
	  if(age>18) {
		  System.out.println("it is eligible");
	  }

	}
          public static void main(String[] args) {
                   vote(20);
}
}
