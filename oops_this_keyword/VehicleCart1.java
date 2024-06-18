package oops_this_keyword;

public class VehicleCart1 {
	public static void main(String[] args) {
		VehicleCart1 vehicleCart1=new VehicleCart1();
		/***/
		vehicleCart1.setWheels(3, vehicleCart1);
		vehicleCart1.setName("Bulls", vehicleCart1);
		vehicleCart1.setColour("White", vehicleCart1);
		
		System.out.println("Without using THIS keyword :");
		System.out.println(vehicleCart1.getWheels());
		System.out.println(vehicleCart1.getName());
		System.out.println(vehicleCart1.getColour());
	}
	
	//Global variables
	int noOfWheels;
	String name;
	String colour;
	
	//Set and Get methods
	public int getWheels() {
		return noOfWheels;
	}
	//
	public void setWheels(int noOfWheels, VehicleCart1 vehicleCart1) {
		vehicleCart1.noOfWheels=noOfWheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name, VehicleCart1 vehicleCart1) {
		vehicleCart1.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour, VehicleCart1 vehicleCart1) {
		vehicleCart1.colour = colour;
	}
	//
}
