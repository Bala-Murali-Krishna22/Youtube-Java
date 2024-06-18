package oops_Encapsulation2;

public class Student {
	private String name;
	private int rollNumber;
	private boolean isAttended;
	
	public Student(boolean isAttended) { //Constructor
		this.isAttended=isAttended;
	}
	// //Set methods
	public void setName(String name) {
		this.name=name;
	}
	//
	public void setRollNumber(int rollNumber) {
		this.rollNumber=rollNumber;
	}
	//
	public void setAttendance(boolean isAttended) {
		this.isAttended=isAttended;
	}
	// //Get methods
	public String getName() {
		return name;
	}
	//
	public int getRollNumber() {
		return rollNumber;
	}
	//
	public boolean getAttendance() {
		return isAttended;
	}
	//
}
