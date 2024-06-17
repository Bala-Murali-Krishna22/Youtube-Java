package collections_list2_ArrayList;

import java.util.*;

import collections_list.ListInterface;

public class NumbersArrayList implements ListInterface{

	ArrayList<Integer> arrayList1;
	ArrayList<Integer> arrayList2;
	ArrayList<Integer> arrayList3;

	@Override
	public void createList() {
		arrayList1=new ArrayList<>();
		arrayList2=new ArrayList<>();
		arrayList3=new ArrayList<>();
	}

	@Override
	public void addToList() {
		arrayList1.add(8);
		arrayList1.add(9);
		arrayList1.add(10);

		arrayList2.add(11);
		arrayList2.add(12);
		arrayList2.add(13);
		arrayList2.add(14);

		//		arrayList3.add(null);
		arrayList3.add(4);
		//		arrayList3.add(null);
		arrayList3.add(15);

		arrayList1.addAll(arrayList2);
		arrayList1.addAll(arrayList3);
	}

	@Override
	public void retrieveList() {
		try {
			System.out.print("Original values : ");
			for(int i=0; i<arrayList1.size(); i++) {
				if(i+1 == arrayList1.size())
					System.out.print(arrayList1.get(i)+"\n");
				else System.out.print(arrayList1.get(i)+" ");
			}
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void deletionList() {
		try {
			arrayList1.remove(0);
			System.out.println("After removing element : "+arrayList1);
			arrayList1.removeAll(arrayList2);
			System.out.println("After removing no.Of elements : "+arrayList1+"\n");
			//			arrayList1.clear();
			//			System.out.println("After clearing an array : "+arrayList1);
		} catch (NullPointerException npe) {
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void updateList() {
		try{
			arrayList1.set(0, 0);
			arrayList1.set(7, 7);
			System.out.println("After get data : "+arrayList1.get(0)+", "+arrayList1.get(7));
			System.out.println("After updating data : "+arrayList1+"\n");
		} catch(Exception e){
			System.out.println("Exception : "+e.toString());
		}
	}

	@Override
	public void verifyList() {
		try {
			System.out.println("Checking single data : "+arrayList1.contains(3));
			System.out.println("Checking collection data : "+arrayList1.containsAll(arrayList2)+"\n");
		} catch(NullPointerException npe){
			System.out.println("Exception : "+npe.toString());
		}
	}

	@Override
	public void otherMethods() {
		try {
			System.out.println("Size : "+arrayList1.size());
			System.out.println("Index of num : "+arrayList1.indexOf(7));
			System.out.println("Last index of num : "+arrayList1.lastIndexOf(7));
			System.out.println("Sub list in an array : "+arrayList1.subList(7, 11));
			System.out.println("Minimum value : "+Collections.min(arrayList1));
			System.out.println("Maximum value : "+Collections.max(arrayList1));
		} catch(Exception e){
			System.out.println("Exception : "+e.toString());
		}
	}

}