package loops;

public class Nestedforloop {

	public static void main(String[] args) {
		for(int i=1;i<=2;i++) {             //outloop 
			for(int j=1;j<=3;j++) {         //innerloop
				System.out.println("welcome");
			}
			
		}
		

	}

}
//first outer loop is started i=1,1<=2 true->go to inner loop

//inner loop j=1,1<=3,true -> print welcome (j++)
//inner loop j=2,2<=3,true -> print welcome (j++)
//inner loop j=3,3<=3,true -> print welcome (j++)
//inner loop j=4,4<=3,false Gets out of loop and go to outer loop

//then again i++ 
//Outer loop i=2,2<=2 true->go to inner loop
//inner loop j=1,1<=3,true -> print welcome (j++)
//inner loop j=2,2<=3,true -> print welcome (j++)
//inner loop j=3,3<=3,true -> print welcome (j++)
//inner loop j=4,4<=3,false Gets out of loop and go to outer loop

//then again i++ 
//outer loop i=3 3<=2 condition false get out of the program