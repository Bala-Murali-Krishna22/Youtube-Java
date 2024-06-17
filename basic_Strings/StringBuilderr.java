package basic_Strings;

public class StringBuilderr {
	public static void main(String[] args) {
		/***/
		StringBuilderr stringBuilderr=new StringBuilderr();
		/***/
		StringBufferr.stringClass();
		stringBuilderr.stringBuilder();
		stringBuilderr.builderMethods();
		/***/
	}
	//
	void stringBuilder() {
		StringBuilder sb1=new StringBuilder("Balu"); //25
		StringBuilder sb2=new StringBuilder("Balu"); //33
		System.out.println(sb1==sb2); //(25==33)False
		sb1=sb1.append("bmk"); //25
		StringBuilder sb3=new StringBuilder("Balubmk"); //37
		System.out.println(sb1==sb3); //(25==37)False
		System.out.println(sb1.compareTo(sb3)); //It checks value
	}
	//
	void builderMethods() {
		StringBuilder sb1=new StringBuilder("Balu");
		System.out.println("String builder methods : "+sb1);
		System.out.println("1.Append method : "+sb1.append("bmk")); //Add string to this value 
		System.out.println("2.Insert method (String): "+sb1.insert(0, "Krishna"));
		//Insert any value/char wherever you want
		System.out.println("2.Insert method (char): "+sb1.insert(0, 'K'));
		System.out.println("3.Delete method (1-char): "+sb1.deleteCharAt(0));
		System.out.println("3.Delete method (2-char): "+sb1.delete(0, 7));
		System.out.println("4.Reverse method : "+sb1.reverse()); //Cant do directly in strings
		System.out.println("5.Capacity method : "+sb1.capacity()); //Default capacity value is 16
		sb1.ensureCapacity(69); //We can provide capacity using this method
		System.out.print("6.Ensure capacity method : "+sb1.capacity());
	}
}