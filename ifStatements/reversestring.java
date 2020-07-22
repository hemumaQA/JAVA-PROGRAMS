package ifStatements;

public class reversestring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="sasi";
		String reverse="";
		int length= s.length();
		for(int i=length-1;i>=0;i--) {
			reverse=reverse+s.charAt(i);
			
		}
		System.out.println(reverse);	
	}

}
