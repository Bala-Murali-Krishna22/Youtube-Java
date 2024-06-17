package collections_queue2_Deque;

import java.util.*;
import java.util.Scanner;

import collections_queue.QueueInterface;

public class FruitsArrayDeque implements QueueInterface{
	
	Scanner scanner;
	Queue<String> arrayDeque;
	Queue<String> arrayDeque1;
	
	public FruitsArrayDeque() {
		scanner=new Scanner(System.in);
	}
	
	public void createQueue() {
		arrayDeque=new ArrayDeque<>();
		arrayDeque1=new ArrayDeque<>();
		System.out.println("Array arraydeque : ");
	}
	
	public void additionOfQueue() {
		arrayDeque.add("Cherry");
		arrayDeque.offer("Dates");
		arrayDeque.add("Grapes");
		arrayDeque.offer("Guava");
		arrayDeque.add("Mango");
		arrayDeque.offer("Apple");
		System.out.println("Array-arraydeque : "+arrayDeque);
		
		arrayDeque1.add("Berries");
		arrayDeque1.offer("Banana");
		arrayDeque1.add("Kiwi");
		arrayDeque1.offer("Nuts");
		arrayDeque1.add("Orange");
		arrayDeque1.offer("Pomegranate");
		System.out.println("Array-arraydeque1 : "+arrayDeque1);
		
		arrayDeque.addAll(arrayDeque1);
		System.out.println("After adding Array-arraydeque1 in Array-arraydeque : "+arrayDeque);
	}
	
	public void retrievalOfQueue() {
		System.out.println("\nOriginal Array-arraydeque values : ");
		for(String values: arrayDeque) {
			System.out.print(values+" ");
		}
	}
	
	public void deletionOfQueue() {
		System.out.println("\n\nEnter the delete value1 : ");
		String value1=scanner.next();
		System.out.println("Delete "+value1+" value : "+arrayDeque.remove(value1));
		
		String value2=arrayDeque.remove();
		System.out.println("Delete "+value2+" value : "+value2);
		
		String value3=arrayDeque.poll();
		System.out.println("Delete "+value3+" value : "+value3);
		
		System.out.println("After deletion : "+arrayDeque);
	}
	
	public void verificationOfQueue() {
		System.out.println("\nEnter the verify value1 : ");
		String value1=scanner.next();
		System.out.println("Verify "+value1+" value : "+arrayDeque.contains(value1));
		
		System.out.println("Enter the verify value2 : ");
		String value2=scanner.next();
		System.out.println("Verify "+value2+" value : "+arrayDeque.contains(value2));
		
		System.out.println("Verify "+arrayDeque1+" values : "+arrayDeque.containsAll(arrayDeque1));
	}
	
	public void otherMethods() {
		System.out.println("\nSize of Queue : "+arrayDeque.size());
		System.out.println("Show head value : "+arrayDeque.peek());
		System.out.println("Is array-deque empty : "+arrayDeque.isEmpty());
		System.out.println(arrayDeque.retainAll(arrayDeque1)+" "+arrayDeque);
	}
	
}
