//when static block is declared inside the class it is 1st executed and the main function will be executed
//statc block vs main method
package static_ex;

public class Sample {
	static {//1st get executed before running the main program
		System.out.println("Static Block executed");
	}

	public static void main(String[] args) {//after the static block main method get executed
		System.out.println("Main method is executed");
		
	}

}
