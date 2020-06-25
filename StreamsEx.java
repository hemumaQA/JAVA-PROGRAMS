import java.util.*;
public class StreamsEx {

	public static void main(String[] args) {
		
		ArrayList<String> Ast= new ArrayList<String>();
		
		Ast.add("aa");
		Ast.add("cc");
		Ast.add("ee");
		Ast.add("bb");
		Ast.add("dd");
		
		//printing using streams
		System.out.println("printing using streams  ");
		Ast.stream().forEach(System.out::println);
		
		//sorting using streams
		System.out.println("sorting using streams ");
		Ast.stream().sorted().forEach(System.out::println);
		
		//filtering using streams
		System.out.println("filtering using streams ");
		Ast.stream().filter((var)->var.startsWith("e")).forEach(System.out::println);
		
		

		

	}

}
