//Runtime polymorphism(Method overriding)->Same method name, same parameters — defined in both parent and child classes.

package polymorphism;

class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}
class cat extends Animal{
	@Override
	void sound() {
		System.out.println("Cat meows");
	}
	
	
}
public class MethodOverriding {

	public static void main(String[] args) {
		Animal A=new cat(); // Reference of parent, object of child        
		A.sound(); // Calls Cat's sound() at runtime
		

	}

}
