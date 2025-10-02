
package lambda_expression;

interface A{
	void disp();//abstract method which should be overriden in subclass,but here onely one abstarct method so we can use lamda expression
}
public class MainClass {

	public static void main(String[] args) {
		A obj=()->{//()-> this the lambda expression 			
			System.out.println("This this display method or function");
			
		};
		obj.disp();
		

	}

}
