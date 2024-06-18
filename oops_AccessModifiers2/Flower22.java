package oops_AccessModifiers2;

import oops_AccessModifiers.Flower1;

public class Flower22 extends Flower1{
	public static void main(String[] args) {
		Flower1 flower1=new Flower1();
		
		mPublic();
		System.out.println("Different package-Different subclass");
		System.out.println(flower1.name2);
	}
}