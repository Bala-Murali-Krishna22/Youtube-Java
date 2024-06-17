package collections_set3_treeSet;

import java.util.*;
import collections_set.SetInterface;

public class BirthMonthsTreeSet implements SetInterface{
	Set<Integer> treeSet;
	Set<Integer> treeSet1;
	Scanner scanner;
	
	public BirthMonthsTreeSet() {
		scanner=new Scanner(System.in);
	}
	
	public void createSet() {
		treeSet=new TreeSet<>();
		treeSet1=new TreeSet<>();
		System.out.println("Tree-set : ");
	}

	public void addValues() {
		treeSet.add(22);
		treeSet.add(24);
		treeSet.add(21);
		treeSet.add(26);
		treeSet.add(25);
		treeSet.add(28);
		System.out.println("Tree-set : "+treeSet);
		
		treeSet1.add(5);
		treeSet1.add(45);
		treeSet1.add(10);
		treeSet1.add(7);
		treeSet1.add(18);
		treeSet1.add(22);
		treeSet1.add(19);
		System.out.println("Tree-set1 : "+treeSet1);
		
		treeSet.addAll(treeSet1);
		System.out.println("After adding tree-set1 in tree-set : "+treeSet);
	}

	public void retrieveValues() {
		System.out.print("\nOriginal tree-set values : ");
		for(Integer values: treeSet)
			System.out.print(values+" ");
	}

	public void deleteValues() {
		System.out.print("\n\nEnter delete1 value : ");
		int delete1=scanner.nextInt();
		System.out.println("Delete "+delete1+" value : "+treeSet.remove(delete1));
		
		System.out.println("Delete tree-set1 collection : "+treeSet.removeAll(treeSet1));
		System.out.println("After deletion : "+treeSet);
	}

	public void verifyValues() {
		System.out.println("\nEnter verify1 value : ");
		int verify1=scanner.nextInt();
		System.out.println("Verify "+verify1+" value : "+treeSet.contains(verify1));
		
		System.out.println("Enter verify2 value : ");
		int verify2=scanner.nextInt();
		System.out.println("Verify "+verify2+" value : "+treeSet.contains(verify2));
		
		System.out.println("Enter verify3 collection : (treeSet1)");
		String verify3=scanner.next();
		System.out.println("Verify "+verify3+" values : "+treeSet.containsAll(treeSet1));
	}

	public void otherMethods() {
		System.out.println("\nSize of set : "+treeSet.size());
		System.out.println("Is tree-set empty : "+treeSet1.isEmpty());
	}
	
}
