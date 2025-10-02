package hierchicalInheritance;

    public class car extends vehicle{
	String fueltype;
	@Override
	void startEngine() {
		System.out.println("Cars Engine Starts");
		
	}
	void drive() {
		System.out.println("car is driving");
	}
}