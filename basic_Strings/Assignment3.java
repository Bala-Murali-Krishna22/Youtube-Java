package basic_Strings;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		Assignment3 as=new Assignment3();
		Scanner scanner=new Scanner(System.in);
		/***/
		/*as.maxWordInString(scanner); 
		compareStrings(scanner); 
		as.firstNameLastName(scanner); 
		fileNameExtension(scanner); */
		as.palindrome(scanner);
		/***/
		scanner.close();
	}
	//
	void maxWordInString(Scanner scanner) {
		System.out.println("Enter input string : ");
		String input=scanner.nextLine(); //s="java is super";
		
		String[] words=input.split(" "); //[java, is, super]
		String maxWord="";
		int maxLength=0;
		for(int i=0; i<words.length; i++) {
			if(maxLength<words[i].length()) {
				maxLength=words[i].length();
				maxWord=words[i];
			}
		}
		
		System.out.println("Input : "+input);
		System.out.println("Output : Max word in string : "+maxWord);
	}
	
	static void compareStrings(Scanner scanner) {
		System.out.println("Enter input-1 string : ");
		String input1=scanner.nextLine(); //s="New York";
		System.out.println("Enter input-2 string : ");
		String input2=scanner.nextLine(); //s="NWYR";
		
		String output="";
		for(int i=0; i<input1.length(); i++) {
			char tempChar=input1.toLowerCase().charAt(i);
			if(input2.toLowerCase().indexOf(tempChar)>=0)
				output+=input1.charAt(i);
			else
				output+="+";
		}
		
		System.out.println("Input1 : "+input1);
		System.out.println("Input2 : "+input2);
		System.out.println("Output : Compare two strings "+output);
	}
	
	void firstNameLastName(Scanner scanner) {
		System.out.print("Enter first name : ");
		String firstName=scanner.nextLine(); //
		System.out.print("Enter second name : ");
		String lastName=scanner.nextLine(); //
		
		String output=lastName+","+firstName.charAt(0);
		
		System.out.println("Input1 : "+firstName);
		System.out.println("Input2 : "+lastName);
		System.out.println("Output : Compare two strings - "+output);
	}
	
	static void fileNameExtension(Scanner scanner) {
		System.out.print("Enter input string : ");
		String input=scanner.nextLine(); //S="abcdef.jpg";
		
		String output=input.substring(input.lastIndexOf(".")+1, input.length());

		System.out.println("Input : "+input);
		System.out.println("Output : "+output);
	}
	
	void palindrome(Scanner scanner) {
		System.out.print("Enter input string : ");
		String input=scanner.nextLine();
		
		String reverse=""; String output="";
		for(int i=input.length()-1; i>=0; i--)
			reverse+=input.charAt(i);
		if(input.equals(reverse))
			output="It is palindrome";
		else
			output="It is not a palindrome";
		
		System.out.println("Input : "+input);
		System.out.println("Reverse : "+reverse);
		System.out.println("Output : "+output);
	}
}
