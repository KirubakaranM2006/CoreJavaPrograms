package sample;

abstract class vehicle{
	final void startengine() {
		System.out.println("Engine starts:");
	}
	static String getvehicle() {
		return "welcome";
		
	}
	abstract void drive();
}
class car extends vehicle{
	@Override
	void drive() {//once used the abstract method it should be overriden by all subbclasses
		System.out.println("Drive a car");
		
		
	}
	

	
}
class bike extends vehicle{
	@Override
	void drive() {//once used the abstract method it should be overriden by all subbclasses
		System.out.println("Drive a bike");
		
		
	}
	
	
}
public class Samplw2 {

	public static void main(String[] args) {
		car c1=new car();
		c1.drive();
		System.out.println(vehicle.getvehicle());//static name so can access using the object without creating the object
		c1.startengine();
	}

}
