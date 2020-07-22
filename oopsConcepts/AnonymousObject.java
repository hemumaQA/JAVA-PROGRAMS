package oopsConcepts;

class AnonymousObject {
	
	/*Anonymous simply means nameless. An object which has no reference is known as an anonymous object. 
	 * It can be used at the time of object creation only.
	 * If you have to use an object only once, an anonymous object is a good approach.*/
	
	/*Factorial is the operation of multiplying any natural number with all the natural numbers that are smaller than it,
	 *  giving us the mathematical definition n! = n * (n - 1) * (n - 2) * (n - 3) .... 
	 * Lastly, factorial is used for questions that ask you to find how many ways you can arrange or order a set number of things.
	 */
	
	/*A factorial is a function that multiplies a number by every number below it. 
	 * For example 5!= 5*4*3*2*1=120. The function is used, among other things, to find the number of way “n” objects can be arranged.
	 */
	
	void fact(int n) {
		int fact = 1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial  of " +n +" : " +fact);
	}
	
	
	public static void main(String[] args) {     
             new AnonymousObject().fact(5);     //new AnonymousObject---is an Anonymous object 
                                                //Calling method (fact)through an anonymous object

	}

}





