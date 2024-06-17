package collections_lists_Assignments;

public class EmployeeList {
	private String name;
	private int id;
	private double salary;
	private String country;
	
	public EmployeeList(String name, int id, double salary, String country) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.country=country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString() {
		return name+" "+id+" "+salary+" "+country;
	}
}
