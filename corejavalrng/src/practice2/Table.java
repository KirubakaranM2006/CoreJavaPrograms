package practice2;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter the table:");
		int n=Scan.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"x"+n+"="+n*i);
		}
	

	}

}
