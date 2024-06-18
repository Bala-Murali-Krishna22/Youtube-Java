package z_LambdaExpressions;

public class VehicleMainNoParams {
	public static void main(String[] args) {
		//
		VehicleAudi vehicleAudi=new VehicleAudi();
		vehicleAudi.vehicle();
		
		//Anonymous function
		VehicleInterface vehicleInterface=new VehicleInterface() {
			public void vehicle() {
				System.out.println("\nVehicle Interface");
			}
		};
		vehicleInterface.vehicle();
		
		//Lambda Expressions single line
		VehicleInterface vehicleInterface1=()->System.out.println("\nVehilce interface for single-line");
		vehicleInterface1.vehicle();
		
		//Lambda Expressions multi line
		VehicleInterface vehicleInterface2=()->{
			System.out.println("\nVehicle first-line");
			System.out.println("Vehilce interface for multi-line");
		};
		vehicleInterface2.vehicle();
		//
	}
}
