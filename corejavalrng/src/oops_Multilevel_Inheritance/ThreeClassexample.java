//one base or super class+ two derived class is called multilevel inheritance
package oops_Multilevel_Inheritance;

class A{
	int one=1;//super or base class
}
class B extends A{//class B have all properties of A(it has int one,and int two)
	int two=2;//derived class
}
class C extends B{//class C have all properties of B and Aclass hence(three,two,one it has values)
	int three=3;//derived class
}

public class ThreeClassexample {

	public static void main(String[] args) {
		C obj1=new C();//class c can access all the three A,B,C classes
		System.out.println(obj1.three);
		System.out.println(obj1.two);
		System.out.println(obj1.one);
		

	}

}
