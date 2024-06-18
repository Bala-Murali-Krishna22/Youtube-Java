package oops_Encapsulation2;

public class StudentMain {
	public static void main(String[] args) {
		Student student=new Student(true);
		
		//Instance/Global variables
		//I want to hide this from user, Now it hides after giving private modifier
		//Now its Encapsulation
//		System.out.println(student.name);
//		System.out.println(student.rollNumber);
//		System.out.println(student.isAttended);
		
		//Set Methods
		student.setName("Balu");
		student.setRollNumber(22);
		student.setAttendance(false);
		
		//Get Methods
		System.out.println(student.getName());
		System.out.println(student.getRollNumber());
		System.out.println(student.getAttendance());
	}
}
