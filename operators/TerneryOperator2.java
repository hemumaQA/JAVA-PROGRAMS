package operators;

public class TerneryOperator2 {
	//We can also use ternary operator (? :) to perform the task of if...else statement. 
	//It is a shorthand way to check the condition. If the condition is true, the result of ? is returned. 
	//But, if the condition is false, the result of : is returned.

	public static void num(int number){
	
		 //int number=13;    
		 String output = (number%2==0)?"even number":"odd number";  
		 System.out.println(output);
	}

	public static void main(String[] args) {
		num(24);
}
}
