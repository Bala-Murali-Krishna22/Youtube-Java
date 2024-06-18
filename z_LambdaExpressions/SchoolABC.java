package z_LambdaExpressions;

public class SchoolABC implements School_Interface{

	@Override
	public void subName(String subject) {
		System.out.println("Subject is "+subject);
	}

}
