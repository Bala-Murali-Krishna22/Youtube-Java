package collections_LIE;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator3 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		ListIterator<String> i=list.listIterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
		System.out.println();
		while(i.hasPrevious()) {
			System.out.print(i.previous()+" ");
		}
	}
}
