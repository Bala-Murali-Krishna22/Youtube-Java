package collections_list3_Stack;

import java.util.*;

public class BooksStack extends BooksAbstract{
	Stack<String> stack1;
	Stack<String> stack2;
	Stack<String> stack3;

	@Override
	public void createList() {
		stack1=new Stack<>();
		stack2=new Stack<>();
		stack3=new Stack<>();
	}
	@Override
	public void addToList() {
		stack1.add("Telugu");

		stack2.add("Maths");
		stack2.add("Social");

		stack3.add("Science");
		stack3.add("English");
	}
	@Override
	public void push() {
		addToList();
		stack1.push("Hindi");

		stack2.push("Telugu");

		stack3.push(null);
		stack3.push("Subject");

		stack1.addAll(stack2);
		stack1.addAll(stack3);
	}
	@Override
	public void retrieveList() {
		try {
			System.out.print("Original values : ");
			for (String value : stack1) {
				System.out.print(value+" ");
			}
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		} 
	}
	@Override
	public void deletionList() {
		try {
			System.out.println("\nRemove value : "+stack1.remove(0));
			System.out.println("After removing : "+stack1);
		} catch(NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void updateList() {
		try {
			System.out.println("Update value : "+stack1.set(0, "update"));
			System.out.println("After updating : "+stack1);
			System.out.println("Get value : "+stack1.get(0));
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void verifyList() {
		try {
			System.out.println("Conatin value : "+stack1.contains("Telugu"));
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void otherMethods() {
		try {
			System.out.println("Size : "+stack1.size());
			System.out.println("Capacity : "+stack1.capacity());
			System.out.println("First element : "+stack1.firstElement());
			System.out.println("Last element : "+stack1.lastElement());
			System.out.println("Array is empty or not : "+stack1.isEmpty());
			System.out.println("Index value : "+stack1.indexOf("Telugu"));
			System.out.println("Last-index value : "+stack1.lastIndexOf("Telugu"));
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void peek() {
		try {
			System.out.println("\n\nPeek-last value : "+stack1.peek());
			System.out.println("Stack : "+stack1);
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void search() {
		try {
			System.out.println("\nSearch value : "+stack1.search("Telugu"));
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	@Override
	public void pop() {
		try {
			System.out.println("\nPop-Last value : "+stack1.pop());
			System.out.println("Stack : "+stack1);
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
}