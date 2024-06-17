package collections_queue3_ArrayList;

import java.util.*;
import java.util.Scanner;

import collections_queue.QueueInterface;

public class RanksLinkedList implements QueueInterface{
	
	Scanner scanner;
	Deque<Integer> linkedList;
	Deque<Integer> linkedList1;
	
	public RanksLinkedList() {
		scanner=new Scanner(System.in);
	}
	
	public void createQueue() {
		linkedList=new LinkedList<>();
		linkedList1=new LinkedList<>();
		System.out.println("Linked-list In Queue : ");
	}

	public void additionOfQueue() {
		linkedList.add(115);
		linkedList.addFirst(95);
		linkedList.addLast(83);
		linkedList.offer(105);
		linkedList.offerFirst(75);
		linkedList.offerLast(64);
		linkedList.add(1);
		linkedList.addFirst(3);
		linkedList.addLast(5);
		linkedList.offer(7);
		linkedList.offerFirst(9);
		linkedList.offerLast(11);
		System.out.println("Linked-list Deque : "+linkedList);
		
		linkedList1.add(20);
		linkedList1.addFirst(40);
		linkedList1.addLast(30);
		linkedList1.offer(50);
		linkedList1.offerFirst(10);
		linkedList1.offerLast(60);
		linkedList1.add(2);
		linkedList1.addFirst(4);
		linkedList1.addLast(6);
		linkedList1.offer(8);
		linkedList1.offerFirst(12);
		linkedList1.offerLast(13);
		System.out.println("Linked-list Deque1 : "+linkedList1);
		
		linkedList.addAll(linkedList1);
		System.out.println("After adding linked-list1 in linked-list : "+linkedList);
	}

	public void retrievalOfQueue() {
		System.out.println("\nOriginal values linked-list : ");
		for(Integer values: linkedList) {
			System.out.print(values+" ");
		}
	}

	public void deletionOfQueue() {
		System.out.println("\n\nEnter the delete value1 : ");
		int value1=scanner.nextInt();
		System.out.println("Delete "+value1+" value : "+linkedList.remove(value1));
		
		int value2=linkedList.removeFirst();
		System.out.println("Delete "+value2+" value : "+value2);
		
		int value3=linkedList.removeLast();
		System.out.println("Delete "+value3+" value : "+value3);
		
		int value4=linkedList.remove();
		System.out.println("Delete "+value4+" value : "+value4);
		
		int value5=linkedList.poll();
		System.out.println("Delete "+value5+" value : "+value5);
		
		int value6=linkedList.pollFirst();
		System.out.println("Delete "+value6+" value : "+value6);
		
		int value7=linkedList.pollLast();
		System.out.println("Delete "+value7+" value : "+value7);
		
		System.out.println("Delete "+linkedList1+" values : "+linkedList.removeAll(linkedList1));
		
		System.out.println("After deletion : "+linkedList);
	}

	public void verificationOfQueue() {
		System.out.println("\nEnter the verify value1 : ");
		int value1=scanner.nextInt();
		System.out.println("Verify "+value1+" value : "+linkedList.contains(value1));
		
		System.out.println("Enter the verify value2 : ");
		int value2=scanner.nextInt();
		System.out.println("Verify "+value2+" value : "+linkedList.contains(value2));
		
		System.out.println("Verify "+linkedList1+" values : "+linkedList.containsAll(linkedList1));
	}

	public void otherMethods() {
		System.out.println("\nSize of Queue : "+linkedList.size());
		System.out.println("Show head value : "+linkedList.peek());
		System.out.println("Is array-deque empty : "+linkedList.isEmpty());
		System.out.println(!linkedList.retainAll(linkedList1)+" "+linkedList);
	}
	
}
