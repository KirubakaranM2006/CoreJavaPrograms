//this is similar to else if
//nested if means if inside another if statements

package condtnstatements;

public class Nested_if {

	public static void main(String[] args) {
		int mark=85;
		if(mark>=90 && mark<=100) {
			System.out.println("A+ grade");
		}
		if(mark>=80 && mark<=90)
		{
			System.out.println("A grade");
		}
		if(mark>=70 && mark<80) {
			System.out.println("B grade");
		}
		if(mark>=60&& mark<70) {
			System.out.println("C grade");
		}
		if(mark<30) {
			System.out.println("Fail");
		}


	}

}
