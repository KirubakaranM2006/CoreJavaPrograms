//while coming into the concept static block{} thiss block will be 1st executed//then the main function executed
package static_ex;

public class Demo {
	static int num;
	static{//this is 1st executed
		System.out.println("static block is executed:");
		num=20;
	}
	static void show() {
		System.out.println("The value of the number:"+num);//it is declared in staticmethod via static block in same class so it can be accessed dont make it confuse 
	}

	public static void main(String[] args) {
		Demo.show();//accessing the static function's show()function
		
		

	}

}
