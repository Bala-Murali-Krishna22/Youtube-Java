package z_LambdaExpressions;

public class EmployeMainTwoParams {
	public static void main(String[] args) {
		//
		EmployeTCS employeTCS=new EmployeTCS();
		employeTCS.details("Balu", 22);
		
		//Anonymous function
		EmployeInterface employeInterface=new EmployeInterface() {
			@Override
			public void details(String name, int id) {
				System.out.println("\nAnonymous : Name is "+name+" and Id is "+id);
			}
		};
		employeInterface.details("Bala", 04);
		
		//Lambda expressions single line
		EmployeInterface employeInterface1=(name, id)->System.out.println("\nLamda single : Name is "+name+" and ID is "+id);
		employeInterface1.details("Bmk", 26);
		
		//Lambda expressions multi line
		EmployeInterface employeInterface2=(name, id)->{
			System.out.println("\nLambda multi : Name is "+name);
			System.out.println("ID is "+id);
		};
		employeInterface2.details("Krishna", 19);
		//
	}
}
