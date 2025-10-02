//example of return and also about funtions

package oop_functions_or_method;

public class Find {
	String Evenodd(int num) {
		if (num%2==0){
			return "Even";
			
		}
		else {
			return "Odd";
		}
		
	}

	public static void main(String[] args) {
		Find k=new Find();
		k.Evenodd(20);
		System.out.println(k.Evenodd(20));
		
		
		
	}

}
