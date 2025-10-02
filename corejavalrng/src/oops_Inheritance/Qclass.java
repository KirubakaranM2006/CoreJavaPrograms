//single inheritance
package oops_Inheritance;

class animal{
 String w="King";
}
class animal2 extends animal{
	String l="Lion";
}

public class Qclass {

	public static void main(String[] args) {
		animal2 k=new animal2();
		System.out.println(k.l+"  "+k.w);
		
		


	}

}
//class animal2 accesses the animal using inheritance