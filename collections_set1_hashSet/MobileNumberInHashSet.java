package collections_set1_hashSet;

import java.util.Scanner;
import java.util.*;

import collections_set.SetInterface;

public class MobileNumberInHashSet implements SetInterface{
	Set<Integer> hashSet;
	Set<Integer> hashSet1;
	Scanner scanner;
	
	public MobileNumberInHashSet() {
		scanner=new Scanner(System.in);
	}
	
	public void createSet() {
		hashSet=new HashSet<>();
		hashSet1=new HashSet<>();
		
		System.out.println("Hash-set : ");
	}
	
	public void addValues() {
		hashSet.add(8);
		hashSet.add(4);
		hashSet.add(6);
		hashSet.add(5);
		hashSet.add(9);
		System.out.println("Hash-set : "+hashSet);
		
		hashSet1.add(1);
		hashSet1.add(3);
		hashSet1.add(2);
		hashSet1.add(4);
		hashSet1.add(9);
		System.out.println("Hash-set1 : "+hashSet1);
		
		hashSet.addAll(hashSet1);
		System.out.println("After adding hash-set1 in hash-set : "+hashSet);
	}
	
	public void retrieveValues() {
		System.out.println("\nOriginal hash-set values : ");
		for(Integer values: hashSet) {
			System.out.print(values+" ");
		}
	}
	
	public void deleteValues() {
		System.out.println("\n\nEnter the delete1 value : ");
		int delete1=scanner.nextInt();
		System.out.println("Delete "+delete1+" value : "+hashSet.remove(delete1));
		
		System.out.println("Enter the delete collection : (hashSet1)");
		String deleteCollection=scanner.next();
		System.out.println("Delete "+deleteCollection+" collection : "+hashSet.removeAll(hashSet1));
		
		System.out.println("After deletion : "+hashSet);
	}
	
	public void verifyValues() {
		System.out.println("\nEnter the verify1 value : ");
		int verify1=scanner.nextInt();
		System.out.println("Verify "+verify1+" value : "+hashSet.contains(verify1));
		
		System.out.println("Enter the verify2 value : ");
		int verify2=scanner.nextInt();
		System.out.println("Verify "+verify2+" value : "+hashSet.contains(verify2));
		
		System.out.println("Enter the verify collection : (hashSet1)");
		String verifyCollection=scanner.next();
		System.out.println("Verify "+verifyCollection+" values : "+hashSet.containsAll(hashSet1));
	}
	
	public void otherMethods() {
		System.out.println("\nCapacity of set : "+hashSet.size());
		System.out.println("Is hash-set empty : "+hashSet.isEmpty());
	}
	
}