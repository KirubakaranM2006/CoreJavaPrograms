package array;
import java.util.Scanner;
public class Array1d_forloop {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the values:");
		int[]marks=new int[5];
		for(int i=1;i<=4;i++) {//for storing values in array
			marks[i]=Scan.nextInt();
		
		}
		System.out.println("The Array Values:");
		for(int i=1;i<=4;i++) {//for display values in array
			
			System.out.println(marks[i]);
			
		}
	}

}
//similar program in practice2 package