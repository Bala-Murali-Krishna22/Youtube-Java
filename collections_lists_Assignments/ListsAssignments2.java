package collections_lists_Assignments;

import java.util.*;

public class ListsAssignments2 {
	//	###1
	public void createPrimeNumbersList(Scanner scanner) {
		List<Integer> vector=new Vector<>();
		System.out.print("Enter input for prime-numbers : ");
		int input=scanner.nextInt();
		
		for(int i=1; i<=input; i++) {
			int count=0;
			for(int j=1; j<=i; j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==2) {
				vector.add(i);
			}
		}
		System.out.println("Prime numbers upto number : "+vector);
	}
	//	###2
	public void printListInConsole(Scanner scanner) {
		List<Integer> arrayList=new ArrayList<>();
		System.out.print("Enter the length of an array-list : ");
		
		int length=scanner.nextInt();
		for(int i=0; i<length; i++) {
			arrayList.add(scanner.nextInt());
		}
		System.out.println("List in the console : "+arrayList);
	}
//	###3
	public void deleteFromList1ToList2() {
		List<Integer> vector=new Vector<>();
		vector.add(4);
		vector.add(9);
		vector.add(8);
		
		List<Integer> vector2=new Vector<>();
		vector2.add(4);
		vector2.add(1);
		vector2.add(9);
		vector2.add(4);
		vector2.add(8);
		vector2.add(0);
		vector2.add(5);
		vector2.add(1);
		vector2.add(8);
		vector2.add(6);
		
		System.out.println("List-1 array : "+vector);
		System.out.println("List-2 array : "+vector2);
		
		for(int i=0; i<vector.size(); i++) {
			for(int j=0; j<vector2.size(); j++) {
				if(vector.get(i)==vector2.get(j)) {
					vector2.remove(j);
				}
			}
		}
		System.out.println("Delete elements form list-1 to list-2 : \n"+vector2);
	}
//	###4
	public void posiotionOfElement(Scanner scanner) {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(1);
		arrayList.add(8);
		arrayList.add(0);
		arrayList.add(5);
		arrayList.add(1);
		arrayList.add(6);
		
		System.out.print("Enter the value to find position : ");
		int value=scanner.nextInt();
		
		for(int i=0; i<arrayList.size(); i++) {
			if(value==i+1) {
				System.out.println(arrayList.get(i));
			}
		}
	}
//	###5
	public void reverseList() {
		List<Integer> stack=new Stack<>();
		stack.add(1);
		stack.add(8);
		stack.add(0);
		stack.add(5);
		stack.add(1);
		stack.add(6);
		System.out.println("List array : "+stack);
		
		List<Integer> stackReverse=new Stack<>();
		
		for(int i=stack.size(); i>0; i--) {
			stackReverse.add(stack.get(i-1));
		}
		System.out.println("List array reverse : "+stackReverse);
	}
//	###6
	public void ascendingDescendingOrder() {
		Integer[] list=new Integer[] {4,1,9,4,8,0,5,8,1,8,6};
		List<Integer> linkedList=Arrays.asList(list);
		System.out.println("List : "+linkedList);
		
		//Ascending order
		for(int i=0; i<linkedList.size(); i++) {
			for(int j=0; j<linkedList.size(); j++) {
				if(linkedList.get(i)<linkedList.get(j)) {
					int temp=linkedList.get(j);
					linkedList.set(j, linkedList.get(i));
					linkedList.set(i, temp);
				}
			}
		}
		System.out.println("Ascending order : "+linkedList);
		
		//Descending order
		for(int i=0; i<linkedList.size(); i++) {
			for(int j=0; j<linkedList.size(); j++) {
				if(linkedList.get(i)>linkedList.get(j)) {
					int temp=linkedList.get(j);
					linkedList.set(j, linkedList.get(i));
					linkedList.set(i, temp);
				}
			}
		}
		System.out.println("Descending order : "+linkedList);
	}
//	###7
	public void nonRepeatingCharacter(Scanner scanner) {
		Integer[] list=new Integer[] {4,1,9,4,8,0,5,8,1,8,6};
		List<Integer> vector=new Vector<>(Arrays.asList(list));
		System.out.println("List : "+vector);
		
		System.out.print("Enter the Nth of non-repeating character : ");
		int charc=scanner.nextInt();
		int nonRepeat=1;
		
		for(int i=0; i<vector.size(); i++) {
			int count=0;
			for(int j=0; j<vector.size(); j++) {
				if(vector.get(i)==vector.get(j)) {
					count++;
				}
			}
			if(count==1) {
				if(nonRepeat==charc) {
					System.out.println(vector.get(i));
				}
				nonRepeat++;
			}
		}
		
	}
//	###
}