package prtceexceptnhandlg;
import java.util.Scanner;

class Divisionexample{
	void dividenumbers(int numrtr,int denomrtr){
		try {
			int result=numrtr/denomrtr;
			System.out.println("The result is"+result);
		}
		catch(Exception e) {
			System.out.println(e);
			
			
		}
		finally {
			System.out.println("This is from finally block ");
		}
		
		
	}
	
}

public class Example1 {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("A value:");
		int a=Scan.nextInt();
		System.out.println("B value:");
		int b=Scan.nextInt();
		Divisionexample d=new Divisionexample();
		d.dividenumbers(a, b);
		
		
		
		
	}

}
