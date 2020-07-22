package oopsConcepts;


      //We can create multiple objects by one type only as we do in case of primitives.

public class Rectangle {  // MultipleObjectOneType
	int length;
	int width;
	
	void insert(int l,int w) {
		length=l;
		width = w;
		
	}
	void Area() {
		System.out.println("Area  of Rectangle " +(length*width));
	}
	
	

	public static void main(String[] args) {
		Rectangle R1 = new Rectangle (),R2 = new Rectangle ();
		// Rectangle R2 =new Rectangle ();
		
		R1.insert(10,3);
	    R2.insert(5, 4);
	    R1.Area();
	    R2.Area();

	}

}
