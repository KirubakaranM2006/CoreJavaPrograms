//Definition: Refers to converting a subclass type to a superclass type.
//Occurs in: Object-oriented programming (OOP), especially in Java

package upcasting_Downcasting;

class A{
	
	void disp() {
		System.out.println("Hii this from disp");
	}
}

class B extends A{
	
	void show() {
		System.out.println("Hii this from show");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		A obj=new B();//upcasting
		obj.disp();
		B obj1=(B)obj;//DownCasting
		obj1.show();//Downcasting means converting a superclass reference back to a subclass reference.

	}

}
