package collections_lists_Assignments;

import java.util.*;

public class ListsAssignments3 {
	//	###Employee list
	public void employeeList() {
		List<EmployeeList> vectorEmployee=new Vector<>();
		vectorEmployee.add(new EmployeeList("Modi", 101, 55555.55, "India"));
		vectorEmployee.add(new EmployeeList("Bieden", 102, 66666.66, "USA"));

		for(EmployeeList details: vectorEmployee) {
			System.out.println(details.toString());
		}
	}
	//	###Employee salary
	public void employeeSalary(Scanner scanner) {
		List<EmployeeList> vectorEmployee=new Vector<>();
		vectorEmployee.add(new EmployeeList("Modi", 101, 55555.55, "India"));
		vectorEmployee.add(new EmployeeList("Bieden", 102, 66666.66, "USA"));
		vectorEmployee.add(new EmployeeList("Rahul", 103, 22222.21, "India"));

		System.out.println("Enter country to calculate salary : ");
		String country=scanner.nextLine();

		double salaryCount=0;
		for(EmployeeList details: vectorEmployee) {
			if(country.equals(details.getCountry())) {
				salaryCount+=details.getSalary();
			}
		}
		System.out.println("Total salary from "+country+" is : "+salaryCount);
	}
	//	###Employee names
	public void employeeNames(Scanner scanner) {
		List<EmployeeList> vectorEmployee=new Vector<>();
		vectorEmployee.add(new EmployeeList("Modi", 101, 55555.55, "India"));
		vectorEmployee.add(new EmployeeList("Bieden", 102, 66666.66, "USA"));
		vectorEmployee.add(new EmployeeList("Rahul", 103, 22222.21, "India"));
		vectorEmployee.add(new EmployeeList("Paul", 104, 111111.11, "USA"));

		System.out.println("Enter country to print names : ");
		String country=scanner.nextLine();

		for(EmployeeList details: vectorEmployee) {
			if(country.equals(details.getCountry())) {
				System.out.println(details.getName());
			}
		}
	}
	//	###Expression checking
	public void checkExpression(Scanner scanner) {
		System.out.print("Enter the expressions : ");
		String expression=scanner.nextLine();
		
		Stack<Character> stack=new Stack<>(); //Initialize a stack to open brackets
		String balanced="No";
		
		for(char c: expression.toCharArray()) { //Iterate each character
			if(c=='(' || c=='[' || c=='{'){ //Char is opening bracket, push to stack
				stack.push(c);
			}else if(c==')' || c==']' || c=='}') { //Char is closing bracket
				if(stack.isEmpty()) { //Stack is empty
					balanced="No";
					break;
				}
				char top=stack.pop();
				if(top=='('&&c==')' || top=='['&&c==']' || top=='{'&&c=='}') {
					balanced="Yes";
				}else {
					balanced="No";
				}
			}
		}
		System.out.println("Is expression balanced : "+balanced);
	}
//	###
	public void browserNavigationFunctionality(Scanner scanner) {
		Stack<String> stack=new Stack<>();
		
		System.out.println("Enter search input-1 : ");
		String visit1=scanner.next(); //https://www.youtube.com/c/HYRTutorialsTelugu
		stack.push(visit1);
		System.out.println("Enter search input-2 : ");
		String visit2=scanner.next();
		stack.push(visit2); //https://www.hyrtutorials.com/
		
		System.out.println("Press back or forward : ");
		String press=scanner.next();
		if(press.equals("back")) {
			stack.pop();
			System.out.println(stack.peek());
		}else {
			System.out.println(stack.peek());
		}
	}
//	###
}