package loops;

public class NestedForLoop {
	//If we have a for loop inside the another loop, it is known as nested for loop. 
	//The inner loop executes completely whenever outer loop executes.


    public static void loop() {
		aa:
	 for(int i=1;i<=3;i++) {
		 bb:
		 for(int j=1;j<=3;j++) {
			 System.out.println(i+" "+j);
			// break bb;    //If you use break bb;, it will break inner loop only which is the default behavior of any loop.
		 }
	 }
	 }
            public static void main(String[] args) {
            	loop();
	}

}
