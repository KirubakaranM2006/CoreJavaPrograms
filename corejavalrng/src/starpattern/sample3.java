package starpattern;

public class sample3 {
	public static void main(String[] args) {
		String str="COMPUTER";
		for(int i=1;i<=8;i++) {
			for(int j=i;j<=str.length();j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
