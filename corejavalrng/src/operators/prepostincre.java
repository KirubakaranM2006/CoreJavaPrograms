package operators;

public class prepostincre {

	public static void main(String[] args) {
		
	//	The increment operator increases the value of a variable by 1.

	//	Pre-increment (++x):
	//	Increments the value first, then uses it.
	//	Post-increment (x++):
	//	Uses the current value first, then increments it.
		
		
		        int x = 5;

		        // Pre-increment
		        int pre = ++x;  // x becomes 6, then pre gets the value 6
		        System.out.println("Pre-increment value: " + pre); // 6
		        System.out.println("x after pre-increment: " + x); // 6

		        // Post-increment
		        int post = x++;  // post gets value 6, then x becomes 7
		        System.out.println("Post-increment value: " + post); // 6
		        System.out.println("x after post-increment: " + x);  // 7



	}

}
