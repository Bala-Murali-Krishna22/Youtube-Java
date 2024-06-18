package pojo_JavaBeans;

public class StudentJavaBeans {
	public static void main(String[] args) {
		Student student1=new Student();
		student1.setRollNum(2).setName("Balu").setMarks(60);
		
		Student student2=new Student();
		student2.setRollNum(3).setName("Murali").setMarks(50.5);
		
		Student student3=new Student();
		student3.setRollNum(4).setName("Krishna").setMarks(79.2);
		
		Student[] student=new Student[] {student1, student2, student3};
		int i=1;
		for(Student details: student) {
			System.out.print(i+"."+details.getName()+" "+details.getRollNum()+" "+details.getMarks()+"\n");
			i++;
		}
		
	}
}