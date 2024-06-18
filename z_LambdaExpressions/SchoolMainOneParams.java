package z_LambdaExpressions;

public class SchoolMainOneParams {
	public static void main(String[] args) {
		//
		SchoolABC schoolABC=new SchoolABC();
		schoolABC.subName("Java");
		
		//Anonymous function
		School_Interface schoolinterface=new School_Interface() {
			public void subName(String subject) {
				System.out.println("\nSubject is interface "+subject);
			}
		};
		schoolinterface.subName("Python");
		
		//Lambda expressions single line
		School_Interface schoolinterface1=subject->System.out.println("\nSubject is "+subject);
		schoolinterface1.subName("SQL");
		
		//Lambda expressions multi line
		School_Interface schoolinterface2=subject->{
			System.out.println("\nSubject first line");
			System.out.println("Subject is "+subject);
		};
		schoolinterface2.subName("GoLang");
		//
	}
}
