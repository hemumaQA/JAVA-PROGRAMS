package loops;

public class InfiniteLoop {

	public static void loop() {
    //If you use two semicolons ;; in the for loop, it will be infinitive for loop.
		
		for(;;) {// (int i=5;i<=10;i++)
			System.out.println("Remain calm");
		}

}
         public static void main(String[] args) {
            loop();
}
}
