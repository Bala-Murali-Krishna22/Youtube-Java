package oops_this_keyword;

public class VehicleTrainMain implements VehicleTrain{
	public static void main(String[] args) {
		VehicleTrainMain vehicleTrainMain=new VehicleTrainMain();
		/***/
		vehicleTrainMain.firstBhogi();
		vehicleTrainMain.lastBhogi();
		vehicleTrainMain.middleBhogi();
		vehicleTrainMain.bhogi();
	}

	public void firstBhogi() {
		System.out.println("First bhogi");
	}

	public void lastBhogi() {
		System.out.println("Last bhogi");
	}
	//
	public void middleBhogi() {
		System.out.println("Middle bhogi");
	}
}
