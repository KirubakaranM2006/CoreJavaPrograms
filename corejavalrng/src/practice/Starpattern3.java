package practice;

public class Starpattern3 {

	public static void main(String[] args) {
		int n=4;
	 for(int i=1;i<=n;i++) {
		 for(int j=i;j<=n;j++) {
			 System.out.print("*");
		 }
		 System.out.println();
	 }

	}

}
// Outer loop: for (int i = 1; i <= n; i++)
// This loop controls the rows.
// It starts from i = 1 and runs until i <= 5.
// Each time this loop runs, a new row is printed.
// Row (i)	What happens?
// i = 1	Prints 5 stars (because j runs from 1 to 5)
// i = 2	Prints 4 stars (because j runs from 2 to 5)
// i = 3	Prints 3 stars (because j runs from 3 to 5)
// i = 4	Prints 2 stars (because j runs from 4 to 5)
// i = 5	Prints 1 star  (because j runs from 5 to 5)
