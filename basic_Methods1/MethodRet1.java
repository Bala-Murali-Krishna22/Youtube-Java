package basic_Methods1;

public class MethodRet1 {
	public static void main(String[] args) {
		int a=10, b=20, maximum;
		maximum = max(a,b);
		System.out.println("Maximum is : "+maximum);
	}

	public static int max(int a, int b) {
		int result;
		if(a>b)
			result=a;
		else
			result=b;
		return result;
	}
}
