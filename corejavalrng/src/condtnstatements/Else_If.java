package condtnstatements;

public class Else_If {

	public static void main(String[] args) {
		int mark=80;
		if(mark>=90)
		{
			System.out.println("A grade");
		}
		else if(mark>=75) {
			System.out.println("B grade");
		}
		else if(mark<60) {
			System.out.println("C grade");
		}
		else {
			System.out.println("Fail");
		}
	}

}
