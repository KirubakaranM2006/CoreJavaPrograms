//throw keyword example 2
//refer note if not understand
package throwkeyword_expctnhandlng;
import java.util.Scanner;
public class EX2 {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		try {
			int age=Scan.nextInt();
			if(age<1) {
				throw new ArithmeticException("Age must be greater than 1");//additionally adding error and sends to catch obj
			}
		}
			catch(ArithmeticException e) {
				System.out.println(e);//printing the error
			}
		System.out.println("Program ended");
		}
	}


