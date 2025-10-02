package prtceexceptnhandlg;
import java.util.Scanner;

class InvalidAgeException extends Exception{
public InvalidAgeException(String message) {
	super(message);//here the super is used for class InvalidAgeException extends Exception->(Exception)inside the exception we have construction so the msg will pass to that constructor
	
}	
	
}
class AgeValidator{
	void checkage(int age) {
		try {
			if(age<0 || age>150) {
				throw new InvalidAgeException("Age is invalid!");//this is the msg were the super keyword uses the message
			}
			else {
				System.out.println("Age is valid");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}


public class Example2 {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter the Age:");
		int Q=Scan.nextInt();
		AgeValidator A=new AgeValidator();
		A.checkage(Q);
		

	}

}
