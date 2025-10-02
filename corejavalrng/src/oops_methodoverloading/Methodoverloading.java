//Method Overloading means creating multiple methods with the same name but different parameters in the same class

package oops_methodoverloading;

public class Methodoverloading {
	void Sum(int a,int b) {//same function->different parameter
		int sum=a+b;
		System.out.println("Sum is:"+sum);
			}
	void Sum(int a,int b,int c) {//same function ->different parameter
		int sum=a+b+c;
		System.out.println("Sum is:"+sum);
			}
	

	public static void main(String[] args) {
		Methodoverloading k=new Methodoverloading();
		k.Sum(5,5);//passing values to parameters
		k.Sum(5,5,5);//passing values to parameters
		
		
		
		
	}

}
//if we give same (function) and same (parameters)-> compiler will show error 
//so change the (parameter) ->it is the methodoverloading