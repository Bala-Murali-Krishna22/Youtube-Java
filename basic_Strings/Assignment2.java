package basic_Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Assignment2 as=new Assignment2();
		Scanner scanner=new Scanner(System.in);
		/***/
		/* removeSpacesStartEnd(scanner); 
		as.oddUpperEvenReverse(scanner); 
		countUpperLowerDigitSpecial(scanner); 
		as.repeatNonrepeatChar(scanner); */
		stringEvenPosition(scanner);
		/***/
		scanner.close();
	}
	//
	static void removeSpacesStartEnd(Scanner scanner) {
		System.out.println("Enter the input string : ");
		String input=scanner.nextLine();

		String output=input.trim();

		System.out.println("Input : "+input);
		System.out.println("Output- Removing spaces start-end : "+output);
	}

	void oddUpperEvenReverse(Scanner scanner) {
		System.out.println("Enter the input string : ");
		String input=scanner.nextLine(); //String a="java is super and good";

		String string="";
		String[] words=input.split(" ");
		for(int i=0; i<words.length; i++) {
			String word="";
			if(i%2==0) {
				word+=words[i].toUpperCase();
			}else {
				for(int j=words[i].length()-1; j>=0; j--) {
					word+=words[i].charAt(j);
				}
			}
			if(i != words.length-1)
				string+=word+" ";
			else
				string+=word;
		}	

		System.out.println("Input : "+input);
		System.out.println("Output- odd-upper and even-reverse : "+string);
	}

	static void countUpperLowerDigitSpecial(Scanner scanner){
		System.out.println("Enter the input string : ");
		String input=scanner.nextLine();
		int upperCount=0; int lowerCount=0;
		int digitCount=0; int specialCharCount=0;

		char[] character=input.toCharArray();
		for(int i=0; i<input.length(); i++) {
			if(Character.isUpperCase(character[i]))
				upperCount++;
			else if(Character.isLowerCase(character[i]))
				lowerCount++;
			else if(Character.isDigit(character[i]))
				digitCount++;
			else
				specialCharCount++;
		}

		System.out.println("Input : "+input);
		System.out.println("Output- Upper count : "+upperCount);
		System.out.println("Lower count : "+lowerCount);
		System.out.println("Digit count : "+digitCount);
		System.out.println("Special character count : "+specialCharCount);
	}

	void repeatNonrepeatChar(Scanner scanner){
		System.out.println("Enter the input string : ");
		String input=scanner.nextLine();

		char firstRepeatChar=' ';
		char firstNonRepeatChar=' ';
		for(int i=0; i<input.length(); i++) {
			char tempChar=input.charAt(i);
			if(input.indexOf(tempChar)==input.lastIndexOf(tempChar)) {
				if(firstNonRepeatChar==' ')
					firstNonRepeatChar=tempChar;
			}
			else if(firstRepeatChar==' ') {
				firstRepeatChar=tempChar;
			}
			if(firstRepeatChar!=' ' && firstNonRepeatChar!=' ')
				break;
		}

		System.out.println("Input : "+input);
		System.out.println("Output : First repeat character - "+firstRepeatChar);
		System.out.println("Output : First non-repeat character - "+firstNonRepeatChar);
	}
	
	static void stringEvenPosition(Scanner scanner) {
		System.out.println("Enter the input string : ");
		String input=scanner.nextLine();
		
		String[] words=input.split(" ");
		String[] evenWord=new String[words.length/2];
		int index=0;
		for(int i=0; i<words.length; i++) {
			if(i%2==1) {
				evenWord[index]=words[i];
				index++;
			}
		}
		
		System.out.println("Input : "+input);
		System.out.println("Output : even words - "+Arrays.toString(evenWord));
	}
}
