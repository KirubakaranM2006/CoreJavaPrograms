//(1)baseclass or supperclass + (1)derived class is called->Single Inheritance

package oops_singleinheritance;

class animal{//base class or supper class
	void eat() {
		System.out.println("Animal searched for food and was Hungry");
	}
}
class dog extends animal{//derived class
	void barks() {
		System.out.println("Dog barks");
	}
}


public class Qclass {

	public static void main(String[] args) {
		dog k1=new dog();
		k1.eat();//using single object i can call another class only in inheritance
		k1.barks();
	
		

	}

}
