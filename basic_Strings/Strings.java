package basic_Strings;

public class Strings {
	public static void main(String [] args) {
		String s1="Hello";
		String emailId="balu@gmail.com";
		System.out.println(s1);
		System.out.println(emailId);
		System.out.println(s1+emailId);
		
		String s2=new String("World");
		System.out.println(s2);
		
		/////
		String a="Balu"; //By sing literal
		String b="Balu";
		String c="Java";
		String d=new String("Balu"); //By using new keyword
		String e=new String("Balu");
		String f=new String("Java");
		
		//It is checking addresses equal or not, not data/value
		System.out.println(a==b); //T
		System.out.println(a==c); //F
		System.out.println(a==d); //F
		System.out.println(a==e); //F
		System.out.println(a==f); //F
		System.out.println(d==f); //F
		System.out.println(e==f); //F
		
		//Equals method
		System.out.println(a.equals(b)); //T
		System.out.println(a.equals(c)); //F
		System.out.println(a.equals(d)); //T
		System.out.println(a.equals(e)); //T
		System.out.println(a.equals(f)); //F
		System.out.println(d.equals(e)); //T
		System.out.println(e.equals(f)); //F
		//Euqals method is checking data is equal or not
	}
}
