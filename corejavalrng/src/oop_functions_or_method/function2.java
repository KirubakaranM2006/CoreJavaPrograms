package oop_functions_or_method;

public class function2 {
	static void invitation()//functions
	{
		System.out.println("Birthday Invitation:");
	}
	static void welcome()//functions
	{
		System.out.println("All are welcome");
	}

	public static void main(String[] args) {
		
		invitation();      //function call without creating objects
		welcome();         //function call without creating objects 
		                 
	}

}

//we cant call the function without creating object
//if you want to create without object 
//In public class( public [static void] main(String[] args)) { there is the type called static which is function
//public function as static but above function as non static
//change void invitation()->static void invitation()
//now you can call t function directly without creating the object 