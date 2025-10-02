package practice;
import java.util.Scanner;
public class Prtcforlp2_factorial {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the value:");
		int n=Scan.nextInt();
		
		
		int fact =1;
		
		for(int i=1;i<=n;i++) {
			fact=fact*i;
			
		}
		System.out.println("Factorial is:"+fact);

	}

}
//Initialization:

//The variable fact is initialized to 1 because multiplying by 0 would always result in 0.
//Loop Execution:
//The for loop runs from i = 1 to i = n.

//For each iteration, fact is updated by multiplying it with i.
//Let's say n = 5.

//Iteration 1: fact = 1 * 1 = 1
//Iteration 2: fact = 1 * 2 = 2
//Iteration 3: fact = 2 * 3 = 6
//Iteration 4: fact = 6 * 4 = 24
//Iteration 5: fact = 24 * 5 = 120