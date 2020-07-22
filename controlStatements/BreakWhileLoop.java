package controlStatements;

public class BreakWhileLoop {
	
	public static void loop(int n) {
		int i=1;
		while( i<=n) {
			if (i==5) {
				i++;
				//break;//breaks the loop
				continue;
			}
			
			System.out.println(i);
			i++;
		}
	}

	/*   int i=1;  
    while(i<=10){  
        if(i==5){  
            //using break statement  
            i++;  
            break;//it will break the loop  
        }  
        System.out.println(i);  
        i++;  */
	public static void main(String[] args) {
		
                     loop(10);
	}

}
