package basic_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SingleDimensionalArrayAssignments {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		SingleDimensionalArrayAssignments sda=new SingleDimensionalArrayAssignments();
		//
		sumOfIntegers(scanner);
		sda.averageOfSum(scanner);
		mergeStrings(scanner);
		sda.maxNumberInArray(scanner);
		minStringInArray(scanner);
		sda.reverseBooleanArray(scanner);
		scanner.close();
	}
	//
	public static void sumOfIntegers(Scanner scanner) {
		System.out.println("Enter the size :");
		int size=scanner.nextInt();
		System.out.println("Enter the input :");
		int[] a=new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		/***/
		int sum=0;
		for(int j=0; j<a.length; j++) {
			sum+=a[j];
		}
		System.out.println("Sum of an array is : "+sum);
	}
	//
	public void averageOfSum(Scanner scanner) {
		System.out.println("Enter the size :");
		int size=scanner.nextInt();
		System.out.println("Enter the input :");
		int[] a=new int[size];
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(a));
		/***/
		int sum=0;
		for(int j=0; j<a.length; j++) {
			sum+=a[j];
		}
		System.out.println("Average of sum : "+sum/a.length);
	}
	//
	public static void mergeStrings(Scanner scanner) {
		System.out.println("Enter the size1 :");
		int size1=scanner.nextInt();
		String[] a=new String[size1];
		for(int i=0; i<size1; i++) {
			a[i]=scanner.next();
		}
		System.out.println("String array1 : "+Arrays.toString(a));
		/***/
		System.out.println("Enter the size2 :");
		int size2=scanner.nextInt();
		String[] b=new String[size2];
		for(int i=0; i<size2; i++) {
			b[i]=scanner.next();
		}
		System.out.println("String array2 : "+Arrays.toString(b));
		/***/
		String[] merge=new String[a.length+b.length];
		for(int i=0; i<a.length; i++) {
			merge[i]=a[i];
		}
		for(int i=0; i<b.length; i++) {
			merge[i+a.length]=b[i];
		}
		System.out.println("Merged array : "+Arrays.toString(merge));
	}
	//
	public void maxNumberInArray(Scanner scanner) {
		System.out.println("Enter the size :");
		int size=scanner.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the values :");
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println("Output : "+Arrays.toString(a));
		/***/
		int max=a[0];
		int index=0;
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				max=a[i];
				index=i;
			}
		}
		System.out.println("Maximum number in an array : "+max+" & Index : "+index);
	}
	//
	public static void minStringInArray(Scanner scanner) {
		System.out.println("Enter the size :");
		int size=scanner.nextInt();
		String[] a=new String[size];
		System.out.println("Enter the values :");
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.next();
		}
		System.out.println("Output : "+Arrays.toString(a));
		/***/
		String min=a[0];
		int index=0;
		for(int i=0; i<a.length; i++) {
			if(min.length()>a[i].length()) {
				min=a[i];
				index=i;
			}
		}
		System.out.println("Minimum string length in an array : "+min+" & Index : "+index);
	}
	//
	public void reverseBooleanArray(Scanner scanner) {
		System.out.println("Enter the size :");
		int size=scanner.nextInt();
		boolean[] a=new boolean[size];
		System.out.println("Enter the values :");
		for(int i=0; i<a.length; i++) {
			a[i]=scanner.nextBoolean();
		}
		System.out.println("Output : "+Arrays.toString(a));
		/***/
		boolean[] reverseArray=new boolean[size];
		for(int i=0; i<a.length; i++) {
			reverseArray[a.length-i-1]=a[i];
		}
		System.out.println("Revesre boolean array : "+Arrays.toString(reverseArray));
	}
	//
}