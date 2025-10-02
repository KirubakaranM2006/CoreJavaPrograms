
package oops_constructor;


class animal{
	int a=12;
	String name="Lion";
	String dob= "11.2.2022";
	animal() {
		System.out.println("THE KING OF JUNGLE:"+name);
		
	}
	
}
class dog extends animal{
	public dog() {//if we give dog ctrl+space we get like this constructor,we can use dog() without mentioning access modifiers(public)
		System.out.println("The dog barks:");
	}
	
}
class cat extends dog{
	public cat(String a) {
		System.out.println(a);
		// TODO Auto-generated constructor stub
	}
}



public class Ex {

	public static void main(String[] args) {
		cat c =new cat("Persian cat");
		

	}

}//o/p       //even i created obj for cat it printed parentclass constructor becoz parent class constructor will be called 1st
//THE KING OF JUNGLE:Lion-> becoz 1st parent class constructor will be called(animal),next(dog),cat
//The dog barks:
//Persian cat

//In Java, when you create an object of a subclass, constructors of all its parent classes are automatically called first,
//starting from the topmost superclass down to the current class