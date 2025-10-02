
package practice;

public class Starpattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				
			}
			System.out.println();
		}

	}

}
//first outerloop i=1;1<=3 true-> goes to the innerloop

//in innerloop j=1;j<=i, (j value)1<=1(i value) true-> print the * once (j++)
//in innerloop j=2;j<=i, (j value)2<=1(i value) false-> get out of loop and return to outer loop

//outerloop(i++)
//i=2,2<=3 true -> goes to innerforloop

//in innerloop j=1;j<=i, (j value)1<=2(i value) true-> print the * once (j++)
//in innerloop j=2;j<=i, (j value)2<=2(i value) true-> print the * once (j++)
//in innerloop j=3;j<=i, (j value)3<=2(i value) false-> get out of loop and return to outer loop

//outerloop(i++)
//i=3;3<=3 true -> goes to innerforloop
//in innerloop j=1;j<=i, (j value)1<=3(i value) true-> print the * once (j++)
//in innerloop j=2;j<=i, (j value)2<=3(i value) true-> print the * once (j++)
//in innerloop j=3;j<=i, (j value)3<=3(i value) true-> print the * once (j++)
//in innerloop j=4;j<=i, (j value)4<=3(i value) false-> get out of loop and return to outer loop

//outerloop(i++)
//i=4;4<=3 false->get out of outerloop to main program