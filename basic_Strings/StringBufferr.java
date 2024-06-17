package basic_Strings;

public class StringBufferr {
	public static void main(String[] args) {
		/***/
		StringBufferr stringBufferr=new StringBufferr();
		/***/
		stringClass(); 
		stringBufferr.stringBuffer();
		stringBufferr.bufferMethods();
		/***/
	}
	//
	static void stringClass() {
		String s1="Balu"; //23
		String s2="Balu"; //23
		System.out.println(s1==s2); //(23==23)True
		s1=s1+"bmk"; //36
		String s3="Balubmk"; //37
		System.out.println(s1==s3); //(36==37)False
	}
	//
	void stringBuffer() {
		StringBuffer sb1=new StringBuffer("Balu"); //25
		StringBuffer sb2=new StringBuffer("Balu"); //33
		System.out.println(sb1==sb2); //(25==33)False
		sb1=sb1.append("bmk"); //25
		StringBuffer sb3=new StringBuffer("Balubmk"); //37
		System.out.println(sb1==sb3); //(25==37)False
		System.out.println(sb1.compareTo(sb3)); //It checks value
	}
	//
	void bufferMethods() {
		StringBuffer sb1=new StringBuffer("Balu");
		System.out.println("String buffer methods : "+sb1);
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
