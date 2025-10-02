package oops_Multilevel_Inheritance;

class Animal{
	void eat() {
		System.out.println("Animal can eat:");
		
		}
}
class Dog extends Animal{//dog class can access animal class,Dog class
	void barks() {
		System.out.println("Dog barks:");
	}
}
class puppy extends Dog{//puppy class can access  Puppy class,Dog class,Animal class
	void weeps() {
		System.out.println("Puppy weeps:");
	}
}

public class Zclass {

	public static void main(String[] args) {
		puppy k=new puppy(); //puppy class can access all properties of Dogclass and Animal class
		k.weeps();
		k.barks();
		k.eat();
		
		
		
	}

}

