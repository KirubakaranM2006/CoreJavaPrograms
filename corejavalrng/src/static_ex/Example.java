//used to access without object so that static is used

package static_ex;

public class Example {
	static int num=10;//static variable
	static void show() {//static function 
		System.out.println("The value of num:"+num);
	}

	public static void main(String[] args) {
		Example.show();//without creating object
		
	}

}
