   //Write a program print "fizz" if a number is divisible by 3,
		//"buzz" if a number is divisible by 5, and "fizz buzz" if number is divisible by both,
		//else print the number.  

public class FizzBzz {
     
		
		public static  int buzzfizz(int n) {
			
			if(n%3==0) {
				System.out.println("Fizz");
				
			}
			if(n%5==0) {
				System.out.println("Buzz");
			}
			if(n%3==0 && n%5==0){
				System.out.println("FizzBuzz");
				
			}
			else {
				System.out.println(n);
			}
	        return n;
		}
		
		public static void main(String[]args) {
			
			 buzzfizz(30);
		}
		
		}

