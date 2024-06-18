package oops_StaticNonstatic;

import java.util.*;

public class StaticNonstatic {
	public static void main(String[] args) {
		StaticNonstatic sn1=new StaticNonstatic();
		StaticNonstatic sn2=new StaticNonstatic();
		StaticNonstatic sn3=new StaticNonstatic();
		/***/
		nonStatic(sn1,sn2,sn3);
		staticc(sn1,sn2,sn3);
		/***/
	}
	//Global variables
	int numNs; //non-static
	static int numS;
	//
	static void nonStatic(StaticNonstatic sn1,StaticNonstatic sn2,StaticNonstatic sn3) {
		sn1.numNs=new Random().nextInt();
		sn2.numNs=new Random().nextInt();
		sn3.numNs=new Random().nextInt();
		
		System.out.println("Non-static : "+sn1.numNs);
		System.out.println(sn2.numNs);
		System.out.printf(sn3.numNs+"%n %n");
	}
	//
	static void staticc(StaticNonstatic sn1,StaticNonstatic sn2,StaticNonstatic sn3) {
		sn1.numS=new Random().nextInt();
		sn2.numS=new Random().nextInt();
		sn3.numS=new Random().nextInt();
		StaticNonstatic.numS=new Random().nextInt();
		
		System.out.println("Static : "+sn1.numS);
		System.out.println(sn2.numS);
		System.out.println(sn3.numS);
		System.out.printf("Call by class name : "+StaticNonstatic.numS+"%n %n");
	}
	//
}
