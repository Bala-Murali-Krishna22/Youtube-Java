package oops_this_keyword;

public class VehicleCart2 {
	public static void main(String[] args) {
		VehicleCart2 vehicleCart2=new VehicleCart2();
		/***/
		vehicleCart2.setWheels(3);
		vehicleCart2.setName("Bulls");
		vehicleCart2.setColour("White");
		
		System.out.println("Using THIS keyword :");
		System.out.println(vehicleCart2.getWheels());
		System.out.println(vehicleCart2.getName());
		System.out.println(vehicleCart2.getColour());
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
	public void setWheels(int noOfWheels) {
		this.noOfWheels=noOfWheels;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	//
}
