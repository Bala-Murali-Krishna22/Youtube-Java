package basic_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		Assignment1 as=new Assignment1();
		Scanner sc=new Scanner(System.in);
		/***/
		/*length1(sc);
		as.length2(sc); 
		as.countWords(sc); 
		as.charOccurrences(sc); 
		as.reverseString(sc); */
		reverseEachWord(sc);
		/***/
		sc.close();
	}
	//
	public static void length1(Scanner sc) {
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";
		
		System.out.println("Input : "+input);
		System.out.println("Output : Length-"+input.length());
	}
	
	public void length2(Scanner sc) {
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";
		
		char[] ch=input.toCharArray();
		
		System.out.println("Input : "+input);
		System.out.println("String char array : "+Arrays.toString(ch));
		System.out.println("Output : Length-"+ch.length);
	}
	
	void countWords(Scanner sc) {
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";

		String[] words=input.split(" ");
		int numofWords=words.length;
		
		System.out.println("Input : "+input);
		System.out.println("Words : "+Arrays.toString(words));
		System.out.println("Output : no.of words-"+numofWords);
	}
	
	void charOccurrences(Scanner sc){
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";
		System.out.println("Enter target character : ");
		char targetChar=sc.next().charAt(0); // char tc=l;
		int count=0;
		
		char[] ch=input.toCharArray(); //1st approach
		for(int i=0; i<ch.length; i++) {
			if(targetChar == ch[i])
				count++;
		} //1st approach
		
//		for(int i=0; i<input.length(); i++) { //2nd approach
//			if(input.charAt(i)==targetChar)
//				count++;
//		} //2nd approach
		
		System.out.println("Input : "+input);
		System.out.println("Target character : "+targetChar);
		System.out.println("Output : no.of occurences-"+count);
	}
	
	void reverseString(Scanner sc) {
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";
		
		String reverse="";
		for(int i=input.length()-1; i>=0; i--) {
			reverse += input.charAt(i);
		}
		
		System.out.println("Input : "+input);
		System.out.println("Output : reverse string - "+reverse);
	}
	
	static void reverseEachWord(Scanner sc) {
		System.out.println("Enter string input : ");
		String input=sc.nextLine(); //String i="Java is super";
		
		String reverseString="";
		String[] words=input.split(" ");
		for(int i=0; i<words.length; i++) {
			String reverseWord="";
			for(int j=words[i].length()-1; j>=0; j--) {
				reverseWord += words[i].charAt(j);
			}
			if(i != words.length-1)
				reverseString += reverseWord+" ";
			else
				reverseString += reverseWord;
		}
		
		System.out.println("Input : "+input);
		System.out.println("String array : "+Arrays.toString(words));
		System.out.println("Output : reverse each word in string - "+reverseString);
	}
}
