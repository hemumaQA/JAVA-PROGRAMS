package controlStatements;

public class BreakInnerLoop {
	public static void loop(int n) {
		
		for(int i=1;i<=n;i++) {
			
			//System.out.println(i);
			//inner loop
			for(int j=1;j<=n;j++) {
				if(i==2 && j==2) {
				
					//break;   ----------how????????
					continue;   //------------how?????
					//System.out.println(j);
			}
				System.out.println(i+" "+j);	
			}
		
	}
	}
		/* for(int i=1;i<=3;i++){    
                    //inner loop  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement inside the inner loop  
                            break;    
                        }    
                        System.out.println(i+" "+j);    
                    }
	 }
	}*/
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
	       loop(3);

	}

}





/*1 1
1 2
1 3
2 1
3 1
3 2
3 3*/
