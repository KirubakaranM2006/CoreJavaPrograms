//it easy as its operations are similar to else if
//break should be added at every case if not added other cases also displays as output

package condtnstatements;

public class Switch_case {

	public static void main(String[] args) {
		String fruits="Orange";
		switch(fruits) {
		case "Apple":
			System.out.println("Apple");
			break;
		case "Grapes":
			System.out.println("Grapes");
			break;
		case "blueberry":
			System.out.println("Blueberry");
			break;
		case "Orange":
			System.out.println("Orange");
			break;
		default:
			
			System.out.println("Nothing found");
			break;
			
		}
	

	}

}
