package oop_functions_or_method;

public class function {
	void invitation()//functions
	{
		System.out.println("Birthday Invitation:");
	}
	void welcome()//functions
	{
		System.out.println("All are welcome");
	}

	public static void main(String[] args) {
		function birthday=new function();//we cant call the function without creating object
		birthday.invitation();       //if you want to create without object 
		birthday.welcome();          
		                 
	}

}

//we cant call the function without creating object
//if you want to create without object 
//In public class( public [static void] main(String[] args)) { there is the type called static which is function
//public function as static but above function as non static
//change void invitation()->static void invitation()
//now you can call t function directly without creating the object 