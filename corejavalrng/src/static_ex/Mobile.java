//obj can also created in staic but without creating obj is best this is just for knowledge65
package static_ex;

public class Mobile {
	String Brand;
	int price;
	static String name;//this shares and affect all the object
	
	void display() {
		System.out.println(Brand+":"+price+":"+name);
	}

	public static void main(String[] args) {
		Mobile m1=new Mobile();
		m1.Brand="Samsung";
		m1.price=125000;
		m1.name="Smartphone";
		
		Mobile m2=new Mobile();
		m2.Brand="Vivo";
		m2.price=70000;
		m1.name="Smartphone";
		
		m1.name="Phone";//changed and affect names which is shared as static variable
		m1.display();
		m2.display();
		

	}

}
