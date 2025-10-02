//Use: To skip the current iteration and go to the next one.
//Where: Inside loops (for, while, do-while)


package loops;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			if(i==2) {
				continue;//skips when i=3 and continue 
			}
			System.out.println("welcome:"+i);
		}
	

	}

}
//The loop runs from i = 1 to i = 5.
//When i becomes 3, the continue statement is skipped
//skipping the print statement and going directly to the next iteration.
