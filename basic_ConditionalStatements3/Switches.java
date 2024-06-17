package basic_ConditionalStatements3;

public class Switches {
	public static void main(String[] args) {
		int a=5;
		switch(a) {
		case 1:
			System.out.println("This is FIRST statement");
			break;
		case 2:
			System.out.println("This is SECOND statement");
			break;
		case 3:
			System.out.println("This is THIRD statement");
			break;
		default:
			System.out.println("It is INVALID..!!");
			break;
		}
	}
}