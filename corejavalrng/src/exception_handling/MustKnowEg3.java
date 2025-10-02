package exception_handling;

import java.util.InputMismatchException;//should import this when InputMismatchException mentioned
import java.util.Scanner;

public class MustKnowEg3 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		try {
			int a=Scan.nextInt();
			int q=10/0;
		}
		catch(InputMismatchException e) {
			System.out.println(e);
			
		}
		catch( ArithmeticException e) {
			System.out.println(e);
			
		}
	
	
	}

}
