package controlStatements;

public class BreakDoWhileLoop {
	
	public static void loop(int n) {
		int i=1;
		do{
			if(i==5) {
			 i++;
			 //break;   //will break the loop
			 continue;  //will continue the loop
		}
		System.out.println(i);	
		i++;
	}
			while( i<=n);
        
				
			}
		
	/*int i=1;  
    //do-while loop  
    do{  
        if(i==5){  
           //using break statement  
           i++;  
           break;//it will break the loop  
        }  
        System.out.println(i);  
        i++;  
    }while(i<=10);  */
	
	public static void main(String[] args) {
	        loop(10);

	}

}
