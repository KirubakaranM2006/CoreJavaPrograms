package static_ex;


class animal{
	static int variable=13;
	static {
		int a =10;
		System.out.println("This is from static block 1st executor");
	}
	static void cat() {
		System.out.println("Cat meow");
	}
	
	
}
public class NewEx {

	public static void main(String[] args) {
		animal.cat();
		System.out.println(animal.variable);
		

	}

}
