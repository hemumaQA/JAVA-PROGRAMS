package operators;

public class TernaryOperator {
	//Ternary operator is used as one liner replacement for if-then-else statement and used a lot in Java programming.
	//it is the only conditional operator which takes three operands.
	

	public static void display(int a,int b) {
		//int a=2;  
		//int b=5;  
		int min =(a<b)?a:b;
	    System.out.println(min);
	    
	    int min1 =(a>b)?a:b;
	    System.out.println(min1);

	}


	public static void main(String[] args) {
       display(2,3);
	}
}

