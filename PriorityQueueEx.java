import java.util.*;

public class PriorityQueueEx {
	

	public static void main(String[] args) {
		
		PriorityQueue<String>Pq=new PriorityQueue<String>();
		Pq.add("A");
		Pq.add("B");
		Pq.add("C");
		Pq.add("D");
		Pq.add("E");
		
		
		
		for(String s:Pq) {
			System.out.println("Elements in Priority Queue "+s);
		}
		
		System.out.println("Queue head "+Pq.poll()); //-------prints the head and deletes
		
		for(String s:Pq) {
			System.out.println(s);
		}
		
		
		//System.out.println("head "+Pq.element());
		//System.out.println("head "+Pq.peek());
		
		//Pq.remove();         //---removes the first element A
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
