package z_AnonymousFunctions;

public class BusMain {
	public static void main(String[] args) {
		BusInterface busInterface=new BusInterface() {
			@Override
			public void driver() {
				System.out.println("Driver");
			}
			@Override
			public void ticketer() {
				System.out.println("Ticket collector");
			}
			
		};
		busInterface.driver();
		busInterface.ticketer();
	}
}
