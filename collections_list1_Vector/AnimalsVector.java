package collections_list1_Vector;

import java.util.*;

import collections_list.ListInterface;

public class AnimalsVector implements ListInterface{
	Vector<String> vector1;
	Vector<String> vector2;
	Vector<String> vector3;

	@Override
	public void createList() {
		vector1=new Vector<>();
		vector2=new Vector<>();
		vector3=new Vector<>();
	}

	@Override
	public void addToList() {
		vector1.add("As");
		vector1.add("Buffalo");
		vector1.add("Cat");
		vector1.add("Horse");

		vector2.add("Deer");
		vector2.add("Escolar");
		vector2.add("Frog");

		vector3.add("Goat");
		vector3.add("Horse");
		vector3.add("Indri");

		vector1.addAll(vector2);
		vector1.addAll(vector3);
	}

	@Override
	public void retrieveList() {
		try {
			//1st way to retrieve elements using object name
			System.out.println("Vector2 : "+vector2);
			System.out.println("Vector3 : "+vector3);
			System.out.println("Original Values : "+vector1+"\n");
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void deletionList() {
		try {
			vector1.remove(0); //Deleting particular value
			System.out.println("After removing element : "+vector1);
			vector1.removeAll(vector2); //Deleting total collection
			System.out.println("After removing vector2 : "+vector1+"\n");
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void updateList() {
		try {
			vector1.set(0, "Jaguar");
			System.out.println("After Set : "+vector1.get(0));
			System.out.println("After upadating : "+vector1+"\n");
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void verifyList() {
		try {
			System.out.println("Contain value : "+vector1.contains("Deer"));
			System.out.println("Contain value : "+vector2.contains("Deer")); //To know particular value is there or not
			System.out.println("Contain collection of values : "+vector1.containsAll(vector3));
			System.out.println("Contain collection of values : "+vector1.containsAll(vector2)+"\n"); //To know particular collection-value is there or not
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void otherMethods() {
		try{
			System.out.println("Size of an array : "+vector1.size());
			System.out.println("Capacity of an array : "+vector1.capacity());
			System.out.println("Index value : "+vector1.indexOf("Horse"));
			System.out.println("Last index value : "+vector1.lastIndexOf("Horse"));
			System.out.println("Retains all : "+vector1.retainAll(vector1));
			System.out.println("After retaining : "+vector1);
			System.out.println("First element : "+vector1.firstElement());
			System.out.println("Last element : "+vector1.lastElement());
			System.out.println("Array empty or not Vector1 : "+vector1.isEmpty());
			System.out.println("Array empty or not vector2 : "+vector2.isEmpty());
			//			System.out.println("Minimum value : "+Collections.min(vector1));
			//			System.out.println("Maximum value : "+Collections.max(vector1));
			//			vector1.clear();
			//			System.out.println("Clear an array : "+vector1);
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}
	/***/
	public void retrieveElementsFor() {
		//2nd way to retrieve elements using for loop
		System.out.print("Original values : ");
		for(int i=0; i<vector1.size(); i++) {
			if(i+1 == vector1.size())
				System.out.print(vector1.get(i)+"\n");
			System.out.print(vector1.get(i)+" ");
		}
	}
	public void retrieveElementsForEach() {
		//3rd way to retrieve elements using for-each loop
		System.out.print("Original values : ");
		for (String s : vector1)
			System.out.print(s+" ");
		System.out.println("\n");
	}
	public void retrieveElementsWhile() {
		//4th way to retrieve elements using while loop
		System.out.print("Original values : ");
		Iterator<String> iterator=vector1.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next()+" ");
		System.out.println("\n");
	}
	public void retrieveElementsByObject() {
		//5th way to retrieve elements using object array
		Object[] vectorArray=vector1.toArray();
		System.out.println("Original values : "+Arrays.toString(vectorArray)+"\n");
	}
	/****/
}