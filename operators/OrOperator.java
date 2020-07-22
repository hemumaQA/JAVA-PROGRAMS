package operators;
            
public class OrOperator {
	                  //doubt

	public static void display(int a,int b,int c) {
		//int a=10;  
		//int b=5;  
		//int c=20;
		
		// The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false
		
		System.out.println(a<b || a<c); //false || true =  true
		System.out.println(a>b || a<c);// true  || true =  true
		System.out.println(a>b || a>c); //true  || false = true
		System.out.println(a<b || a>c); //false || false = false
		
		//The bitwise | operator always checks both conditions whether first condition is true or false
		System.out.println("***********");
		System.out.println(a<b | a<c); //false || true =  true
		System.out.println(a>b | a<c);// true  || true =  true
		System.out.println(a>b | a>c); //true  || false = true
		System.out.println(a<b | a>c); //false || false = false
	}
	public static void main(String[] args) {
		display(10,3,24);
	}
}
