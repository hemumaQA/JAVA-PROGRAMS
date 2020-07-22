package operators;

public class AddingShort {
	public static void add(int a,int b){  
	//	short a=10;  
	//	short b=10; 
		
		a+=b;  //10+10=20
		System.out.println(a);
		
		System.out.println("a=a+b;-------cannot covert from int to short----compile time error");
		
		System.out.println("After type casting");
		a=(short)(a+b);
		System.out.println(a);
		
	}

	public static void main(String args[]){
		add(10,30);
	}
}

