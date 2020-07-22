package loops;

public class WhileLoop {
	/*The Java while loop is used to iterate a part of the program several times.
	If the number of iteration is not fixed, it is recommended to use while loop.*/

	public static void loop(int n) {
	  int i=1;
	  while(i<=n) {
	  System.out.println(i);
	  i++;
	  }

	}
	public static void main(String[] args) {
               loop(10);
}
}
