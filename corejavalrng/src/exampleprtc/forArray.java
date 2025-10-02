package exampleprtc;

import java.util.Scanner;

public class forArray {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		int[]num=new int[10];
		System.out.println("Enter the array:");
		for(int i=0;i<5;i++) {
			num[i]=Scan.nextInt();
			
			
			
		}
		System.out.println("Entered array are:");
		for(int i=0;i<5;i++) {
			System.out.println(+num[i]);
			
			
		}
		

	}

}
