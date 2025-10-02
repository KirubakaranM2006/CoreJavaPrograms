//Use an abstract class when you want to define common features for different classes.
//Use an abstract method when you want each class to provide its own version of a specific action.

//*if using abstract method ,every derived(childclass) class must overrided the abstract method in their classes*







package abstractdemo;
abstract class vehicle{
	abstract void speed();
	void horn() {//normal method
		System.out.println("drive safely");
		
	}
}
class car extends vehicle{
	@Override
	void speed() {
		System.out.println("60km");
	
	}
	
}
class bike extends vehicle{
	@Override
	void speed() {
		System.out.println("85km");
		
	}
	
}

public class Abstdemo {

	public static void main(String[] args) {
		car c=new car();
		c.speed();
		c.horn();
		
		bike b=new bike();
		b.speed();
		b.horn();
		

	}

}
//Abstract Class: vehicle is an abstract class with one abstract method (speed()) and one normal method (horn()).
//Implementation: car and bike classes implement the abstract method speed() using @Override.
//Object Creation: When you create objects of car and bike, their default constructors are called (provided automatically by Java).
//Method Calls: Both objects can call their own speed() method and the inherited horn() method from the vehicle class.
