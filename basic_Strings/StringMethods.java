package basic_Strings;

import java.util.Arrays;
//import java.util.*;

public class StringMethods {
	public static void main(String[] args) {
		String s1="balu";
		String s2="BALU";
		String s3=new String("balu");
		
		System.out.println("1.Equals method : "+s1.equals(s3)); //true
		System.out.println("2.Equals ignore case method : "+s1.equalsIgnoreCase(s2)); //true
		System.out.println("3.Contains method : "+s1.contains("al")+" "+s1.contains("m"));
		System.out.println("4.Starts with method : "+s1.startsWith("ba")+" "+s2.startsWith("al"));
		System.out.println("5.Ends with method : "+s1.endsWith("lu")+" "+s2.endsWith("m"));
		String s4="balu  ";
		System.out.println("6.Length method : "+s4.length()); //6
		String s5="  balu ";
		System.out.println("7.Trim method : "+s5.length()+" "+s5.trim()+" "+s5.trim().length()); //balu
		System.out.println("8.Lower case method : "+s2.toLowerCase());
		System.out.println("9.Upper case method : "+s3.toUpperCase());
		String s6="java";
		char[] c=s6.toCharArray();
		System.out.print("10.To char array method * : ");
		System.out.println(c);
		String s7="Helolo";
		System.out.println("11.Index of method : "+s7.indexOf("l"));
		System.out.println("12.Last index of method : "+s7.lastIndexOf("l"));
		System.out.println("13.Substring method : "+s7.substring(2)+" "+s7.substring(2,5));
		String s8="Hi how are you guys";
		System.out.println("14.Split method : "+s8.split(" ")+" "+Arrays.toString(s8.split(" ")));
		System.out.println("15.Char at method : "+s1.charAt(1));
		System.out.println("16.Replace method : "+s8.replace("o", "e"));
		System.out.println("17.Replace all methopd : "+s8.replaceAll(s8, s2));
		String s9="224";
		int i=Integer.valueOf(s9);
		System.out.println("18.Value of method : "+i);
		int j=227;
		System.out.println(String.valueOf(j));
		String s10;
		String s11="  ";
//		System.out.println(s10.isBlank()); //Without data, cant perform.
		System.out.println("19.Is empty method : "+"length-"+s11.length()+" "+s11.isEmpty());
		//It can count whitespaces 
		System.out.println("20.Is blank method : "+s11.isBlank()); ////It cant count whitespaces
	}
}
