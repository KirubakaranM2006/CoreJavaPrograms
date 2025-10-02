
//Throw keyword is used to add error additionally where we want in try,catch or in if else blocks
//refer note for better understanding
package throwkeyword_expctnhandlng;

public class Mainclass {

	public static void main(String[] args) {
		try {
			int a=10/2;
			throw new ArithmeticException("Hellohi");//additionally adding or throwing a error and hello hi is the error msg
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program ennded:");
		
	}

}
