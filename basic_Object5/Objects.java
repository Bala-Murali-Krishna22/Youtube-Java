package basic_Object5;

public class Objects {
	public static void main(String[] args) {
		Objects objects1=new Objects();
		Objects objects2=new Objects(22, 13);
		Objects objects3=new Objects(22, 99);
		//
		System.out.println("Object without argument : "+objects1.add());
		System.out.println("Object with arguments   : "+objects2.add());
		System.out.println("Object with arguments   : "+objects3.add());
	}
	//
	int i;
	int j;
	public Objects() {
		i=22;
		j=4;
	}
	//
	public Objects(int i, int j) {
		this.i=i;
		this.j=j;
	}
	//
	public int add() {
		return i+j;
	}
}