package pojo_JavaBeans;

import java.io.Serializable;

public class Student implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1175556679731068576L;
	private int rollNum;
	private String name;
	private double marks;
	
	public int getRollNum() {
		return rollNum;
	}
	public Student setRollNum(int rollNum) {
		this.rollNum = rollNum;
		return this;
	}
	public String getName() {
		return name;
	}
	public Student setName(String name) {
		this.name = name;
		return this;
	}
	public double getMarks() {
		return marks;
	}
	public Student setMarks(double marks) {
		this.marks = marks;
		return this;
	}
	
}