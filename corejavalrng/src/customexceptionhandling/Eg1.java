package customexceptionhandling;
import java.util.Scanner;

class agelimitException extends Exception{
	
}

public class Eg1 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		try {
			int age=Scan.nextInt();
			if(age<18) {
				throw new agelimitException();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		
	

	}

}
