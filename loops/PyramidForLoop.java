package loops;

public class PyramidForLoop {
	//If we have a for loop inside the another loop, it is known as nested for loop.
	//The inner loop executes completely whenever outer loop executes.
      public static void star(int n) {
	
		for( int i=1;i<=n;i++) {
		 
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			
		System.out.println();//new line
		}
      }

	public static void main(String[] args) {
		star(5);

	}
}

		
		
		
//upside down pyramid
/*int k=6;
for(int i=1;i<=k;i++) {
	for(int j=k;j>=i;j--) {
		System.out.print("* ");
	}
System.out.println();//new line
}

}
}*/



