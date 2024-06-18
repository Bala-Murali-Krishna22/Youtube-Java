package oops_Interface;

public class CapitalCityMain {
	public static void main(String[] args) {
		CapitalCityHyderabad hyd=new CapitalCityHyderabad();
		CapitalCityChennai chennai=new CapitalCityChennai();
		CapitalCityBangalore bangalore=new CapitalCityBangalore();

		CapitalCity.jobs(); 
		System.out.println();

		hyd.highCourt();
		hyd.collectorOffice();
		hyd.policeStation();
		hyd.busStation();
		hyd.tankBund();
		System.out.println();

		chennai.highCourt();
		chennai.collectorOffice();
		chennai.policeStation();
		chennai.busStation();
		chennai.marinaBeach();
		chennai.transport();
		System.out.println();

		bangalore.highCourt();
		bangalore.collectorOffice();
		bangalore.policeStation();
		bangalore.busStation();
		bangalore.itHub();
	}
}
