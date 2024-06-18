package oops_Polymorphism_MethodOverloading4;

public class AdditionMain {
	public static void main(String[] args) {
		Addition addition=new Addition();
		
		double a,b,c;
		
		a=addition.add(1, 2);
		b=addition.add(3, 4.5);
		c=addition.add(6.7, 8.9);
		System.out.printf(a+"%n"+b+"%n"+c);
	}
}
