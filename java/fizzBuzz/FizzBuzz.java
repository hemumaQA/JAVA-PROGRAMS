package fizzBuzz;

public class FizzBuzz {
	
	public static  String getResult(int n) {
			
			if(n%3==0) {
				return "Fizz";
				
			}
			else if(n%5==0) {
				return "Buzz";
			}
			else if(n%3==0 && n%5==0){
				return "FizzBuzz";
				
			}
	
			else {
				return"" + n;
			}
	}
		
		
		//public static void main(String[]args) {
			
			//getResult(30);
		}
		
		




