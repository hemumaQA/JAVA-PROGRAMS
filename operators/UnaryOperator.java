package operators;

public class UnaryOperator {
	/*The Java unary operators require only one operand. Unary operators are used to perform various operations i.e.:

	incrementing/decrementing a value by one
	negating an expression*/
	 

	public static void display(int x) {
		//int x=10;
		System.out.println(x++);//10 -(x value now 11 )-----print x then increment+1(postfix)
		System.out.println(x--);//11 -(x value now 10 )-----print x then decrement-1(postfix)
		System.out.println(++x);//11 - (x value now 11 )-----increment x+1 and then print x
		System.out.println(--x);//10 - (x value now 10 )-----decrement x-1 and then print x
		
		System.out.println(x++ + ++x);//10(11)+(1+11)12=(22)
	}


public static void main(String[] args) {
	display(10);
}
}
