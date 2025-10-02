package Return;

public class Returnkeyword2 {
	String getname() {
		return "kirubakaran";//this retrrn goes to k.getname();1
	}
	String getphone() {
		return "vivo";//this return goes to k.getphone();2
		
	}
	String getaddress() {
		return "Puducherry";//this return goes to k.getaddress();3
		
		
	}

	public static void main(String[] args) {
		Returnkeyword2 k=new Returnkeyword2();
		k.getname();//1
		k.getphone();//2 directly in print statement
		String l=k.getaddress();//3 we can print directly or by assigning any variable also
		System.out.println(k.getname());
		System.out.println(k.getphone());
		System.out.println(l);

	}

}
