package basic_Constructors4;

import java.util.Scanner;

public class Constructors {
	public static void main(String[] args) {
		Constructors constructors=new Constructors();
		Constructors constructorss=new Constructors(22);
		System.out.println("Constructor without arguments : "+constructors.i);
		System.out.println("Constructor with arguments : "+constructorss.i);
	}
	//
	Scanner scanner=new Scanner(System.in);
	int i;
	public Constructors() {  //Constructor without arguments
		System.out.println("Enter the number :");
		i=scanner.nextInt();
	}
	//
	public Constructors(int j) {  //Constructor with arguments
		i=j;
	}
}