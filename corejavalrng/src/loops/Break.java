//Use: To stop the loop immediately and exit out of it.
//Where: Inside loops (for, while, do-while) and switch statements.

package loops;

public class Break {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==2) {//stop the loop when i=2
				break;//come out of the loop
			}
			System.out.println("welcome:"+i);
		}


	}

}
//The loop runs from i = 1 to i = 5.
//When i becomes 2, the break statement is triggered, and the loop stops completely.
