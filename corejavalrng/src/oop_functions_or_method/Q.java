//Create a function called sum,send two number from the main functions and add these numbers using functions and print it also cfretae functions like mult,div,sub

package oop_functions_or_method;

  
 

public class Q {
	void getsum(int a,int b)//parameters->passed value from the main functions int a=10,b=10
	{
		int sum=a+b;
		System.out.println("Sum is "+sum);	
	}
	void getsubt(int a,int b)//parameters->passed value from the main functions int a=12,b=10
	{
		int subtract=a-b;
		System.out.println(subtract);
	}
	void getmult(int a,int b) //parameters->passed value from the main functions int a=10,b=10
	  {
		int mult=a*b;
		System.out.println(mult);
		}
	
		void getdiv(int a,int b) //parameters->passed value from the main functions int a=1=,b=2
		{
			int division=a/b;
			System.out.println(division);
	}

	public static void main(String[] args) {
		Q k=new Q();
		k.getsum(10,10);           //passing values to the parameters
		k.getsubt(12,10);          //passing values to the parameters
		k.getmult(10,10);          //passing values to the parameters
		k.getdiv(10, 2);            //passing values to the parameters
	

	}

}
