package collections_LIE;

import java.util.Enumeration;
import java.util.*;

public class Enumerator1 {
	public static void main(String[] args) {
		Vector<Integer> vector=new Vector<>();
		vector.add(11);
		vector.add(51);
		vector.add(31);
		vector.add(21);
		vector.add(41);
		
		Enumeration<Integer> e=vector.elements();
		while(e.hasMoreElements()) {
			System.out.print(e.nextElement()+" ");
		}
//		
		Properties Properties=new Properties();
		Properties.setProperty("Username", "Enumeration");
		Properties.setProperty("Password", "Legacy");
		
		Enumeration<Object> p=Properties.elements();
		while(p.hasMoreElements()) {
			System.out.print(p.nextElement()+" ");
		}
		
	}
}
