package collections_LIE;

import java.util.*;

public class Iterator2 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<>();
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		
		Iterator<String> i=list.iterator();
		while(i.hasNext()) {
			System.out.print(i.next()+" ");
		}
	}
}
