//thread means

package multiplethreads;

class A extends Thread{//class A as become thread
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hi");
		}
		
	}
}
class B extends Thread{//class B as become thread
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println("Hello");
		}
		
	}
}



public class EXdemo1 {

	public static void main(String[] args) {
		A obj1=new A();
		B obj2=new B();
		
		obj1.start();//start compulsory it calls the run method
		obj2.start();//start compulsory it calls the run method
		
		

	}

}
//output may not same becoz print parallely (which is like multitasking)
//OUTPUT:
//   Hi
//   Hi
//   Hi
//   Hi
//   Hi
//   Hi
//   Hi
//   Hi
//   Hi
//   Hello
//   Hello
//   Hello
//   Hello
//   Hello
//   Hello
//   Hello
//   Hello
//   Hello
//   Hi
//   Hello
