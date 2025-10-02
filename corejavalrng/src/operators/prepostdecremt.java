package operators;

public class prepostdecremt {

	public static void main(String[] args) {
		
	//	The decrement operator decreases the value of a variable by 1.

	//	Pre-decrement (--x):
	//	Decrements the value first, then uses it.
	//	Post-decrement (x--):
	//	Uses the current value first, then decrements it
		
		        int y = 5;

		        // Pre-decrement
		        int preDec = --y;  // y becomes 4, then preDec gets 4
		        System.out.println("Pre-decrement value: " + preDec); // 4
		        System.out.println("y after pre-decrement: " + y);    // 4

		        // Post-decrement
		        int postDec = y--;  // postDec gets 4, then y becomes 3
		        System.out.println("Post-decrement value: " + postDec); // 4
		        System.out.println("y after post-decrement: " + y);      // 3
		
	}

}
    //output:

//Post-increment: 10
//Value of a now: 11
//Pre-increment: 12
//Post-decrement: 12
//Value of a now: 11
//Pre-decrement: 10

