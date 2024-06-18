package z_LambdaExpressions;

public class EmployeTCS implements EmployeInterface{
	@Override
	public void details(String name, int id) {
		System.out.println("Name is "+name+" and ID is "+id);
	}
}
