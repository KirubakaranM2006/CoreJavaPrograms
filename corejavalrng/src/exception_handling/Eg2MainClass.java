package exception_handling;

public class Eg2MainClass {

	public static void main(String[] args) {
		try {
			int n=10/0;//cause error becoz we cant divide any number by 0 
		}
		catch(Exception a){
			System.out.println(a);
			
		}
		System.out.println("Program stopped:");
		

	}

}
