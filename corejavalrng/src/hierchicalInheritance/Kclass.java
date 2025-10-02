package hierchicalInheritance;

class vehicle{
String brand;
int year;
void startEngine() {
	System.out.println("This is vehicle");

}

	
	
}

public class Kclass {

	public static void main(String[] args) {
		truck tr=new truck();
		tr.loadcapacity=100;
		tr.brand="tata";
		tr.year=2012;
		tr.startEngine();
		tr.haul();
		
		car c1=new car();
		c1.brand="Hyundai";
		c1.fueltype="xyz";
		c1.year=2022;
		c1.startEngine();
		c1.drive();
		
	
		
		

	
		
	}

}
