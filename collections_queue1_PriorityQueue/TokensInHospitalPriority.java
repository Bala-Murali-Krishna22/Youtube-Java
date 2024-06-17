package collections_queue1_PriorityQueue;

import java.util.*;
import java.util.Scanner;

import collections_queue.QueueInterface;

public class TokensInHospitalPriority implements QueueInterface{
	
	Scanner scanner;
	Queue<Integer> priorityQueue;
	Queue<Integer> priorityQueue1;
	
	public TokensInHospitalPriority() {
		scanner=new Scanner(System.in);
	}
	
	public void createQueue() {
//		priorityQueue=new PriorityQueue<>(Collections.reverseOrder()); //Gives priority high to low
//		priorityQueue1=new PriorityQueue<>(Collections.reverseOrder());
		priorityQueue=new PriorityQueue<>(); ////By default it gives priority low to high
		priorityQueue1=new PriorityQueue<>();
		System.out.println("Priority Queue : ");
	}

	public void additionOfQueue() {
		priorityQueue.offer(8);
		priorityQueue.add(2);
		priorityQueue.offer(9);
		priorityQueue.add(4);
		priorityQueue.offer(6);
		priorityQueue.offer(6);
//		priorityQueue.offer(null); //Not allow duplicates values
		
		priorityQueue1.add(3);
		priorityQueue1.offer(5);
		priorityQueue1.add(10);
		priorityQueue1.offer(7);
		priorityQueue1.add(1);
		
		System.out.println("Priority-Queue : "+priorityQueue);
		System.out.println("Priority-Queue1 : "+priorityQueue1);
		priorityQueue.addAll(priorityQueue1);
		System.out.println("After adding queue1 and queue2 : "+priorityQueue);
	}

	public void retrievalOfQueue() {
		System.out.println("\nOriginal priority-queue values : ");
//		while(!priorityQueue.isEmpty()) {
//			System.out.print(priorityQueue.poll()+" ");
//		}
		for (Integer value : priorityQueue) {
			System.out.print(value+" ");
		}
	}

	public void deletionOfQueue() {
		System.out.println("\n\nEnter the delete value1 : ");
		int value1=scanner.nextInt();
		System.out.println("Delete "+value1+" value : "+priorityQueue.remove(value1));
		
		int value2=priorityQueue.remove();
		System.out.println("Delete "+value2+" value : "+value2);
		
		int value3=priorityQueue.poll();
		System.out.println("Delete "+value3+" value : "+value3);
		System.out.println("After deletion : "+priorityQueue);
	}

	public void verificationOfQueue() {
		System.out.println("\nVerify the value1 : ");
		int value1=scanner.nextInt();
		System.out.println("Verify "+value1+" value : "+priorityQueue.contains(value1));
		
		System.out.println("Verify the value2 : ");
		int value2=scanner.nextInt();
		System.out.println("Verify "+value2+" value : "+priorityQueue.contains(value2));
		System.out.println("Verify "+priorityQueue1+" values : "+priorityQueue.containsAll(priorityQueue1));
		System.out.println("After verification : "+priorityQueue);
	}
	
	public void otherMethods() {
		System.out.println("\nSize of queue : "+priorityQueue.size());
		System.out.println("Is Priority queue empty : "+priorityQueue.isEmpty());
		System.out.println("Show head value of queue : "+priorityQueue.peek());
		System.out.println(priorityQueue.retainAll(priorityQueue1)+" "+priorityQueue);
	}

}