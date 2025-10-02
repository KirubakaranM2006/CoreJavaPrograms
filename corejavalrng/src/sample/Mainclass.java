package sample;
//Step 1: Define a class `person` with different access modifiers
class person{
	public String name;  // Public: Accessible anywhere
	protected int age;  // Protected: Accessible within the same package & subclasses
	private String socialsecuritynumber;  // Private: Only accessible within this class
	String address; // Default (package-private): Accessible within the same package
    
	// Step 2: Constructor to initialize values
	 person(String name,int age,String socialsecuritynumber,String address) {
		 this.name=name;
		 this.age=age;
		 this.socialsecuritynumber=socialsecuritynumber;// Private variable assigned inside the class
		 this.address=address;
		 
		 
	
		
	}
	 void display() {
		 System.out.println(name+":"+age+":"+socialsecuritynumber+":"+address);
	
		

	}

}
class employee extends person{// Step 3: Create `employee` class that extends `person`
	
	 // Step 4: Constructor for `employee`
	public employee(String name,int age,String socialsecuritynumber,String address) {
		  // Step 5: Call the parent class (`person`) constructor using `super`
		super(name,age,socialsecuritynumber,address);
		// Step 6: Print message when an `employee` object is created
		System.out.println("Hello employee");
		
	}
}

public class Mainclass {

	public static void main(String[] args) {
	    // Step 8: Create an `employee` object with provided values
		employee e=new employee("kiruba",18,"abc123","Puducherry");
		e.display();
		
		

	}

}
//Class person is defined with variables using different access modifiers (public, protected, private, default).
//Constructor of person initializes these variables.
//Class employee extends person, inheriting its properties.
//employee constructor calls super() to invoke person's constructor.
//"Hello employee" is printed when an employee object is created.
//In main(), an employee object is created, passing "kiruba", 18, "abc123", "Puducherry".
//Execution completes after object creation.
