package oopsConcepts;

public class DefaultConstructor {
	
	//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type.
	
	//Rule: If there is no constructor in a class, compiler automatically creates a default constructor.
	
	
	
	int id;
	String name;
	
	void display() {
		System.out.println(id +" "+name);
	}
	

	public static void main(String[] args) {
		DefaultConstructor dc1 = new DefaultConstructor();
		DefaultConstructor dc2 = new DefaultConstructor();
		
		

		//dc1.id=103;           //reference type
		//dc1.name="Uma";
		//dc2.id=105;
		//dc2.name="Preethi";
		
		
		dc1.display();
		dc2.display();

	}

}
