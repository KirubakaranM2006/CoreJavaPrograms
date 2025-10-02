//in final method we cant able to override if we use final method
//but note it you cant able to inherits the final class
package finaldemo;
class A{
	final void disp() {//final method
		System.out.println("class A");
	}
}
class B extends A{//single inheritance as classB has all property of class A
	//cant able to @override void disp() becoz ,used final method 
}
public class Finalmethod {

	public static void main(String[] args) {
		B obj =new B();
		obj.disp();
		


	}

}
