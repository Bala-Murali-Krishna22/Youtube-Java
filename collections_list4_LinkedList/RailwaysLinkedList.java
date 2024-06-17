package collections_list4_LinkedList;

import java.util.*;

import collections_list.ListInterface;

public class RailwaysLinkedList implements ListInterface {
	
	LinkedList<String> linkedList;
	List<String> vector;
	Stack<String> stack;
	List<String> arrayList;
	
	@Override
	public void createList() {
		linkedList=new LinkedList<>();
		vector=new Vector<>();
		stack=new Stack<>();
		arrayList=new ArrayList<>();
	}
	@Override
	public void addToList() {
		vector.add("Secunderabad");
		vector.add("Moulali");
		
		stack.add("Charlapally");
		stack.add("Warangal");
		
		arrayList.add("Dornakall");
		arrayList.add("Mahabubabad");
		arrayList.add("Dornakall");
		
		linkedList.add("Khammam");
		linkedList.add("Manuguru");
		linkedList.add("Khammam");
		
		linkedList.addAll(vector);
		linkedList.addAll(stack);
		linkedList.addAll(arrayList);
	}
	@Override
	public void retrieveList() {
		try {
			System.out.print("Original values : ");
			Iterator<String> iterator=linkedList.iterator();
			while(iterator.hasNext())
				System.out.print(iterator.next()+" "); //Using while loop
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
		}
	}
	@Override
	public void deletionList() {
		try {
			linkedList.remove();
			System.out.println("\n\nAfter removing : "+linkedList);
			linkedList.remove(0);
			System.out.println("After removing with specific index : "+linkedList);
			linkedList.removeAll(stack);
			System.out.println("After removing collection : "+linkedList);
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
		}
	}
	@Override
	public void updateList() {
		try {
			linkedList.set(0, "Bhuvanagiri");
			System.out.println("\nAfter updating value with set : "+linkedList);
			System.out.println("Get value : "+linkedList.get(1));
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
		}
	}
	@Override
	public void verifyList() {
		try {
			System.out.println("\nVerify value : "+linkedList.contains("Warangal"));
			System.out.println("Verify collections : "+linkedList.containsAll(arrayList));
		} catch (Exception e) {
			System.out.println("Exception : "+e.toString());
		}
	}
	@Override
	public void otherMethods() {
		System.out.println("\nSize : "+linkedList.size());
		System.out.println("Index of : "+linkedList.indexOf("Dornakall"));
		System.out.println("Last-ndex of : "+linkedList.lastIndexOf("Dornakall"));
		System.out.println("Empty or not : "+linkedList.isEmpty());
		System.out.println(linkedList.subList(0, 2));
	}
	
}