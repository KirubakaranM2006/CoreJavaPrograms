//sum of array by getting values from user by Scanner

package practice2;
import java.util.Scanner;

public class Array1dprtc {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		
		int[]number=new int[5];
		System.out.println("Enter the values:");
		number[0]=Scan.nextInt();
		number[1]=Scan.nextInt();
		number[2]=Scan.nextInt();
		number[3]=Scan.nextInt();
		number[4]=Scan.nextInt();
		int k=number[0]+number[1]+number[2]+number[3]+number[4];
		System.out.println("sum of array is :"+k);
		
	}

}
