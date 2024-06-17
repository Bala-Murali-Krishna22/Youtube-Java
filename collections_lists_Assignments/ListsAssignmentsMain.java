package collections_lists_Assignments;

import java.util.Scanner;

public class ListsAssignmentsMain {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
//		new ListsAssignmentsMain().assignments1(scanner);
//		new ListsAssignmentsMain().assignments2(scanner);
		new ListsAssignmentsMain().assignments3(scanner);
	}
//	###1
	public void assignments1(Scanner scanner) {
		ListsAssignments1 listsAssignment1=new ListsAssignments1();
		listsAssignment1.sumAverage(scanner); //4 5 0 9 8 10
		listsAssignment1.sumOfEvenNumbers(); //4 5 0 9 8 10
		listsAssignment1.splitList(scanner); //4 9 8 5 0 10
		listsAssignment1.mergeList(scanner); //4 9 8 //5 0 10
		listsAssignment1.repeatedOrDuplicateValues();
		listsAssignment1.highInDuplicate();
		listsAssignment1.deleteDuplicates();
		listsAssignment1.commonElements();
	}
//	###2
	public void assignments2(Scanner scanner) {
		ListsAssignments2 listsAssignments2=new ListsAssignments2();
		listsAssignments2.createPrimeNumbersList(scanner);
		listsAssignments2.printListInConsole(scanner);
		listsAssignments2.deleteFromList1ToList2();
		listsAssignments2.posiotionOfElement(scanner);
		listsAssignments2.reverseList();
		listsAssignments2.ascendingDescendingOrder();
		listsAssignments2.nonRepeatingCharacter(scanner);
	}
//	###3
	public void assignments3(Scanner scanner) {
		ListsAssignments3 listAssignments3=new ListsAssignments3();
//		listAssignments3.employeeList();
//		listAssignments3.employeeSalary(scanner);
//		listAssignments3.employeeNames(scanner);
//		listAssignments3.checkExpression(scanner);
		listAssignments3.browserNavigationFunctionality(scanner);
	}
//	###
}
