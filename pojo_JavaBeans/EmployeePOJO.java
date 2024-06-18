package pojo_JavaBeans;

//import java.util.Arrays;

public class EmployeePOJO {
	public static void main(String[] args) {
		Employee employee1=new Employee();
		employee1.setId(22);
		employee1.name="Balu";
		employee1.salary=20000;

		Employee employee2=new Employee();
		employee2.setId(24);
		employee2.name="Murali";
		employee2.salary=30000;

		Employee employee3=new Employee();
		employee3.setId(26);
		employee3.name="Krishna";
		employee3.salary=40000;

		Employee[] employee=new Employee[] {employee1, employee2, employee3};
		int i=1; double totalSalary=0;
		for(Employee details: employee) {
			System.out.print(i+"."+details.name+" "+details.getId()+" "+details.salary+"\n");
			totalSalary+=details.salary;
			i++;
		}
		System.out.println("Total salary : "+totalSalary);
	}
}