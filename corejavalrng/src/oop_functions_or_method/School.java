//create a class called School
//Create a function called passorfail which should retrun a string pass or fail
//inside the main function get input from user for total mark
//pass that the input to the passorfail function and let the function decide whether student is pass or fail  


package oop_functions_or_method;
import java.util.Scanner;

public class School {
	String passorfail(int report) { // Function to check Pass or Fail
		
	
		if( report>30) {// If marks are greater than 30
			return "Pass";// Return "Pass"
			
		}
		else {
			return "Fail";// Return "Fail" if marks are 30 or below
		}
	}
	

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in); // Create Scanner object for user input
		System.out.println("enter the marks:");// Ask the user to enter marks
		int totalmark=Scan.nextInt();// Read the user's input and store it in totalmark
		School k=new School(); // Create an object of the School class
		k.passorfail(totalmark);  // *totalmarks is sent report*
		System.out.println(k.passorfail(totalmark));// Print the total marks entered
	
		System.out.println("The Student is:"+k.passorfail(totalmark));
		
		
	}

}


//String passorfail(int report) → Function that checks if marks are above 30 (Pass) or 30 and below (Fail).
// Scanner scan = new Scanner(System.in); → Takes user input from the keyboard.
// int totalmark = scan.nextInt(); → Reads user-entered marks and stores them.
// School k = new School(); → Creates an object to call the passorfail() function.
// String result = k.passorfail(totalmark); → Calls the function and stores the return value.
// System.out.println() → Displays total marks and pass/fail result.
// scan.close(); → Closes the Scanner to prevent memory leaks.


