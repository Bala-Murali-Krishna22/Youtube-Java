package collections_lists_Assignments;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class ListsAssignments1 {
	//	###1
	public void sumAverage(Scanner scanner) {
		Vector<Integer> vector=new Vector<>();

		int sum=0; int average=0;
		System.out.println("Enter the elements : ");
		for(int i=0; i<6; i++) {
			vector.add(scanner.nextInt()); //4 5 0 9 8 10
		}

		for(int i=0; i<vector.size(); i++) {
			sum+=vector.get(i);
			average=sum/vector.size();
		}
		System.out.println("Sum of an array : "+sum);
		System.out.println("Average of an array : "+average);
	}
	//	###2
	public void sumOfEvenNumbers() {
		ArrayList<Integer> arrayList=new ArrayList<>();
		arrayList.add(4);
		arrayList.add(5);
		arrayList.add(0);
		arrayList.add(9);
		arrayList.add(8);
		arrayList.add(10);

		int evenSum=0; int oddSum=0;
		for(int i=0; i<arrayList.size(); i++) {
			if(arrayList.get(i)%2==0) {
				evenSum+=arrayList.get(i);
			} else{
				oddSum+=arrayList.get(i);
			}
		}
		System.out.println("Sum of EVEN numbers in an array : "+evenSum);
		System.out.println("Sum of ODD numbers in an array : "+oddSum);
	}
	//	###3
	public void splitList(Scanner scanner) {
		LinkedList<Integer> linkedList=new LinkedList<>();

		System.out.println("Enter the elements : ");
		for(int i=0; i<6; i++) {
			linkedList.add(scanner.nextInt()); //4 5 0 9 8 10
		}

		System.out.println("List1 : "+linkedList.subList(0, 3));
		System.out.println("List2 : "+linkedList.subList(3, 6));
	}
	//	###4
	public void mergeList(Scanner scanner) {
		Stack<Integer> stack1=new Stack<>();
		Stack<Integer> stack2=new Stack<>();

		System.out.println("Enter stack-1 elements : ");
		for(int i=0; i<3; i++) {
			stack2.add(scanner.nextInt());
		}

		stack1.addAll(stack2);
		System.out.println("Merge Lists 1-2 : "+stack1);
	}
	//	###5
	public void repeatedOrDuplicateValues() {
		List<String> vector=new Vector<>();
		vector.add("Baby");
		vector.add("Ball");
		vector.add("Soap");
		vector.add("Baby");
		vector.add("Shampoo");
		vector.add("Chalk");
		vector.add("Soap");
		vector.add("Makeup");
		vector.add("Baby");
		vector.add("Lotion");
		System.out.println("List : "+vector);

		for(int i=0; i<vector.size(); i++) {
			String value=vector.get(i);
			String temp=value;
			int count=0;
			for(int j=i; j<vector.size();j++) {
				if(temp.contains(vector.get(j))) {
					if(count>0) {
						vector.remove(j);
					}
					count++;
				}
			}
			if(count>1) {
				System.out.println(temp+" - "+count);
			}
		}
	}
	//	###6
	public void highInDuplicate() {
		List<Integer> arrayList=new ArrayList<>();
		List<Integer> arrayList2=new ArrayList<>();

		arrayList.add(4);
		arrayList.add(1);
		arrayList.add(9);
		arrayList.add(4);
		arrayList.add(8);
		arrayList.add(0);
		arrayList.add(5);
		arrayList.add(8);
		arrayList.add(1);
		arrayList.add(8);
		arrayList.add(6);
		System.out.println("List : "+arrayList);

		for(int i=0; i<arrayList.size(); i++) {
			int value=arrayList.get(i);
			int temp=value; int count=0;
			for(int j=i; j<arrayList.size(); j++) {
				if(temp==arrayList.get(j)) {
					if(count>0) {
						arrayList2.add(temp);
						arrayList.remove(j);
					}
					count++;
				}
			}
		}
		System.out.println("List-2 : "+arrayList2);
		//		System.out.println("High value in a duplicates : "+Collections.max(arrayList2)); //Using in-built method
		int max=arrayList2.get(0);
		for(int i=0; i<arrayList2.size(); i++) {
			if(max<arrayList2.get(i)) {
				max=arrayList2.get(i);
			}
		}
		System.out.println("High value in a duplicates : "+max);
	}
	//	###7
	public void deleteDuplicates() {
		List<Integer> linkedList=new LinkedList<>();
		List<Integer> linkedList2=new LinkedList<>();
		linkedList.add(4);
		linkedList.add(1);
		linkedList.add(9);
		linkedList.add(4);
		linkedList.add(8);
		linkedList.add(0);
		linkedList.add(5);
		linkedList.add(1);
		linkedList.add(8);
		linkedList.add(6);
		System.out.println("List : "+linkedList);

		for(int i=0; i<linkedList.size(); i++) {
			int count=0;
			for(int j=i; j<linkedList.size(); j++) {
				if(linkedList.get(i).equals(linkedList.get(j))) {
					if(count>0) {
						linkedList2.add(linkedList.get(j));
						linkedList.remove(j);
					}
					count++;
				}
			}
		}
		System.out.println("List-2 : "+linkedList2);
		linkedList.removeAll(linkedList2);
		System.out.println("After removing duplicates : "+linkedList);
	}
//	###8
	public void commonElements() {
		List<Integer> stack=new Stack<>();
		List<Integer> stack2=new Stack<>();
		List<Integer> stackOutput=new Stack<>();
		stack.add(4);
		stack.add(9);
		stack.add(8);
		stack.add(5);
		System.out.println("List-1 : "+stack);
		
		stack2.add(1);
		stack2.add(8);
		stack2.add(0);
		stack2.add(5);
		stack2.add(1);
		stack2.add(6);
		System.out.println("List-2 : "+stack2);
		
		for(int i=0; i<stack.size(); i++) {
			for(int j=0; j<stack2.size(); j++) {
				if(stack.get(i)==stack2.get(j)) {
					stackOutput.add(stack.get(i));
				}
			}
		}
		System.out.println("Common elements : "+stackOutput);
	}
//	###
}