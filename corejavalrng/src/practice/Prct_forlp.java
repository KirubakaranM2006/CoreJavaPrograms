//sum of n natural numbers

package practice;
import java.util.Scanner;
public class Prct_forlp {

	public static void main(String[] args) {
		Scanner Scan =new Scanner(System.in);
		System.out.println("enter the values:");
		int n=Scan.nextInt();
		int sum=0;
		for (int i=1;i<=n;i++) {
			sum =sum+i;
		}
		System.out.println("the sum of n natural numbers:"+sum);
	
	}

}
