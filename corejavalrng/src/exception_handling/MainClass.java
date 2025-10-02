//Exception handling is used to handle with error //when error caused it send error to catch object
//it is similar to if-else

package exception_handling;
import java.util.Scanner;
public class MainClass {

	public static void main(String[] args) { 
		Scanner Scan = new Scanner(System.in);
		try
		{
			int n=Scan.nextInt();
		}
		catch(Exception a) {
			System.out.println(a);
		}
		System.out.println("Program stopped:");
		Scan.close();


	}

}
//when i give input as String instead of integer it cause an error becoz input variiable is in integer
//so that i give the error line in(try) it will try the statement is true it execute the sts if cause error
//the error goes to->(catch) exception object if we print object(a) we does not get error
