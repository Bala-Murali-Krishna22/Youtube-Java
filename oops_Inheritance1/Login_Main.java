package oops_Inheritance1;

public class Login_Main {
	public static void main(String[] args) {
		/***/
		Login_Guest1 guest=new Login_Guest1();
		Login_Tester2 tester=new Login_Tester2();
		Login_Developer3 developer=new Login_Developer3();
		Login_Admin4 admin=new Login_Admin4();
		/***/
		guest.guest();
		
		tester.guest();
		tester.test();
		
		developer.guest();
		developer.test();
		developer.writeCode();
		
		admin.methods();
		admin.edit();
		/***/
	}
}
