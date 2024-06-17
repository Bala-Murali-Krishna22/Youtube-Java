package collections_set2_linkedHashSet;

import java.util.*;

import collections_set.SetInterface;

public class MoviesLinkedHashSet implements SetInterface{
	Set<String> linkedHashSet;
	Set<String> linkedHashSet1;
	Scanner scanner;
	
	public MoviesLinkedHashSet() {
		scanner=new Scanner(System.in);
	}

	public void createSet() {
		linkedHashSet=new LinkedHashSet<>();
		linkedHashSet1=new LinkedHashSet<>();
		System.out.println("Linked-hash-set : ");
	}

	public void addValues() {
		linkedHashSet.add("Tillu");
		linkedHashSet.add("Devara");
		linkedHashSet.add("Kalki");
		linkedHashSet.add("Pushpa");
		linkedHashSet.add("Indian-2");
		linkedHashSet.add(null);
		System.out.println("Linked-hash-set : "+linkedHashSet);
		
		linkedHashSet1.add("Robot");
		linkedHashSet1.add("Kanguva");
		linkedHashSet1.add("Animal");
		linkedHashSet1.add("Leo");
		linkedHashSet1.add("Robot");
		System.out.println("Linked-hash-set1 : "+linkedHashSet1);
		
		linkedHashSet.addAll(linkedHashSet1);
		System.out.println("After adding linked-hash-set1 in linked-hash-set : "+linkedHashSet);
	}

	public void retrieveValues() {
		System.out.println("\nOriginal linked-hash-set values : ");
			for(String values: linkedHashSet) {
				System.out.print(values+" ");
			}
	}

	public void deleteValues() {
		System.out.println("\n\nEnter delete1 value : ");
		String delete1=scanner.next();
		System.out.println("Delete "+delete1+" value : "+linkedHashSet.remove(delete1));
		
		System.out.println("Enter delete2 collection : (linkedHashSet1)");
		String delete2=scanner.next();
		System.out.println("Delete "+delete2+" values : "+linkedHashSet.remove(delete2));
		System.out.println("After deletion : "+linkedHashSet);
	}

	public void verifyValues() {
		System.out.println("\nEnter verify1 value : ");
		String verify1=scanner.next();
		System.out.println("Verify "+verify1+" value : "+linkedHashSet.contains(verify1));
		
		System.out.println("Enter verify2 value : ");
		String verify2=scanner.next();
		System.out.println("Verify "+verify2+" value : "+linkedHashSet.contains(verify2));
		
		System.out.println("Enter verify3 collection : (linkedHashSet1)");
		String verify3=scanner.next();
		System.out.println("Verify "+verify3+" values : "+linkedHashSet.containsAll(linkedHashSet1));
	}

	public void otherMethods() {
		System.out.println("\nSize of set : "+linkedHashSet.size());
		System.out.println("Is linked-hash-set empty : "+linkedHashSet1.isEmpty());
	}
	
}