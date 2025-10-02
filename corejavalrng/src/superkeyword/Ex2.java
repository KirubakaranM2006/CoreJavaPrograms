package superkeyword;


class animal{
	String cat= "persioncat";
	String age="2mon";
	void eat() {
		System.out.println("All the animals are eating");
	}
}
class cat extends animal{
	void meow() {
		super.eat();
		System.out.println("The Cat age is:"+super.age);//call the parrent class instance variable using super keyword we cant able to call at main function like obj
		System.out.println("Cat meos");
		
	}
	
	
}
class dog extends cat{
	void bark(){
		super.eat();
		System.out.println("Dog barks");
	}
}
public class Ex2 {

	public static void main(String[] args) {
		dog d=new dog();
		d.bark();
		d.meow();
		System.out.println("The Cat name is:"+d.cat);
		
	

	}

}
